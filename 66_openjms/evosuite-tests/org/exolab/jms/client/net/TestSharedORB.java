/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.client.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.rmi.RemoteException;
import org.exolab.jms.client.net.SharedORB;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSharedORB {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SharedORB sharedORB0 = (SharedORB)SharedORB.getInstance();
      assertNotNull(sharedORB0);
  }
}
