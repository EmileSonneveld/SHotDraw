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
package test

import junit.framework.Test
import junit.framework.TestSuite
import test.contrib.AllTests

/**
 * @author <a href="mailto:mtnygard@charter.net">Michael T. Nygard</a>
 * @version $Revision: 1.3 $
 */
object AllTests {
  def main(args: Array[String]) {
    junit.textui.TestRunner.run(suite)
  }

  def suite: Test = {
    val suite = new TestSuite("Test for org.shotdraw.test")
    suite.addTest(contrib.AllTests.suite)
    suite.addTest(figures.AllTests.suite)
    suite.addTest(framework.AllTests.suite)
    suite.addTest(application.AllTests.suite)
    suite.addTest(standard.AllTests.suite)
    suite.addTest(util.AllTests.suite)
    suite
  }
}


