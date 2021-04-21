/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.tools.db.Descriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Descriptor descriptor0 = Descriptor.getDescriptor("REAL");
      assertEquals(7, descriptor0.getType());
  }

  @Test
  public void test1()  throws Throwable  {
      Descriptor descriptor0 = Descriptor.getDescriptor(7);
      assertNotNull(descriptor0);
      
      String string0 = descriptor0.getName();
      assertNotNull(string0);
      assertEquals("REAL", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Descriptor descriptor0 = Descriptor.getDescriptor(7);
      assertNotNull(descriptor0);
      
      int int0 = descriptor0.getType();
      assertEquals(7, int0);
  }
}