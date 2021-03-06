/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.rmi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.rmi.RMIRequestInfo;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.Properties;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RMIRequestInfoEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      URI uRI0 = new URI();
      Properties properties0 = new Properties((String) null);
      RMIRequestInfo rMIRequestInfo0 = new RMIRequestInfo(uRI0, properties0);
      rMIRequestInfo0.export(properties0);
      assertEquals(true, rMIRequestInfo0.getEmbedRegistry());
  }

  @Test
  public void test1()  throws Throwable  {
      URI uRI0 = new URI();
      Properties properties0 = new Properties((String) null);
      RMIRequestInfo rMIRequestInfo0 = new RMIRequestInfo(uRI0, properties0);
      boolean boolean0 = rMIRequestInfo0.equals((Object) null);
      assertEquals(true, rMIRequestInfo0.getEmbedRegistry());
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      URI uRI0 = new URI();
      RMIRequestInfo rMIRequestInfo0 = new RMIRequestInfo(uRI0);
      boolean boolean0 = rMIRequestInfo0.equals((Object) rMIRequestInfo0);
      assertEquals(true, rMIRequestInfo0.getEmbedRegistry());
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      URI uRI0 = new URI();
      RMIRequestInfo rMIRequestInfo0 = new RMIRequestInfo(uRI0);
      RMIRequestInfo rMIRequestInfo1 = new RMIRequestInfo(uRI0);
      rMIRequestInfo1.setEmbedRegistry(false);
      boolean boolean0 = rMIRequestInfo0.equals((Object) rMIRequestInfo1);
      assertEquals(false, rMIRequestInfo1.getEmbedRegistry());
      assertEquals(true, rMIRequestInfo0.getEmbedRegistry());
      assertEquals(true, boolean0);
  }
}
