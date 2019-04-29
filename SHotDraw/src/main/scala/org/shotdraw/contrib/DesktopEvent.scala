/*
 * @(#)DesktopEvent.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.shotdraw.contrib

import org.shotdraw.framework.DrawingView
import java.util.EventObject

/**
 * @author  C.L.Gilbert <dnoyeb@users.sourceforge.net>
 * @version <$CURRENT_VERSION$>
 */
class DesktopEvent(newSource: Desktop, var myDrawingView: DrawingView, var myPreviousDrawingView: DrawingView) extends EventObject(newSource) {
  def this(newSource: Desktop, newDrawingView: DrawingView) {
    this(newSource, newDrawingView, null)
  }

  private def setDrawingView(newDrawingView: DrawingView) {
    myDrawingView = newDrawingView
  }

  def getDrawingView: DrawingView = myDrawingView

  private def setPreviousDrawingView(newPreviousDrawingView: DrawingView) {
    myPreviousDrawingView = newPreviousDrawingView
  }

  def getPreviousDrawingView: DrawingView = myPreviousDrawingView
}