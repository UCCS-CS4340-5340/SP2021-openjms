/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.messagemgr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.lease.LeaseManager;
import org.exolab.jms.messagemgr.DestinationCacheFactory;
import org.exolab.jms.persistence.DatabaseService;
import org.exolab.jms.server.ServerConnectionManager;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestDestinationCacheFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LeaseManager leaseManager0 = new LeaseManager();
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      DestinationCacheFactory destinationCacheFactory0 = null;
      try {
        destinationCacheFactory0 = new DestinationCacheFactory(leaseManager0, databaseService0, (ServerConnectionManager) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'connections' is null
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      DestinationCacheFactory destinationCacheFactory0 = null;
      try {
        destinationCacheFactory0 = new DestinationCacheFactory((LeaseManager) null, databaseService0, (ServerConnectionManager) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'leases' is null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LeaseManager leaseManager0 = new LeaseManager();
      DestinationCacheFactory destinationCacheFactory0 = null;
      try {
        destinationCacheFactory0 = new DestinationCacheFactory(leaseManager0, (DatabaseService) null, (ServerConnectionManager) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'database' is null
         */
      }
  }
}
