/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.AdminConfiguration;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;

@RunWith(EvoSuiteRunner.class)
public class TestAdminConfiguration {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AdminConfiguration adminConfiguration0 = new AdminConfiguration();
      PipedWriter pipedWriter0 = new PipedWriter();
      try {
        adminConfiguration0.marshal((Writer) pipedWriter0);
        fail("Expecting exception: ValidationException");
      } catch(ValidationException e) {
        /*
         * script is a required field.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AdminConfiguration adminConfiguration0 = new AdminConfiguration();
      boolean boolean0 = adminConfiguration0.isValid();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      AdminConfiguration adminConfiguration0 = new AdminConfiguration();
      // Undeclared exception!
      try {
        adminConfiguration0.marshal((ContentHandler) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'handler' is null.
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      AdminConfiguration adminConfiguration0 = new AdminConfiguration();
      adminConfiguration0.setConfig("");
      assertEquals("", adminConfiguration0.getConfig());
  }

  @Test
  public void test4()  throws Throwable  {
      AdminConfiguration adminConfiguration0 = new AdminConfiguration();
      adminConfiguration0.setScript("");
      assertEquals(true, adminConfiguration0.isValid());
  }

  @Test
  public void test5()  throws Throwable  {
      AdminConfiguration adminConfiguration0 = new AdminConfiguration();
      String string0 = adminConfiguration0.getConfig();
      assertNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      try {
        AdminConfiguration.unmarshal((Reader) null);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * 
         */
      }
  }
}
