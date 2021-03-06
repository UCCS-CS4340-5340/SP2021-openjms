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
import java.util.Enumeration;
import org.exolab.castor.util.NestedIOException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.tools.db.Column;
import org.exolab.jms.tools.db.Index;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoSuiteRunner.class)
public class TestIndex {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Index index0 = new Index();
      boolean boolean0 = index0.getUnique();
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      Index index0 = new Index();
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter((XMLReader) xMLFilterImpl0);
      try {
        index0.marshal((ContentHandler) xMLReaderAdapter0);
        fail("Expecting exception: NestedIOException");
      } catch(NestedIOException e) {
        /*
         * System property org.xml.sax.parser not specified
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Index index0 = new Index();
      Column column0 = new Column();
      index0.addColumn(0, column0);
      try {
        index0.getColumn(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 1, Size: 1
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Index index0 = new Index();
      int int0 = index0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      Index index0 = new Index();
      Column column0 = new Column();
      index0.setName("A}.");
      index0.addColumn(0, column0);
      boolean boolean0 = index0.isValid();
      assertEquals(1, index0.getColumnCount());
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      try {
        Index.unmarshal((Reader) null);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * 
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Index index0 = new Index();
      Enumeration<Object> enumeration0 = index0.enumerateColumn();
      assertEquals(false, enumeration0.hasMoreElements());
  }

  @Test
  public void test7()  throws Throwable  {
      Index index0 = new Index();
      boolean boolean0 = index0.removeColumn((Column) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      Index index0 = new Index();
      index0.deleteUnique();
      assertEquals(false, index0.hasUnique());
  }

  @Test
  public void test9()  throws Throwable  {
      Index index0 = new Index();
      index0.clearColumn();
      assertEquals(false, index0.hasUnique());
  }

  @Test
  public void test10()  throws Throwable  {
      Index index0 = new Index();
      // Undeclared exception!
      try {
        index0.marshal((Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'out' is null.
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Index index0 = new Index();
      index0.setUnique(true);
      assertEquals(true, index0.getUnique());
      assertEquals(true, index0.hasUnique());
  }

  @Test
  public void test12()  throws Throwable  {
      Index index0 = new Index();
      Column column0 = new Column();
      index0.addColumn(column0);
      assertEquals(1, index0.getColumnCount());
  }

  @Test
  public void test13()  throws Throwable  {
      Index index0 = new Index();
      try {
        index0.getColumn((-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Index index0 = new Index();
      try {
        index0.getColumn(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Index index0 = new Index();
      Column column0 = new Column();
      try {
        index0.setColumn((-1), column0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      Index index0 = new Index();
      try {
        index0.setColumn(1277, (Column) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Index index0 = new Index();
      Column column0 = new Column();
      try {
        index0.setColumn(0, column0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Index index0 = new Index();
      Column[] columnArray0 = new Column[1];
      index0.setColumn(columnArray0);
      assertEquals(1, index0.getColumnCount());
  }
}
