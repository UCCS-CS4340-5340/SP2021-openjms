/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.plugins.proxygen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.plugins.proxygen.ClassHelper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestClassHelper {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Class<?> class0 = Class.class;
      String string0 = ClassHelper.getPackage(class0);
      assertEquals("java.lang", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      Class<?> class0 = Class.class;
      String string0 = ClassHelper.getQualifiedName(class0);
      assertEquals("java.lang.Class", string0);
  }
}
