/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.lease;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.lease.LeaseComparator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LeaseComparatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LeaseComparator leaseComparator0 = new LeaseComparator();
      boolean boolean0 = leaseComparator0.equals((Object) ".");
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      LeaseComparator leaseComparator0 = new LeaseComparator();
      // Undeclared exception!
      try {
        leaseComparator0.compare((Object) ".", (Object) ".");
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * obj1 is of type java.lang.String obj2 is of type java.lang.String
         */
      }
  }
}
