/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.exolab.jms.tools.admin.CreateLogonDialog;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CreateLogonDialogEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CreateLogonDialog createLogonDialog0 = CreateLogonDialog.instance();
      assertNull(createLogonDialog0);
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        CreateLogonDialog.create((JFrame) null);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }
}
