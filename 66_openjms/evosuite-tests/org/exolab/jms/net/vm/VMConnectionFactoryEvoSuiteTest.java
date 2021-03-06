/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.vm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.exolab.jms.net.connector.ConnectionManager;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.vm.VMConnectionFactory;
import org.exolab.jms.net.vm.VMManagedConnectionFactory;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class VMConnectionFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      VMManagedConnectionFactory vMManagedConnectionFactory0 = new VMManagedConnectionFactory();
      VMConnectionFactory vMConnectionFactory0 = new VMConnectionFactory(vMManagedConnectionFactory0, (ConnectionManager) null);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      // Undeclared exception!
      try {
        vMConnectionFactory0.getConnectionRequestInfo((URI) null, (Map) hashMap0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
