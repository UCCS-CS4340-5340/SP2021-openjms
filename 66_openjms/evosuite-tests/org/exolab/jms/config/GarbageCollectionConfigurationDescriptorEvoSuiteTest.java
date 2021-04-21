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
import org.exolab.jms.config.GarbageCollectionConfigurationDescriptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GarbageCollectionConfigurationDescriptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GarbageCollectionConfigurationDescriptor garbageCollectionConfigurationDescriptor0 = new GarbageCollectionConfigurationDescriptor();
      assertNotNull(garbageCollectionConfigurationDescriptor0);
      
      garbageCollectionConfigurationDescriptor0.getAccessMode();
      assertEquals("GarbageCollectionConfiguration", garbageCollectionConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", garbageCollectionConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test1()  throws Throwable  {
      GarbageCollectionConfigurationDescriptor garbageCollectionConfigurationDescriptor0 = new GarbageCollectionConfigurationDescriptor();
      assertNotNull(garbageCollectionConfigurationDescriptor0);
      
      XMLClassDescriptorAdapter xMLClassDescriptorAdapter0 = new XMLClassDescriptorAdapter((ClassDescriptor) garbageCollectionConfigurationDescriptor0, "http://openjms.exolab.org/configuration", (NodeType) null);
      assertEquals("http://openjms.exolab.org/configuration", garbageCollectionConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("GarbageCollectionConfiguration", garbageCollectionConfigurationDescriptor0.getXMLName());
  }

  @Test
  public void test2()  throws Throwable  {
      GarbageCollectionConfigurationDescriptor garbageCollectionConfigurationDescriptor0 = new GarbageCollectionConfigurationDescriptor();
      assertNotNull(garbageCollectionConfigurationDescriptor0);
      
      String string0 = garbageCollectionConfigurationDescriptor0.getNameSpaceURI();
      assertEquals("http://openjms.exolab.org/configuration", string0);
      assertEquals("GarbageCollectionConfiguration", garbageCollectionConfigurationDescriptor0.getXMLName());
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      GarbageCollectionConfigurationDescriptor garbageCollectionConfigurationDescriptor0 = new GarbageCollectionConfigurationDescriptor();
      assertNotNull(garbageCollectionConfigurationDescriptor0);
      
      garbageCollectionConfigurationDescriptor0.getNameSpacePrefix();
      assertEquals("GarbageCollectionConfiguration", garbageCollectionConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", garbageCollectionConfigurationDescriptor0.getNameSpaceURI());
  }

  @Test
  public void test4()  throws Throwable  {
      GarbageCollectionConfigurationDescriptor garbageCollectionConfigurationDescriptor0 = new GarbageCollectionConfigurationDescriptor();
      assertNotNull(garbageCollectionConfigurationDescriptor0);
      
      GarbageCollectionConfigurationDescriptor garbageCollectionConfigurationDescriptor1 = (GarbageCollectionConfigurationDescriptor)garbageCollectionConfigurationDescriptor0.getValidator();
      assertEquals("GarbageCollectionConfiguration", garbageCollectionConfigurationDescriptor0.getXMLName());
      assertEquals("http://openjms.exolab.org/configuration", garbageCollectionConfigurationDescriptor0.getNameSpaceURI());
      assertEquals("GarbageCollectionConfiguration", garbageCollectionConfigurationDescriptor1.getXMLName());
  }
}
