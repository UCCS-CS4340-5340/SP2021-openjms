/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.orb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.RemoteException;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import javax.management.remote.JMXPrincipal;
import org.exolab.jms.net.connector.ConnectionFactory;
import org.exolab.jms.net.orb.Locator;
import org.exolab.jms.net.registry.Registry;
import org.exolab.jms.net.uri.InvalidURIException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestLocator {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JMXPrincipal jMXPrincipal0 = new JMXPrincipal("y!{8qI).cv~32yO 2y)s");
      HashMap<Registry, Integer> hashMap0 = new HashMap<Registry, Integer>();
      try {
        Locator.getRegistry((Principal) jMXPrincipal0, "y!{8qI).cv~32yO 2y)s", (ConnectionFactory) null, (ClassLoader) null, (Map) hashMap0);
        fail("Expecting exception: InvalidURIException");
      } catch(InvalidURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }
}
