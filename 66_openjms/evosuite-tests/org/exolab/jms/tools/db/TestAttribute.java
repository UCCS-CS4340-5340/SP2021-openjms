/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.tools.db.Attribute;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;

@RunWith(EvoSuiteRunner.class)
public class TestAttribute {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      boolean boolean0 = attribute0.hasNotNull();
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      boolean boolean0 = attribute0.getNotNull();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      StringReader stringReader0 = new StringReader("$k+O3w");
      try {
        Attribute.unmarshal((Reader) stringReader0);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * Parsing Error : Content is not allowed in prolog.
         * Line : 1
         * Column : 1
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      attribute0.setUnique(true);
      assertEquals(true, attribute0.hasUnique());
      assertEquals(true, attribute0.getUnique());
  }

  @Test
  public void test4()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      Attribute attribute0 = new Attribute();
      try {
        attribute0.marshal((Writer) pipedWriter0);
        fail("Expecting exception: ValidationException");
      } catch(ValidationException e) {
        /*
         * name is a required field.
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      boolean boolean0 = attribute0.hasPrimaryKey();
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      attribute0.setType("");
      assertEquals(false, attribute0.getUnique());
  }

  @Test
  public void test7()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      String string0 = attribute0.getType();
      assertNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      attribute0.setName("");
      assertNull(attribute0.getType());
  }

  @Test
  public void test9()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      attribute0.deletePrimaryKey();
      assertEquals(false, attribute0.hasPrimaryKey());
  }

  @Test
  public void test10()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      attribute0.deleteNotNull();
      assertEquals(false, attribute0.hasNotNull());
  }

  @Test
  public void test11()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      // Undeclared exception!
      try {
        attribute0.marshal((ContentHandler) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'handler' is null.
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      attribute0.setNotNull(true);
      assertEquals(true, attribute0.getNotNull());
      assertEquals(true, attribute0.hasNotNull());
  }

  @Test
  public void test13()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      attribute0.setPrimaryKey(false);
      assertEquals(true, attribute0.hasPrimaryKey());
  }

  @Test
  public void test14()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      boolean boolean0 = attribute0.getUnique();
      assertEquals(false, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      boolean boolean0 = attribute0.isValid();
      assertEquals(false, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      attribute0.deleteUnique();
      assertEquals(false, attribute0.hasUnique());
  }

  @Test
  public void test17()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      boolean boolean0 = attribute0.getPrimaryKey();
      assertEquals(false, boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      Attribute attribute0 = new Attribute();
      boolean boolean0 = attribute0.hasUnique();
      assertEquals(false, boolean0);
  }
}
