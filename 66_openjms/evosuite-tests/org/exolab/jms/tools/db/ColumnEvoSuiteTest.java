/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.db;

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
import org.exolab.jms.tools.db.Column;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.DefaultHandler2;

@RunWith(EvoSuiteRunner.class)
public class ColumnEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Column column0 = new Column();
      // Undeclared exception!
      try {
        column0.marshal((Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'out' is null.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Column column0 = new Column();
      DefaultHandler2 defaultHandler2_0 = new DefaultHandler2();
      try {
        column0.marshal((ContentHandler) defaultHandler2_0);
        fail("Expecting exception: NestedIOException");
      } catch(NestedIOException e) {
        /*
         * System property org.xml.sax.parser not specified
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Column column0 = new Column();
      boolean boolean0 = column0.isValid();
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      try {
        Column.unmarshal((Reader) null);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * 
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Column column0 = new Column();
      column0.setName("");
      assertEquals("", column0.getName());
  }
}
