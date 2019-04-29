/*
 * @(#)ConnectionFigure.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.shotdraw.framework

import java.awt.Point

/**
 * Figures to connect Connectors provided by Figures.
 * A ConnectionFigure knows its start and end Connector.
 * It uses the Connectors to locate its connection points.<p>
 * A ConnectionFigure can have multiple segments. It provides
 * operations to split and join segments.
 *
 * <hr>
 * <b>Design Patterns</b><P>
 * <img src="images/red-ball-small.gif" width=6 height=6 alt=" o ">
 * <b><a href=../pattlets/sld034.htm>Strategy</a></b><br>
 * Strategy is used encapsulate the algorithm to locate the connection point.
 * ConnectionFigure is the Strategy context and Connector is the Strategy.<br>
 * <img src="images/red-ball-small.gif" width=6 height=6 alt=" o ">
 * <b><a href=../pattlets/sld026.htm>Observer</a></b><br>
 * Observer is used to track changes of the connected figures. A connection
 * figure registers itself as listeners or observers of the source and
 * target connector.
 * <hr>
 *
 * @see Connector
 *
 * @version <$CURRENT_VERSION$>
 */
trait ConnectionFigure extends Figure with FigureChangeListener {
  /**
   * Sets the start Connector of the connection.
   * @param start the start connector of the connection
   */
  def connectStart(start: Connector)

  /**
   * Sets the end Connector of the connection.
   * @param end the end connector of the connection
   */
  def connectEnd(end: Connector)

  /**
   * Updates the connection
   */
  def updateConnection()

  /**
   * Disconnects the start figure from the dependent figure
   */
  def disconnectStart()

  /**
   * Disconnects the end figure from the dependent figure
   */
  def disconnectEnd()

  /**
   * Gets the start Connector
   */
  def getStartConnector: Connector

  /**
   * Gets the end Connector.
   */
  def getEndConnector: Connector

  /**
   * Checks if two figures can be connected. Implement this method
   * to constrain the allowed connections between figures.
   */
  def canConnect(start: Figure, end: Figure): Boolean

  /**
   * Checks if the ConnectionFigure connects the same figures.
   */
  def connectsSame(other: ConnectionFigure): Boolean

  /**
   * Sets the start point.
   */
  def startPoint(x: Int, y: Int)

  /**
   * Sets the end point.
   */
  def endPoint(x: Int, y: Int)

  /**
   * Gets the start point.
   */
  def startPoint: Point

  /**
   * Gets the end point.
   */
  def endPoint: Point

  /**
   * Sets the position of the point at the given position
   */
  def setPointAt(p: Point, index: Int)

  /**
   * Gets the Point at the given position
   */
  def pointAt(index: Int): Point

  /**
   * Gets the number of points or nodes of the connection
   */
  def pointCount: Int

  /**
   * Splits the hit segment.
   * @param x the x position where the figure should be split
   * @param y the y position where the figure should be split
   * @return the index of the splitting point
   */
  def splitSegment(x: Int, y: Int): Int

  /**
   * Joins the hit segments.
   * @param x the position where the figure should be joined.
   * @param y the position where the figure should be joined.
   * @return whether the segment was joined
   */
  def joinSegments(x: Int, y: Int): Boolean

  /**
   * Gets the start figure of the connection.
   */
  def startFigure: Figure

  /**
   * Gets the end figure of the connection.
   */
  def endFigure: Figure
}

