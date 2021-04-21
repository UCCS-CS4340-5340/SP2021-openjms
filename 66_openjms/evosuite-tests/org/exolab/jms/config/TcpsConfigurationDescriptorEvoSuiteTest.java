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
import org.exolab.jms.config.TcpsConfigurationDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TcpsConfigurationDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TcpsConfigurationDescriptor tcpsConfigurationDescriptor0 = new TcpsConfigurationDescriptor();
      Object object0 = new Object();
      // Undeclared exception!
      try {
        tcpsConfigurationDescriptor0.canAccept("trustStoreType", object0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.Object cannot be cast to org.exolab.jms.config.TcpsConfiguration
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TcpsConfigurationDescriptor tcpsConfigurationDescriptor0 = new TcpsConfigurationDescriptor();
      assertNotNull(tcpsConfigurationDescriptor0);
      
      tcpsConfigurationDescriptor0.getAccessMode();
      assertEquals("TcpsConfiguration", tcpsConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", tcpsConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test2()  throws Throwable  {
      TcpsConfigurationDescriptor tcpsConfigurationDescriptor0 = new TcpsConfigurationDescriptor();
      assertNotNull(tcpsConfigurationDescriptor0);
      
      tcpsConfigurationDescriptor0.getNameSpacePrefix();
      assertEquals("http://openjms.exolab.org/configuration", tcpsConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("TcpsConfiguration", tcpsConfigurationDescriptor0.getXMLName());
  }

  @Test
  public void test3()  throws Throwable  {
      TcpsConfigurationDescriptor tcpsConfigurationDescriptor0 = new TcpsConfigurationDescriptor();
      assertNotNull(tcpsConfigurationDescriptor0);
      
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) tcpsConfigurationDescriptor0, "");
      assertEquals("http://openjms.exolab.org/configuration", tcpsConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("TcpsConfiguration", tcpsConfigurationDescriptor0.getXMLName());
  }

  @Test
  public void test4()  throws Throwable  {
      TcpsConfigurationDescriptor tcpsConfigurationDescriptor0 = new TcpsConfigurationDescriptor();
      assertNotNull(tcpsConfigurationDescriptor0);
      
      TcpsConfigurationDescriptor tcpsConfigurationDescriptor1 = (TcpsConfigurationDescriptor)tcpsConfigurationDescriptor0.getValidator();
      assertEquals("TcpsConfiguration", tcpsConfigurationDescriptor1.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", tcpsConfigurationDescriptor1.getNameSpaceURI());
  }

  @Test
  public void test5()  throws Throwable  {
      TcpsConfigurationDescriptor tcpsConfigurationDescriptor0 = new TcpsConfigurationDescriptor();
      assertNotNull(tcpsConfigurationDescriptor0);
      
      String string0 = tcpsConfigurationDescriptor0.getNameSpaceURI();
      assertEquals("http://openjms.exolab.org/configuration", string0);
      assertNotNull(string0);
      assertEquals("TcpsConfiguration", tcpsConfigurationDescriptor0.getXMLName());
  }
}