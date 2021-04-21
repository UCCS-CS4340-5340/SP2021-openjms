/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Enumeration;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.JndiConfiguration;
import org.exolab.jms.config.Property;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;

@RunWith(EvoSuiteRunner.class)
public class TestJndiConfiguration {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      // Undeclared exception!
      try {
        jndiConfiguration0.marshal((ContentHandler) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'handler' is null.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      Property property0 = new Property();
      jndiConfiguration0.addProperty(0, property0);
      assertEquals(1, jndiConfiguration0.getPropertyCount());
      assertEquals(false, jndiConfiguration0.isValid());
  }

  @Test
  public void test2()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      // Undeclared exception!
      try {
        jndiConfiguration0.marshal((Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'out' is null.
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      Enumeration<Object> enumeration0 = jndiConfiguration0.enumerateProperty();
      assertEquals(false, enumeration0.hasMoreElements());
  }

  @Test
  public void test4()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      int int0 = jndiConfiguration0.getPropertyCount();
      assertEquals(0, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      Property property0 = new Property();
      jndiConfiguration0.addProperty(property0);
      Property[] propertyArray0 = jndiConfiguration0.getProperty();
      jndiConfiguration0.setProperty(propertyArray0);
      assertEquals(1, jndiConfiguration0.getPropertyCount());
  }

  @Test
  public void test6()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      boolean boolean0 = jndiConfiguration0.isValid();
      assertEquals(true, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      jndiConfiguration0.clearProperty();
      assertEquals(0, jndiConfiguration0.getPropertyCount());
  }

  @Test
  public void test8()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      Property property0 = new Property();
      boolean boolean0 = jndiConfiguration0.removeProperty(property0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      try {
        jndiConfiguration0.getProperty((-268));
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      try {
        jndiConfiguration0.getProperty(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      try {
        jndiConfiguration0.getProperty(1022);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      Property[] propertyArray0 = jndiConfiguration0.getProperty();
      jndiConfiguration0.setProperty(propertyArray0);
      assertEquals(true, jndiConfiguration0.isValid());
  }

  @Test
  public void test13()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      Property property0 = new Property();
      try {
        jndiConfiguration0.setProperty((-1039), property0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      Property property0 = new Property();
      try {
        jndiConfiguration0.setProperty(0, property0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      JndiConfiguration jndiConfiguration0 = new JndiConfiguration();
      Property property0 = new Property();
      try {
        jndiConfiguration0.setProperty((int) 'j', property0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      try {
        JndiConfiguration.unmarshal((Reader) null);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * 
         */
      }
  }
}