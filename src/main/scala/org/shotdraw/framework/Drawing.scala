/*
 * @(#)Drawing.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.shotdraw.framework

import org.shotdraw.util._
import java.io.Serializable
import java.awt.Rectangle
import java.awt.Graphics

/**
 * Drawing is a container for figures.
 * <p>
 * Drawing sends out DrawingChanged events to DrawingChangeListeners
 * whenever a part of its area was invalidated.
 * <hr>
 * <b>Design Patterns</b><P>
 * <img src="images/red-ball-small.gif" width=6 height=6 alt=" o ">
 * <b><a href=../pattlets/sld026.htm>Observer</a></b><br>
 * The Observer pattern is used to decouple the Drawing from its views and
 * to enable multiple views.<hr>
 *
 * @see Figure
 * @see DrawingView
 * @see FigureChangeListener
 *
 * @author Wolfram Kaiser
 * @version <$CURRENT_VERSION$>
 */
trait Drawing extends Storable with FigureChangeListener with Serializable {
  /**
   * Releases the drawing and its contained figures.
   */
  def release()

  /**
   * Returns an enumeration to iterate in
   * Z-order back to front over the figures.
   */
  def figures: Seq[Figure]

  /**
   * Returns an enumeration to iterate in
   * Z-order back to front over the figures
   * that lie within the absolute bounds.
   */
  def figures(viewRectangle: Rectangle): Seq[Figure]

  /**
   * Returns an enumeration to iterate in
   * Z-order front to back over the figures.
   */
  def figuresReverse: Seq[Figure]

  /**
   * Finds a top level Figure. Use this call for hit detection that
   * should not descend into the figure's children.
   */
  def findFigure(x: Int, y: Int): Figure

  /**
   * Finds a top level Figure that intersects the given rectangle.
   */
  def findFigure(r: Rectangle): Figure

  /**
   * Finds a top level Figure, but supresses the passed
   * in figure. Use this method to ignore a figure
   * that is temporarily inserted into the drawing.
   * @param x the x coordinate
   * @param y the y coordinate
   * @param without the figure to be ignored during
   *                the find.
   */
  def findFigureWithout(x: Int, y: Int, without: Figure): Figure

  /**
   * Finds a top level Figure that intersects the given rectangle.
   * It supresses the passed
   * in figure. Use this method to ignore a figure
   * that is temporarily inserted into the drawing.
   */
  def findFigure(r: Rectangle, without: Figure): Figure

  /**
   * Finds a figure but descends into a figure's
   * children. Use this method to implement <i>click-through</i>
   * hit detection, that is, you want to detect the inner most
   * figure containing the given point.
   */
  def findFigureInside(x: Int, y: Int): Figure

  /**
   * Finds a figure but descends into a figure's
   * children. It supresses the passed
   * in figure. Use this method to ignore a figure
   * that is temporarily inserted into the drawing.
   * @param x the x coordinate
   * @param y the y coordinate
   * @param without the figure to be ignored during
   *                the find.
   */
  def findFigureInsideWithout(x: Int, y: Int, without: Figure): Figure

  /**
   * Checks if the composite figure has the argument as one of
   * its children.
   *
   * @param figure figure to be searched in all descendants
   * @return true if the figure is part of this Drawing, else otherwise
   */
  def includes(figure: Figure): Boolean

  /**
   * Check whether a given figure is a (direct) child figure of this CompositeFigure.
   *
   * @param figure figure to be searched in all direct descendents
   * @return true if the figure is a direct child of this Drawing, else otherwise
   */
  def containsFigure(figure: Figure): Boolean

  /**
   * Adds a listener for this drawing.
   */
  def addDrawingChangeListener(listener: DrawingChangeListener)

  /**
   * Removes a listener from this drawing.
   */
  def removeDrawingChangeListener(listener: DrawingChangeListener)

  /**
   * Gets the listeners of a drawing.
   *
   * @return new iterator of all registered change listener
   */
  def drawingChangeListeners: Iterator[DrawingChangeListener]

  /**
   * Adds a figure and sets its container to refer to this drawing.
   *
   * @param figure to be added to the drawing
   * @return the figure that was inserted (might be different from the figure specified).
   */
  def add(figure: Figure): Figure

  /**
   * Adds a list of figures.
   *
   * @deprecated use addAll(Seq[Figure]) instead
   */
  def addAll(newFigures: List[Figure])

  /**
   * Adds a Seq[Figure] of figures.
   *
   * @param fe (unused) enumeration containing all figures to be added
   * @see #add
   */
  def addAll(fe: Seq[Figure])

  /**
   * Removes the figure from the drawing and releases it.
   *
   * @param figure that is part of the drawing and should be removed
   * @return the figure that has been removed (might be different from the figure specified)
   */
  def remove(figure: Figure): Figure

  /**
   * Removes a figure from the figure list, but
   * doesn't release it. Use this method to temporarily
   * manipulate a figure outside of the drawing.
   *
   * @param figure that is part of the drawing and should be added
   */
  def orphan(figure: Figure): Figure

  /**
   * Removes a list of figures from the figure's list
   * without releasing the figures.
   *
   * @see #orphan
   * @deprecated use orphanAll(Seq[Figure]) instead
   */
  def orphanAll(orphanFigures: List[Figure])

  /**
   * Removes a Seq[Figure] of figures from the figure's list
   * without releasing the figures.
   * @see #orphan
   */
  def orphanAll(fe: Seq[Figure])

  /**
   * Removes a list of figures .
   *
   * @see #remove()
   * @deprecated use removeAll(Seq[Figure]) instead
   */
  def removeAll(figures: List[Figure])

  /**
   * Removes a Seq[Figure] of figures.
   * @see #remove()
   */
  def removeAll(fe: Seq[Figure])

  /**
   * Replaces a figure in the drawing without removing it from the drawing.
   * The figure to be replaced must be part of the drawing.
   *
   * @param figure figure to be replaced
   * @param replacement figure that should replace the specified figure
   * @return the figure that has been inserted (might be different from the figure specified)
   */
  def replace(figure: Figure, replacement: Figure): Figure

  /**
   * Sends a figure to the back of the drawing.
   *
   * @param figure that is part of the drawing
   */
  def sendToBack(figure: Figure)

  /**
   * Brings a figure to the front.
   *
   * @param figure that is part of the drawing
   */
  def bringToFront(figure: Figure)

  /**
   * Sends a figure to a certain layer within a drawing. Each figure
   * lays in a unique layer and the layering order decides which
   * figure is drawn on top of another figure. Figures with a higher
   * layer number have usually been added later and may overlay
   * figures in lower layers. Layers are counted from to (the number
   * of figures - 1).
   * The figure is removed from its current layer (if it has been already
   * part of this drawing) and is transferred to the specified layers after
   * all figures between the original layer and the new layer are shifted to
   * one layer below to fill the layer sequence. It is not possible to skip a
   * layer number and if the figure is sent to a layer beyond the latest layer
   * it will be added as the last figure to the drawing and its layer number
   * will be set to the be the one beyond the latest layer so far.
   *
   * @param figure figure to be sent to a certain layer
   * @param layerNr target layer of the figure
   */
  def sendToLayer(figure: Figure, layerNr: Int)

  /**
   * Gets the layer for a certain figure (first occurrence). The number
   * returned is the number of the layer in which the figure is placed.
   *
   * @param figure figure to be queried for its layering place
   * @return number of the layer in which the figure is placed and -1 if the
   *         figure could not be found.
   * @see #sendToLayer
   */
  def getLayer(figure: Figure): Int

  /**
   * Gets the figure from a certain layer.
   *
   * @param layerNr number of the layer which figure should be returned
   * @return figure from the layer specified, null, if the layer nr was outside
   *         the number of possible layer (0...(number of figures - 1))
   * @see #sendToLayer
   */
  def getFigureFromLayer(layerNr: Int): Figure

  /**
   * Draws all the figures back to front.
   */
  def draw(g: Graphics)

  /**
   * Draws only the given figures.
   */
  def draw(g: Graphics, fe: Seq[Figure])

  /**
   * Acquires the drawing lock.
   */
  def lock()

  /**
   * Releases the drawing lock.
   */
  def unlock()

  /**
   * Used to optimize rendering.  Rendering of many objects may
   * be slow until this method is called.  The view rectangle
   * should at least approximately enclose the CompositeFigure.
   * If the view rectangle is too small or too large, performance
   * may suffer.
   */
  def init(viewRectangle: Rectangle)

  def getTitle: String

  def setTitle(name: String)
}

