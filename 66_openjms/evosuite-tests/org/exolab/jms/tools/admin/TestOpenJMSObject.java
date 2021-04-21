/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Rectangle;
import java.util.NoSuchElementException;
import javax.swing.JTree;
import javax.swing.tree.TreeModel;
import org.exolab.jms.tools.admin.OpenJMSObject;
import org.exolab.jms.tools.admin.OpenJMSTopic;
import org.exolab.jms.tools.admin.OpenJMSUser;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestOpenJMSObject {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JTree jTree0 = new JTree((TreeModel) null);
      OpenJMSUser openJMSUser0 = new OpenJMSUser("}", jTree0);
      assertNotNull(openJMSUser0);
      
      boolean boolean0 = openJMSUser0.getAllowsChildren();
      assertEquals(false, openJMSUser0.isLeaf());
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      OpenJMSTopic openJMSTopic0 = new OpenJMSTopic("dd/MM/yyyy HH:mm:ss", (JTree) null);
      assertNotNull(openJMSTopic0);
      
      // Undeclared exception!
      try {
        openJMSTopic0.displayCommands((Rectangle) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      OpenJMSTopic openJMSTopic0 = new OpenJMSTopic((String) null, (JTree) null);
      assertNotNull(openJMSTopic0);
      
      // Undeclared exception!
      try {
        openJMSTopic0.getLastLeaf();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
        /*
         * node has no children
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      OpenJMSTopic openJMSTopic0 = new OpenJMSTopic((String) null, (JTree) null);
      assertNotNull(openJMSTopic0);
      
      openJMSTopic0.toString();
      assertEquals(false, openJMSTopic0.isLeaf());
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try {
        OpenJMSObject.getInstanceSelected();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      OpenJMSUser openJMSUser0 = new OpenJMSUser("Add Consumer", (JTree) null);
      assertNotNull(openJMSUser0);
      
      // Undeclared exception!
      try {
        openJMSUser0.refresh();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
