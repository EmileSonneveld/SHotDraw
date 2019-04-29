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
package test.util

import org.shotdraw.util.CommandMenu
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
 * TestCase CommandMenuTest is generated by
 * JUnitDoclet to hold the tests for CommandMenu.
 * @see org.shotdraw.util.CommandMenu
 */
class CommandMenuTest(name: String) extends TestCase(name) {


  /**
   * Factory method for instances of the class to be tested.
   */
  def createInstance: CommandMenu = {
    new CommandMenu("TestCommandMenu")
  }

  /**
   * Method setUp is overwriting the framework method to
   * prepare an instance of this TestCase for a single test.
   * It's called from the JUnit framework only.
   */
  override protected def setUp() {
    super.setUp
    commandmenu = createInstance
  }

  /**
   * Method tearDown is overwriting the framework method to
   * clean up after each single test of this TestCase.
   * It's called from the JUnit framework only.
   */
  override protected def tearDown() {
    commandmenu = null
    super.tearDown
  }

  /**
   * Method testAdd is testing add
   * @see org.shotdraw.util.CommandMenu#add(org.shotdraw.util.Command)
   */
  def testAdd() {
  }

  /**
   * Method testAddCheckItem is testing addCheckItem
   * @see org.shotdraw.util.CommandMenu#addCheckItem(org.shotdraw.util.Command)
   */
  def testAddCheckItem() {
  }

  /**
   * Method testRemove is testing remove()
   * @see org.shotdraw.util.CommandMenu#remove(org.shotdraw.util.Command)
   */
  def testRemove() {
  }

  /**
   * Method testEnable is testing enable
   * @see org.shotdraw.util.CommandMenu#enable(java.lang.String, boolean)
   */
  def testEnable() {
  }

  /**
   * Method testCheckEnabled is testing checkEnabled()
   * @see org.shotdraw.util.CommandMenu#checkEnabled()
   */
  def testCheckEnabled() {
  }

  /**
   * Method testActionPerformed is testing actionPerformed
   * @see org.shotdraw.util.CommandMenu#actionPerformed(java.awt.event.ActionEvent)
   */
  def testActionPerformed() {
  }

  /**
   * Method testCommandExecuted is testing commandExecuted
   * @see org.shotdraw.util.CommandMenu#commandExecuted(java.util.EventObject)
   */
  def testCommandExecuted() {
  }

  /**
   * Method testCommandExecutable is testing commandExecutable
   * @see org.shotdraw.util.CommandMenu#commandExecutable(java.util.EventObject)
   */
  def testCommandExecutable() {
  }

  /**
   * Method testCommandNotExecutable is testing commandNotExecutable
   * @see org.shotdraw.util.CommandMenu#commandNotExecutable(java.util.EventObject)
   */
  def testCommandNotExecutable() {
  }

  /**
   * JUnitDoclet moves marker to this method, if there is not match
   * for them in the regenerated code and if the marker is not empty.
   * This way, no test gets lost when regenerating after renaming.
   * <b>Method testVault is supposed to be empty.</b>
   */
  def testVault() {
  }

  private var commandmenu: CommandMenu = null
}

