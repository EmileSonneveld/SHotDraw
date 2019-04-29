/*
 * @(#)AutoscrollHelper.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.shotdraw.contrib

import java.awt._

/**
 * A helper class for implementing autoscrolling
 *
 * @author  SourceForge(dnoyeb) aka C.L. Gilbert
 * @version <$CURRENT_VERSION$>
 */
abstract class AutoscrollHelper {
  def this(margin: Int) {
    this()
    autoscrollMargin = margin
  }

  def setAutoscrollMargin(margin: Int) {
    autoscrollMargin = margin
  }

  def getAutoscrollMargin: Int = {
    autoscrollMargin
  }

  /**
   * Override this method to call getSize() on your Component
   * @see Component#getSize
   */
  def getSize: Dimension

  /**
   * Override this method to call getVisibleRect() on your JComponent
   * @see javax.swing.JComponent#getVisibleRect
   */
  def getVisibleRect: Rectangle

  /**
   * Override this method to call scrollRectToVisible(Rectangle aRect) on
   * your component
   * @see javax.swing.JComponent#scrollRectToVisible
   */
  def scrollRectToVisible(aRect: Rectangle)

  /**
   * Part of the autoscrolls interface
   *
   */
  def autoscroll(location: Point) {
    var top = 0
    var left = 0
    var bottom = 0
    var right = 0
    val size = getSize
    val rect = getVisibleRect
    val bottomEdge = rect.y + rect.height
    val rightEdge = rect.x + rect.width
    if (location.y - rect.y <= autoscrollMargin && rect.y > 0) top = autoscrollMargin
    if (location.x - rect.x <= autoscrollMargin && rect.x > 0) left = autoscrollMargin
    if (bottomEdge - location.y <= autoscrollMargin && bottomEdge < size.height) bottom = autoscrollMargin
    if (rightEdge - location.x <= autoscrollMargin && rightEdge < size.width) right = autoscrollMargin
    rect.x += right - left
    rect.y += bottom - top
    scrollRectToVisible(rect)
  }

  def getAutoscrollInsets: Insets = {
    val size = getSize
    val rect = getVisibleRect
    autoscrollInsets.top = rect.y + autoscrollMargin
    autoscrollInsets.left = rect.x + autoscrollMargin
    autoscrollInsets.bottom = size.height - (rect.y + rect.height) + autoscrollMargin
    autoscrollInsets.right = size.width - (rect.x + rect.width) + autoscrollMargin
    autoscrollInsets
  }

  private var autoscrollMargin = 20
  private var autoscrollInsets = new Insets(0, 0, 0, 0)
}