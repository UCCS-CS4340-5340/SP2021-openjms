/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.orb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.RemoteException;
import org.exolab.jms.authentication.AuthenticationMgr;
import org.exolab.jms.authentication.UserManager;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.net.connector.Authenticator;
import org.exolab.jms.net.orb.ORB;
import org.exolab.jms.net.orb.ORBFactory;
import org.exolab.jms.persistence.DatabaseService;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestORBFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ORB oRB0 = ORBFactory.createORB();
      assertNotNull(oRB0);
  }

  @Test
  public void test1()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      DatabaseService databaseService0 = new DatabaseService(configuration0);
      UserManager userManager0 = new UserManager(configuration0, databaseService0);
      AuthenticationMgr authenticationMgr0 = new AuthenticationMgr(userManager0);
      ORB oRB0 = ORBFactory.createORB((Authenticator) authenticationMgr0, (String) null);
      assertNotNull(oRB0);
  }

  @Test
  public void test2()  throws Throwable  {
      ORB oRB0 = ORBFactory.createORB("");
      assertNotNull(oRB0);
  }
}
