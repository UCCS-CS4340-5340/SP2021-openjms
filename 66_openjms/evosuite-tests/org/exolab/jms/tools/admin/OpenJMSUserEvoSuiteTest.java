/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.swing.JTree;
import org.exolab.jms.tools.admin.OpenJMSUser;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OpenJMSUserEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JTree jTree0 = new JTree();
      OpenJMSUser openJMSUser0 = new OpenJMSUser("/..", jTree0);
      openJMSUser0.update();
      assertEquals(true, openJMSUser0.isRoot());
  }
}
