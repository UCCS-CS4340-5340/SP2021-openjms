/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import org.exolab.jms.persistence.PersistenceException;
import org.exolab.jms.tools.db.SchemaBrowser;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSchemaBrowser {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SchemaBrowser schemaBrowser0 = null;
      try {
        schemaBrowser0 = new SchemaBrowser((Connection) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
