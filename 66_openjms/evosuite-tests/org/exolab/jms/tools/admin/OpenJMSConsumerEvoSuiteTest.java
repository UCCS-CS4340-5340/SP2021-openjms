/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Rectangle;
import javax.swing.JTree;
import org.exolab.jms.tools.admin.OpenJMSConsumer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OpenJMSConsumerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      OpenJMSConsumer openJMSConsumer0 = new OpenJMSConsumer("Bu", (JTree) null);
      openJMSConsumer0.getLeafCount();
      assertEquals(true, openJMSConsumer0.isLeaf());
  }

  @Test
  public void test1()  throws Throwable  {
      OpenJMSConsumer openJMSConsumer0 = new OpenJMSConsumer("Bu", (JTree) null);
      // Undeclared exception!
      try {
        openJMSConsumer0.displayCommands((Rectangle) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      OpenJMSConsumer openJMSConsumer0 = new OpenJMSConsumer("Bu", (JTree) null);
      openJMSConsumer0.createCommands();
      assertEquals(true, openJMSConsumer0.isRoot());
  }

  @Test
  public void test3()  throws Throwable  {
      OpenJMSConsumer openJMSConsumer0 = new OpenJMSConsumer("Bu", (JTree) null);
      String string0 = openJMSConsumer0.toString();
      assertEquals("Bu", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      OpenJMSConsumer openJMSConsumer0 = new OpenJMSConsumer("Bu", (JTree) null);
      boolean boolean0 = openJMSConsumer0.getAllowsChildren();
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      OpenJMSConsumer openJMSConsumer0 = new OpenJMSConsumer("Bu", (JTree) null);
      openJMSConsumer0.update();
      assertEquals(0, openJMSConsumer0.getChildCount());
  }
}
