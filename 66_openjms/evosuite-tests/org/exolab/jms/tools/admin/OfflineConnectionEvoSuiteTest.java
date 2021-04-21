/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Component;
import javax.swing.JCheckBox;
import org.exolab.jms.config.Configuration;
import org.exolab.jms.tools.admin.OfflineConnection;
import org.exolab.jms.tools.admin.OfflineConnectionException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OfflineConnectionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JCheckBox jCheckBox0 = new JCheckBox();
      Configuration configuration0 = new Configuration();
      OfflineConnection offlineConnection0 = null;
      try {
        offlineConnection0 = new OfflineConnection((Component) jCheckBox0, configuration0);
        fail("Expecting exception: OfflineConnectionException");
      } catch(OfflineConnectionException e) {
        /*
         * Database Error: null
         */
      }
  }
}
