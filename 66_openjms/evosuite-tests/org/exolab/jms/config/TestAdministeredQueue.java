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
import org.exolab.castor.util.NestedIOException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.AdministeredQueue;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoSuiteRunner.class)
public class TestAdministeredQueue {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AdministeredQueue administeredQueue0 = new AdministeredQueue();
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      try {
        administeredQueue0.marshal((ContentHandler) xMLReaderAdapter0);
        fail("Expecting exception: NestedIOException");
      } catch(NestedIOException e) {
        /*
         * System property org.xml.sax.parser not specified
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AdministeredQueue administeredQueue0 = new AdministeredQueue();
      administeredQueue0.setName("");
      assertEquals("", administeredQueue0.getName());
  }

  @Test
  public void test2()  throws Throwable  {
      AdministeredQueue administeredQueue0 = new AdministeredQueue();
      boolean boolean0 = administeredQueue0.isValid();
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      AdministeredQueue administeredQueue0 = new AdministeredQueue();
      // Undeclared exception!
      try {
        administeredQueue0.marshal((Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'out' is null.
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      try {
        AdministeredQueue.unmarshal((Reader) null);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * 
         */
      }
  }
}