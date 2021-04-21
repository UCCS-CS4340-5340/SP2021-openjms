/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.Writer;
import org.exolab.castor.util.NestedIOException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.HttpsConfiguration;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoSuiteRunner.class)
public class TestHttpsConfiguration {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HttpsConfiguration httpsConfiguration0 = new HttpsConfiguration();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      try {
        httpsConfiguration0.marshal((ContentHandler) xMLFilterImpl0);
        fail("Expecting exception: NestedIOException");
      } catch(NestedIOException e) {
        /*
         * System property org.xml.sax.parser not specified
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      HttpsConfiguration httpsConfiguration0 = new HttpsConfiguration();
      boolean boolean0 = httpsConfiguration0.isValid();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      HttpsConfiguration httpsConfiguration0 = new HttpsConfiguration();
      PipedWriter pipedWriter0 = new PipedWriter();
      try {
        httpsConfiguration0.marshal((Writer) pipedWriter0);
        fail("Expecting exception: ValidationException");
      } catch(ValidationException e) {
        /*
         * port is a required field.
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      FileDescriptor fileDescriptor0 = FileDescriptor.out;
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      InputStreamReader inputStreamReader0 = new InputStreamReader((InputStream) fileInputStream0);
      try {
        HttpsConfiguration.unmarshal((Reader) inputStreamReader0);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * Stream Closed
         */
      }
  }
}