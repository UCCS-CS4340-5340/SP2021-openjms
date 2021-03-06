/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.HttpConfigurationDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestHttpConfigurationDescriptor {

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
      httpConfigurationDescriptor0.getExtends();
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("HttpConfiguration", httpConfigurationDescriptor0.getXMLName());
  }

  @Test
  public void test2()  throws Throwable  {
      HttpConfigurationDescriptor httpConfigurationDescriptor0 = new HttpConfigurationDescriptor();
      httpConfigurationDescriptor0.getAccessMode();
      assertEquals("HttpConfiguration", httpConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test3()  throws Throwable  {
      HttpConfigurationDescriptor httpConfigurationDescriptor0 = new HttpConfigurationDescriptor();
      String string0 = httpConfigurationDescriptor0.getXMLName();
      assertNotNull(string0);
      assertEquals("HttpConfiguration", string0);
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test4()  throws Throwable  {
      HttpConfigurationDescriptor httpConfigurationDescriptor0 = new HttpConfigurationDescriptor();
      HttpConfigurationDescriptor httpConfigurationDescriptor1 = (HttpConfigurationDescriptor)httpConfigurationDescriptor0.getValidator();
      assertEquals("HttpConfiguration", httpConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("HttpConfiguration", httpConfigurationDescriptor1.getXMLName());
  }

  @Test
  public void test5()  throws Throwable  {
      HttpConfigurationDescriptor httpConfigurationDescriptor0 = new HttpConfigurationDescriptor();
      httpConfigurationDescriptor0.getNameSpacePrefix();
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("HttpConfiguration", httpConfigurationDescriptor0.getXMLName());
  }

  @Test
  public void test6()  throws Throwable  {
      HttpConfigurationDescriptor httpConfigurationDescriptor0 = new HttpConfigurationDescriptor();
      httpConfigurationDescriptor0.getIdentity();
      assertEquals("HttpConfiguration", httpConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", httpConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test7()  throws Throwable  {
      HttpConfigurationDescriptor httpConfigurationDescriptor0 = new HttpConfigurationDescriptor();
      try {
        httpConfigurationDescriptor0.validate((Object) "http://openjms.exolab.org/configuration");
        fail("Expecting exception: ValidationException");
      } catch(ValidationException e) {
        /*
         * The given object is not an instance of the class described by this ClassDecriptor.
         */
      }
  }
}
