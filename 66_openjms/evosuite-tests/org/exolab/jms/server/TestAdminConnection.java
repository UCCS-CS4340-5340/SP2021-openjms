/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.authentication.AuthenticationMgr;
import org.exolab.jms.authentication.UserManager;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.messagemgr.ConsumerManager;
import org.exolab.jms.messagemgr.DestinationManager;
import org.exolab.jms.persistence.DatabaseService;
import org.exolab.jms.server.AdminConnection;
import org.exolab.jms.service.ServiceManager;
import org.exolab.jms.service.Services;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestAdminConnection {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      UserManager userManager0 = new UserManager(configuration0, databaseService0);
      AuthenticationMgr authenticationMgr0 = new AuthenticationMgr(userManager0);
      ServiceManager serviceManager0 = new ServiceManager();
      AdminConnection adminConnection0 = null;
      try {
        adminConnection0 = new AdminConnection(configuration0, authenticationMgr0, (DestinationManager) null, (ConsumerManager) null, databaseService0, (Services) serviceManager0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'destinations' is null
         */
      }
  }
}