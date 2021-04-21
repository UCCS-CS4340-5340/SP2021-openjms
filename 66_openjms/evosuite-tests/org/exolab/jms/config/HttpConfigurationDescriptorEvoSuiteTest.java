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
import org.exolab.castor.xml.util.XMLClassDescriptorAdapter;
import org.exolab.jms.config.HttpConfigurationDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HttpConfigurationDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HttpConfigurationDescriptor httpConfigurationDescriptor0 = new HttpConfigurationDescriptor();
      String string0 = httpConfigurationDescriptor0.getNameSpaceURI();
      assertEquals("http://openjms.exolab.org/configuration", string0);
      assertEquals("HttpConfiguration", httpConfigurationDescriptor0.getXMLName());
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      HttpConfigurationDescriptor httpConfigurationDescriptor0 = new HttpConfigurationDescriptor();
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) httpConfigurationDescriptor0, "org.exolab.jms.config.HttpConfigurationDescriptor@7d4df25e; descriptor for class: [null]; xml name: null");
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("HttpConfiguration", httpConfigurationDescriptor0.getXMLName());
  }

  @Test
  public void test2()  throws Throwable  {
      HttpConfigurationDescriptor httpConfigurationDescriptor0 = new HttpConfigurationDescriptor();
      httpConfigurationDescriptor0.getAccessMode();
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("HttpConfiguration", httpConfigurationDescriptor0.getXMLName());
  }

  @Test
  public void test3()  throws Throwable  {
      HttpConfigurationDescriptor httpConfigurationDescriptor0 = new HttpConfigurationDescriptor();
      HttpConfigurationDescriptor httpConfigurationDescriptor1 = (HttpConfigurationDescriptor)httpConfigurationDescriptor0.getValidator();
      assertEquals("HttpConfiguration", httpConfigurationDescriptor1.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationDescriptor1.getNameSpaceURI());
  }

  @Test
  public void test4()  throws Throwable  {
      HttpConfigurationDescriptor httpConfigurationDescriptor0 = new HttpConfigurationDescriptor();
      httpConfigurationDescriptor0.getNameSpacePrefix();
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("HttpConfiguration", httpConfigurationDescriptor0.getXMLName());
  }
}
