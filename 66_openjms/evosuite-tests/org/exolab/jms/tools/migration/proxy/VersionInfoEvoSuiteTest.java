/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.tools.migration.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.persistence.PersistenceException;
import org.exolab.jms.tools.migration.proxy.PropertyStore;
import org.exolab.jms.tools.migration.proxy.VersionInfo;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class VersionInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      VersionInfo versionInfo0 = new VersionInfo((PropertyStore) null);
      // Undeclared exception!
      try {
        versionInfo0.getProxySchemaVersion();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      VersionInfo versionInfo0 = new VersionInfo((PropertyStore) null);
      // Undeclared exception!
      try {
        versionInfo0.getOpenJMSVersion();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      VersionInfo versionInfo0 = new VersionInfo((PropertyStore) null);
      // Undeclared exception!
      try {
        versionInfo0.setProxySchemaVersion("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      VersionInfo versionInfo0 = new VersionInfo((PropertyStore) null);
      // Undeclared exception!
      try {
        versionInfo0.setOpenJMSVersion("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      VersionInfo versionInfo0 = new VersionInfo((PropertyStore) null);
      // Undeclared exception!
      try {
        versionInfo0.setCreationTimestamp(0L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      VersionInfo versionInfo0 = new VersionInfo((PropertyStore) null);
      // Undeclared exception!
      try {
        versionInfo0.getCreationTimestamp();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
