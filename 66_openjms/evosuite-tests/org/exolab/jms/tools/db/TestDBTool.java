/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.config.DatabaseConfiguration;
import org.exolab.jms.persistence.PersistenceException;
import org.exolab.jms.tools.db.DBTool;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestDBTool {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DBTool dBTool0 = null;
      try {
        dBTool0 = new DBTool("");
        fail("Expecting exception: PersistenceException");
      } catch(PersistenceException e) {
        /*
         *  (No such file or directory)
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DBTool dBTool0 = null;
      try {
        dBTool0 = new DBTool((Configuration) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'config' is null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      DatabaseConfiguration databaseConfiguration0 = new DatabaseConfiguration();
      configuration0.setDatabaseConfiguration(databaseConfiguration0);
      DBTool dBTool0 = null;
      try {
        dBTool0 = new DBTool(configuration0);
        fail("Expecting exception: PersistenceException");
      } catch(PersistenceException e) {
        /*
         * Configuration not configured to use an RDBMS
         */
      }
  }
}
