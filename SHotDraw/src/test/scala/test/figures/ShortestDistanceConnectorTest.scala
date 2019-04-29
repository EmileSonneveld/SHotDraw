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

import org.shotdraw.figures.ShortestDistanceConnector
import junit.framework.TestCase

// JUnitDoclet begin import
// JUnitDoclet end import
/*
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/
// JUnitDoclet begin javadoc_class
/**
 * TestCase ShortestDistanceConnectorTest is generated by
 * JUnitDoclet to hold the tests for ShortestDistanceConnector.
 * @see org.shotdraw.figures.ShortestDistanceConnector
 */
class ShortestDistanceConnectorTest(name: String) extends TestCase(name) {

  /**
   * Factory method for instances of the class to be tested.
   */
  def createInstance: ShortestDistanceConnector = {
    new ShortestDistanceConnector(null)
  }

  /**
   * Method setUp is overwriting the framework method to
   * prepare an instance of this TestCase for a single test.
   * It's called from the JUnit framework only.
   */
  override protected def setUp() {
    super.setUp
    shortestdistanceconnector = createInstance
  }

  /**
   * Method tearDown is overwriting the framework method to
   * clean up after each single test of this TestCase.
   * It's called from the JUnit framework only.
   */
  override protected def tearDown() {
    shortestdistanceconnector = null
    super.tearDown
  }

  /**
   * Method testFindStart is testing findStart
   * @see org.shotdraw.figures.ShortestDistanceConnector#findStart(org.shotdraw.framework.ConnectionFigure)
   */
  def testFindStart() {
  }

  /**
   * Method testFindEnd is testing findEnd
   * @see org.shotdraw.figures.ShortestDistanceConnector#findEnd(org.shotdraw.framework.ConnectionFigure)
   */
  def testFindEnd() {
  }

  /**
   * JUnitDoclet moves marker to this method, if there is not match
   * for them in the regenerated code and if the marker is not empty.
   * This way, no test gets lost when regenerating after renaming.
   * <b>Method testVault is supposed to be empty.</b>
   */
  def testVault() {
  }

  private var shortestdistanceconnector: ShortestDistanceConnector = null
}
