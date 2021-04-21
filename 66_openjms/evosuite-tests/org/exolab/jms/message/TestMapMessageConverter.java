/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.message;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.jms.JMSException;
import org.exolab.jms.message.MapMessageConverter;
import org.exolab.jms.message.MapMessageImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestMapMessageConverter {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MapMessageConverter mapMessageConverter0 = new MapMessageConverter();
      MapMessageImpl mapMessageImpl0 = (MapMessageImpl)mapMessageConverter0.create();
      assertEquals(false, mapMessageImpl0.getProcessed());
  }
}
