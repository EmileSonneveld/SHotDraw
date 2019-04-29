/*
 * @(#)RectangleFigure.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.shotdraw.figures

import java.awt.Graphics
import java.awt.Point
import java.awt.Rectangle

import org.shotdraw.framework.Handle
import org.shotdraw.standard.AbstractFigure
import org.shotdraw.standard.BoxHandleKit
import org.shotdraw.util.StorableInput
import org.shotdraw.util.StorableOutput

/**
 * A rectangle figure.
 *
 * @version <$CURRENT_VERSION$>
 */
class RectangleFigure(origin: Point, corner: Point) extends AbstractFigure {
  private var fDisplayBox: Rectangle = null
  basicDisplayBox(origin, corner)
  def this() {
    this(new Point(0, 0), new Point(0, 0))
  }

  def basicDisplayBox(origin: Point, corner: Point) {
    fDisplayBox = new Rectangle(origin)
    fDisplayBox.add(corner)
  }

  def handles: Seq[Handle] = BoxHandleKit.addHandles(this, List())

  def displayBox: Rectangle = new Rectangle(fDisplayBox.x, fDisplayBox.y, fDisplayBox.width, fDisplayBox.height)

  protected def basicMoveBy(x: Int, y: Int) {
    fDisplayBox.translate(x, y)
  }

  override def drawBackground(g: Graphics) {
    val r = displayBox
    g.fillRect(r.x, r.y, r.width, r.height)
  }

  override def drawFrame(g: Graphics) {
    val r = displayBox
    g.drawRect(r.x, r.y, r.width - 1, r.height - 1)
  }
  
  override def write(dw: StorableOutput) {
    super.write(dw)
    dw.writeInt(fDisplayBox.x)
    dw.writeInt(fDisplayBox.y)
    dw.writeInt(fDisplayBox.width)
    dw.writeInt(fDisplayBox.height)
  }

  override def read(dr: StorableInput) {
    super.read(dr)
    fDisplayBox = new Rectangle(dr.readInt, dr.readInt, dr.readInt, dr.readInt)
  }
}

