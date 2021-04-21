/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.config.ConfigHelper;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.config.types.SchemeType;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ConfigHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.HTTP;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getJndiURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.HTTP;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getServerURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.HTTPS;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getAdminURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ConfigHelper configHelper0 = new ConfigHelper();
      assertNotNull(configHelper0);
  }

  @Test
  public void test4()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.TCP;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getServerURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.TCPS;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getServerURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      SchemeType schemeType0 = SchemeType.RMI;
      // Undeclared exception!
      try {
        ConfigHelper.getServerURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.EMBEDDED;
      Configuration configuration0 = new Configuration();
      String string0 = ConfigHelper.getServerURL(schemeType0, configuration0);
      assertEquals("vm:openjms", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.HTTPS;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getServerURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.TCP;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getJndiURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.TCPS;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getJndiURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.EMBEDDED;
      Configuration configuration0 = new Configuration();
      String string0 = ConfigHelper.getJndiURL(schemeType0, configuration0);
      assertEquals("vm:openjms", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.HTTPS;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getJndiURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.RMI;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getJndiURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.TCP;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getAdminURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.TCPS;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getAdminURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.RMI;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getAdminURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.HTTP;
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        ConfigHelper.getAdminURL(schemeType0, configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      SchemeType schemeType0 = SchemeType.EMBEDDED;
      Configuration configuration0 = new Configuration();
      String string0 = ConfigHelper.getAdminURL(schemeType0, configuration0);
      assertEquals("vm:openjms", string0);
  }
}
