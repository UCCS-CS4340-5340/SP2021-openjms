/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.PipedReader;
import java.io.Reader;
import java.io.Writer;
import org.exolab.castor.util.NestedIOException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.User;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoSuiteRunner.class)
public class TestUser {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      User user0 = new User();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl((XMLReader) null);
      try {
        user0.marshal((ContentHandler) xMLFilterImpl0);
        fail("Expecting exception: NestedIOException");
      } catch(NestedIOException e) {
        /*
         * System property org.xml.sax.parser not specified
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      User user0 = new User();
      user0.setPassword("");
      assertNull(user0.getName());
  }

  @Test
  public void test2()  throws Throwable  {
      User user0 = new User();
      boolean boolean0 = user0.isValid();
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      User user0 = new User();
      user0.setName("");
      assertEquals("", user0.getName());
  }

  @Test
  public void test4()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getPassword();
      assertNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      User user0 = new User();
      // Undeclared exception!
      try {
        user0.marshal((Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'out' is null.
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      try {
        User.unmarshal((Reader) pipedReader0);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * Pipe not connected
         */
      }
  }
}
