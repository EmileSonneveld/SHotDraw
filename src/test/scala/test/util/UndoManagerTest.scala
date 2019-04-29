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

// JUnitDoclet begin import

import org.shotdraw.util.UndoManager
import junit.framework.TestCase

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
 * TestCase UndoManagerTest is generated by
 * JUnitDoclet to hold the tests for UndoManager.
 * @see org.shotdraw.util.UndoManager
 */
class UndoManagerTest(name: String) extends TestCase(name) {

  /**
   * Factory method for instances of the class to be tested.
   */
  def createInstance: UndoManager = {
    new UndoManager
  }

  /**
   * Method setUp is overwriting the framework method to
   * prepare an instance of this TestCase for a single test.
   * It's called from the JUnit framework only.
   */
  override protected def setUp() {
    super.setUp
    undomanager = createInstance
  }

  /**
   * Method tearDown is overwriting the framework method to
   * clean up after each single test of this TestCase.
   * It's called from the JUnit framework only.
   */
  override protected def tearDown() {
    undomanager = null
    super.tearDown
  }

  /**
   * Method testPushUndo is testing pushUndo
   * @see org.shotdraw.util.UndoManager#pushUndo(org.shotdraw.util.Undoable)
   */
  def testPushUndo() {
  }

  /**
   * Method testPushRedo is testing pushRedo
   * @see org.shotdraw.util.UndoManager#pushRedo(org.shotdraw.util.Undoable)
   */
  def testPushRedo() {
  }

  /**
   * Method testIsUndoable is testing isUndoable
   * @see org.shotdraw.util.UndoManager#isUndoable()
   */
  def testIsUndoable() {
  }

  /**
   * Method testIsRedoable is testing isRedoable
   * @see org.shotdraw.util.UndoManager#isRedoable()
   */
  def testIsRedoable() {
  }

  /**
   * Method testGetUndoSize is testing getUndoSize
   * @see org.shotdraw.util.UndoManager#getUndoSize()
   */
  def testGetUndoSize() {
  }

  /**
   * Method testGetRedoSize is testing getRedoSize
   * @see org.shotdraw.util.UndoManager#getRedoSize()
   */
  def testGetRedoSize() {
  }

  /**
   * Method testPopUndo is testing popUndo
   * @see org.shotdraw.util.UndoManager#popUndo()
   */
  def testPopUndo() {
  }

  /**
   * Method testPopRedo is testing popRedo
   * @see org.shotdraw.util.UndoManager#popRedo()
   */
  def testPopRedo() {
  }

  /**
   * Method testClearUndos is testing clearUndos()
   * @see org.shotdraw.util.UndoManager#clearUndos()
   */
  def testClearUndos() {
  }

  /**
   * Method testClearRedos is testing clearRedos()
   * @see org.shotdraw.util.UndoManager#clearRedos()
   */
  def testClearRedos() {
  }

  /**
   * JUnitDoclet moves marker to this method, if there is not match
   * for them in the regenerated code and if the marker is not empty.
   * This way, no test gets lost when regenerating after renaming.
   * <b>Method testVault is supposed to be empty.</b>
   */
  def testVault() {
  }

  private var undomanager: UndoManager = null
}

