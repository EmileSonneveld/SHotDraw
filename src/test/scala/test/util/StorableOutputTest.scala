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

import java.io.File
import java.io.FileOutputStream
import org.shotdraw.util.StorableOutput
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
 * TestCase StorableOutputTest is generated by
 * JUnitDoclet to hold the tests for StorableOutput.
 * @see org.shotdraw.util.StorableOutput
 */
class StorableOutputTest(name: String) extends TestCase(name) {

  /**
   * Factory method for instances of the class to be tested.
   */
  def createInstance: StorableOutput = {
    val tempFile = File.createTempFile("StorableOutputTest", "dat")
    val stream = new FileOutputStream(tempFile)
    tempFile.deleteOnExit
    new StorableOutput(stream)
  }

  /**
   * Method setUp is overwriting the framework method to
   * prepare an instance of this TestCase for a single test.
   * It's called from the JUnit framework only.
   */
  override protected def setUp() {
    super.setUp
    storableoutput = createInstance
  }

  /**
   * Method tearDown is overwriting the framework method to
   * clean up after each single test of this TestCase.
   * It's called from the JUnit framework only.
   */
  override protected def tearDown() {
    storableoutput = null
    super.tearDown
  }

  /**
   * Method testWriteStorable is testing writeStorable
   * @see org.shotdraw.util.StorableOutput#writeStorable(org.shotdraw.util.Storable)
   */
  def testWriteStorable() {
  }

  /**
   * Method testWriteInt is testing writeInt
   * @see org.shotdraw.util.StorableOutput#writeInt(int)
   */
  def testWriteInt() {
  }

  /**
   * Method testWriteLong is testing writeLong
   * @see org.shotdraw.util.StorableOutput#writeLong(long)
   */
  def testWriteLong() {
  }

  /**
   * Method testWriteColor is testing writeColor
   * @see org.shotdraw.util.StorableOutput#writeColor(java.awt.Color)
   */
  def testWriteColor() {
  }

  /**
   * Method testWriteDouble is testing writeDouble
   * @see org.shotdraw.util.StorableOutput#writeDouble(double)
   */
  def testWriteDouble() {
  }

  /**
   * Method testWriteBoolean is testing writeBoolean
   * @see org.shotdraw.util.StorableOutput#writeBoolean(boolean)
   */
  def testWriteBoolean() {
  }

  /**
   * Method testWriteString is testing writeString
   * @see org.shotdraw.util.StorableOutput#writeString(java.lang.String)
   */
  def testWriteString() {
  }

  /**
   * Method testClose is testing close()
   * @see org.shotdraw.util.StorableOutput#close()
   */
  def testClose() {
  }

  /**
   * JUnitDoclet moves marker to this method, if there is not match
   * for them in the regenerated code and if the marker is not empty.
   * This way, no test gets lost when regenerating after renaming.
   * <b>Method testVault is supposed to be empty.</b>
   */
  def testVault() {
  }

  private var storableoutput: StorableOutput = null
}

