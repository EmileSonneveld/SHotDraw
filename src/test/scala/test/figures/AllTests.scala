/*
 * @(#)Test.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package test.figures

import junit.framework.Test
import junit.framework.TestSuite

/**
 * @author <a href="mailto:mtnygard@charter.net">Michael T. Nygard</a>
 * @version $Revision: 1.3 $
 */
object AllTests {
  def main(args: Array[String]) {
    junit.textui.TestRunner.run(suite)
  }

  def suite: Test = {
    val suite = new TestSuite("Test for org.shotdraw.test.figures")
    suite.addTest(new TestSuite(classOf[ArrowTipTest]))
    suite.addTest(new TestSuite(classOf[ChopEllipseConnectorTest]))
    suite.addTest(new TestSuite(classOf[ElbowConnectionTest]))
    suite.addTest(new TestSuite(classOf[EllipseFigureTest]))
    suite.addTest(new TestSuite(classOf[GroupFigureTest]))
    suite.addTest(new TestSuite(classOf[LineConnectionTest]))
    suite.addTest(new TestSuite(classOf[LineFigureTest]))
    suite.addTest(new TestSuite(classOf[PolyLineFigureTest]))
    suite.addTest(new TestSuite(classOf[RectangleFigureTest]))
    suite.addTest(new TestSuite(classOf[RoundRectangleFigureTest]))
    suite.addTest(new TestSuite(classOf[ShortestDistanceConnectorTest]))
    suite.addTest(new TestSuite(classOf[TextFigureTest]))
    suite
  }
}


