/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.lease;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.lease.BaseLease;
import org.exolab.jms.lease.LeaseManager;
import org.exolab.jms.service.ServiceException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestLeaseManager {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LeaseManager leaseManager0 = new LeaseManager();
      leaseManager0.start();
      leaseManager0.restart();
      assertEquals("LeaseManager", leaseManager0.getName());
  }

  @Test
  public void test1()  throws Throwable  {
      LeaseManager leaseManager0 = new LeaseManager();
      BaseLease baseLease0 = leaseManager0.renewLease((BaseLease) null, 0L);
      assertNull(baseLease0);
  }

  @Test
  public void test2()  throws Throwable  {
      LeaseManager leaseManager0 = new LeaseManager();
      leaseManager0.expire();
      assertEquals("BasicService:[name=LeaseManagerthread=nullstarted=false]", leaseManager0.toString());
  }
}
