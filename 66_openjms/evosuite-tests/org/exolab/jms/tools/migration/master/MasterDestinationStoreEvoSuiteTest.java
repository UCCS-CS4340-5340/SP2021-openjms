/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.migration.master;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.jms.JMSException;
import org.exolab.jms.persistence.DatabaseService;
import org.exolab.jms.persistence.PersistenceException;
import org.exolab.jms.tools.migration.master.MasterDestinationStore;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MasterDestinationStoreEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MasterDestinationStore masterDestinationStore0 = new MasterDestinationStore((DatabaseService) null);
      // Undeclared exception!
      try {
        masterDestinationStore0.exportCollection();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MasterDestinationStore masterDestinationStore0 = new MasterDestinationStore((DatabaseService) null);
      // Undeclared exception!
      try {
        masterDestinationStore0.size();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
