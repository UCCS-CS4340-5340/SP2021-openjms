/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.migration.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import org.exolab.jms.persistence.PersistenceException;
import org.exolab.jms.tools.migration.proxy.PropertyStore;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PropertyStoreEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PropertyStore propertyStore0 = null;
      try {
        propertyStore0 = new PropertyStore((Connection) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}