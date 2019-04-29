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
package test.standard

// JUnitDoclet begin import

import junit.framework.TestCase
import org.shotdraw.figures.LineConnection
import org.shotdraw.standard.ChangeConnectionStartHandle

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
 * TestCase ChangeConnectionStartHandleTest is generated by
 * JUnitDoclet to hold the tests for ChangeConnectionStartHandle.
 * @see org.shotdraw.standard.ChangeConnectionStartHandle
 */
class ChangeConnectionStartHandleTest(name: String) extends TestCase(name) {

  /**
   * Factory method for instances of the class to be tested.
   */
  def createInstance: ChangeConnectionStartHandle = {
    new ChangeConnectionStartHandle(new LineConnection)
  }

  /**
   * Method setUp is overwriting the framework method to
   * prepare an instance of this TestCase for a single test.
   * It's called from the JUnit framework only.
   */
  override protected def setUp() {
    super.setUp
    changeconnectionstarthandle = createInstance
  }

  /**
   * Method tearDown is overwriting the framework method to
   * clean up after each single test of this TestCase.
   * It's called from the JUnit framework only.
   */
  override protected def tearDown() {
    changeconnectionstarthandle = null
    super.tearDown
  }

  /**
   * Method testLocate is testing locate
   * @see org.shotdraw.standard.ChangeConnectionStartHandle#locate()
   */
  def testLocate() {
  }

  /**
   * JUnitDoclet moves marker to this method, if there is not match
   * for them in the regenerated code and if the marker is not empty.
   * This way, no test gets lost when regenerating after renaming.
   * <b>Method testVault is supposed to be empty.</b>
   */
  def testVault() {
  }

  private var changeconnectionstarthandle: ChangeConnectionStartHandle = null
}

