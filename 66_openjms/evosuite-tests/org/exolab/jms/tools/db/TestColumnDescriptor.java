/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.tools.db.Column;
import org.exolab.jms.tools.db.ColumnDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestColumnDescriptor {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ColumnDescriptor columnDescriptor0 = new ColumnDescriptor();
      String string0 = columnDescriptor0.getXMLName();
      assertNotNull(string0);
      assertEquals("column", string0);
      assertEquals("http://www.openjms.org/database/schema", columnDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test1()  throws Throwable  {
      ColumnDescriptor columnDescriptor0 = new ColumnDescriptor();
      Column column0 = new Column();
      columnDescriptor0.validate((Object) column0);
      assertEquals("column", columnDescriptor0.getXMLName());
      assertEquals("http://www.openjms.org/database/schema", columnDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test2()  throws Throwable  {
      ColumnDescriptor columnDescriptor0 = new ColumnDescriptor();
      columnDescriptor0.getIdentity();
      assertEquals("column", columnDescriptor0.getXMLName());
      assertEquals("http://www.openjms.org/database/schema", columnDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test3()  throws Throwable  {
      ColumnDescriptor columnDescriptor0 = new ColumnDescriptor();
      ColumnDescriptor columnDescriptor1 = (ColumnDescriptor)columnDescriptor0.getValidator();
      assertEquals("http://www.openjms.org/database/schema", columnDescriptor1.getNameSpaceURI());
      assertEquals("column", columnDescriptor1.getXMLName());
  }

  @Test
  public void test4()  throws Throwable  {
      ColumnDescriptor columnDescriptor0 = new ColumnDescriptor();
      columnDescriptor0.getAccessMode();
      assertEquals("column", columnDescriptor0.getXMLName());
      assertEquals("http://www.openjms.org/database/schema", columnDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test5()  throws Throwable  {
      ColumnDescriptor columnDescriptor0 = new ColumnDescriptor();
      String string0 = columnDescriptor0.getNameSpaceURI();
      assertEquals("http://www.openjms.org/database/schema", string0);
      assertNotNull(string0);
      assertEquals("column", columnDescriptor0.getXMLName());
  }

  @Test
  public void test6()  throws Throwable  {
      ColumnDescriptor columnDescriptor0 = new ColumnDescriptor();
      columnDescriptor0.getNameSpacePrefix();
      assertEquals("http://www.openjms.org/database/schema", columnDescriptor0.getNameSpaceURI());
      assertEquals("column", columnDescriptor0.getXMLName());
  }

  @Test
  public void test7()  throws Throwable  {
      ColumnDescriptor columnDescriptor0 = new ColumnDescriptor();
      columnDescriptor0.getExtends();
      assertEquals("column", columnDescriptor0.getXMLName());
      assertEquals("http://www.openjms.org/database/schema", columnDescriptor0.getNameSpaceURI());
  }
}