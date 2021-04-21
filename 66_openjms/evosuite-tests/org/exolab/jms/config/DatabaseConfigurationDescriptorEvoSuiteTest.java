/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.castor.mapping.ClassDescriptor;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.NodeType;
import org.exolab.castor.xml.util.XMLClassDescriptorAdapter;
import org.exolab.jms.config.DatabaseConfigurationDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DatabaseConfigurationDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DatabaseConfigurationDescriptor databaseConfigurationDescriptor0 = new DatabaseConfigurationDescriptor();
      databaseConfigurationDescriptor0.getAccessMode();
      assertEquals("http://openjms.exolab.org/configuration", databaseConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("DatabaseConfiguration", databaseConfigurationDescriptor0.getXMLName());
  }

  @Test
  public void test1()  throws Throwable  {
      DatabaseConfigurationDescriptor databaseConfigurationDescriptor0 = new DatabaseConfigurationDescriptor();
      assertNotNull(databaseConfigurationDescriptor0);
      
      databaseConfigurationDescriptor0.getNameSpacePrefix();
      assertEquals("http://openjms.exolab.org/configuration", databaseConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("DatabaseConfiguration", databaseConfigurationDescriptor0.getXMLName());
  }

  @Test
  public void test2()  throws Throwable  {
      DatabaseConfigurationDescriptor databaseConfigurationDescriptor0 = new DatabaseConfigurationDescriptor();
      assertNotNull(databaseConfigurationDescriptor0);
      
      String string0 = databaseConfigurationDescriptor0.getNameSpaceURI();
      assertEquals("DatabaseConfiguration", databaseConfigurationDescriptor0.getXMLName());
      assertNotNull(string0);
      assertEquals("http://openjms.exolab.org/configuration", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      DatabaseConfigurationDescriptor databaseConfigurationDescriptor0 = new DatabaseConfigurationDescriptor();
      assertNotNull(databaseConfigurationDescriptor0);
      
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) databaseConfigurationDescriptor0, "http://openjms.exolab.org/configuration", (NodeType) null);
      assertEquals("DatabaseConfiguration", databaseConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", databaseConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test4()  throws Throwable  {
      DatabaseConfigurationDescriptor databaseConfigurationDescriptor0 = new DatabaseConfigurationDescriptor();
      assertNotNull(databaseConfigurationDescriptor0);
      
      DatabaseConfigurationDescriptor databaseConfigurationDescriptor1 = (DatabaseConfigurationDescriptor)databaseConfigurationDescriptor0.getValidator();
      assertEquals("DatabaseConfiguration", databaseConfigurationDescriptor1.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", databaseConfigurationDescriptor1.getNameSpaceURI());
  }
}
