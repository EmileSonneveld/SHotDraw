/*
 * @(#)FigureSelection.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.shotdraw.standard

import org.shotdraw.framework._
import org.shotdraw.util._
import java.io._

import scala.collection.mutable.ArrayBuffer

/**
 * FigureSelection enables to transfer the selected figures
 * to a clipboard.<p>
 * Will soon be converted to the JDK 1.1 Transferable interface.
 *
 * @see Clipboard
 *
 * @version <$CURRENT_VERSION$>
 */
object StandardFigureSelection {
  def duplicateFigures(toBeCloned: Seq[Figure], figureCount: Int): Seq[Figure] = {
    val duplicater = new StandardFigureSelection(toBeCloned, figureCount)
    duplicater.getData(duplicater.getType).asInstanceOf[Seq[Figure]]
  }

  /**
   * The type identifier of the selection.
   */
  final val TYPE = "org.shotdraw.Figures"
}

class StandardFigureSelection extends FigureSelection with Serializable {
  import StandardFigureSelection._
  private var fData: Array[Byte] = null
  /**
   * Constructes the Figure selection for the Seq[Figure].
   */
  def this(fe: Seq[Figure], figureCount: Int) {
    this()
    val output = new ByteArrayOutputStream(200)
    val writer = new StorableOutput(output)
    writer.writeInt(figureCount)
    fe foreach {
      writer.writeStorable(_)
    }
    writer.close()
    fData = output.toByteArray
  }

  /**
   * Gets the type of the selection.
   */
  def getType: String = TYPE

  /**
   * Gets the data of the selection. The result is returned
   * as a Seq[Figure] of Figures.
   *
   * @return a copy of the figure selection.
   */
  def getData(tpe: String): Seq[Figure] = {
    if (tpe == TYPE) {
      val input = new ByteArrayInputStream(fData)
      var result = ArrayBuffer[Figure]()
      val reader = new StorableInput(input)
      val count = reader.readInt
      for(numRead <- 0 to count-1) {
        try {
          val newFigure = reader.readStorable.asInstanceOf[Figure]
          result += newFigure
        } catch {
          case e: IOException => {
            sys.error(e.toString)
          }
        }
      }
      result
    } else {
      null
    }
  }
}


