/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.config.Connector;
import org.exolab.jms.config.JndiConfigurationFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestJndiConfigurationFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JndiConfigurationFactory jndiConfigurationFactory0 = new JndiConfigurationFactory();
      assertNotNull(jndiConfigurationFactory0);
  }

  @Test
  public void test1()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        JndiConfigurationFactory.create(configuration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        JndiConfigurationFactory.create((Configuration) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument config is null
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Connector connector0 = new Connector();
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        JndiConfigurationFactory.create(connector0, configuration0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'scheme' is null
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      // Undeclared exception!
      try {
        JndiConfigurationFactory.create((Connector) null, configuration0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument connector is null
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Connector connector0 = new Connector();
      // Undeclared exception!
      try {
        JndiConfigurationFactory.create(connector0, (Configuration) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument config is null
         */
      }
  }
}
