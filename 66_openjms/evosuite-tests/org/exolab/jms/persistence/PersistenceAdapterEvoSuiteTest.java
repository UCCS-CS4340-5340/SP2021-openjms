/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.config.DatabaseConfiguration;
import org.exolab.jms.persistence.PersistenceException;
import org.exolab.jms.persistence.RDBMSAdapter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PersistenceAdapterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DatabaseConfiguration databaseConfiguration0 = new DatabaseConfiguration();
      RDBMSAdapter rDBMSAdapter0 = null;
      try {
        rDBMSAdapter0 = new RDBMSAdapter(databaseConfiguration0, "", "", "mk?}KC5klpk3bQ", "mk?}KC5klpk3bQ");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
