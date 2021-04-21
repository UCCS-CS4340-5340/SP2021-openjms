/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.common.uuid;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.common.uuid.UUIDGenerator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UUIDGeneratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      try {
        UUIDGenerator.toBytes("", "c!r:ciS");
        fail("Expecting exception: UUIDGenerator.InvalidIDException");
      } catch(UUIDGenerator.InvalidIDException e) {
        /*
         * character ! encountered, expected hexadecimal digit in identifier c!r:ciS
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        UUIDGenerator.toBytes("a", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument identifier is null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      try {
        UUIDGenerator.toBytes("dFN`E");
        fail("Expecting exception: UUIDGenerator.InvalidIDException");
      } catch(UUIDGenerator.InvalidIDException e) {
        /*
         * character N encountered, expected hexadecimal digit in identifier dFN`E
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        UUIDGenerator.toBytes((String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument identifier is null
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      try {
        UUIDGenerator.toBytes("*vxcYZWI");
        fail("Expecting exception: UUIDGenerator.InvalidIDException");
      } catch(UUIDGenerator.InvalidIDException e) {
        /*
         * character * encountered, expected hexadecimal digit in identifier *vxcYZWI
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      try {
        UUIDGenerator.toBytes("Exception while trying to find configuration file ");
        fail("Expecting exception: UUIDGenerator.InvalidIDException");
      } catch(UUIDGenerator.InvalidIDException e) {
        /*
         * character x encountered, expected hexadecimal digit in identifier Exception while trying to find configuration file 
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      try {
        UUIDGenerator.toBytes("tO;P");
        fail("Expecting exception: UUIDGenerator.InvalidIDException");
      } catch(UUIDGenerator.InvalidIDException e) {
        /*
         * character t encountered, expected hexadecimal digit in identifier tO;P
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      String string0 = UUIDGenerator.trim("Did not find '");
      assertEquals("Did not find '", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try {
        UUIDGenerator.trim((String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument identifier is null
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = UUIDGenerator.isLocal(byteArray0);
      assertEquals(false, boolean0);
  }
}