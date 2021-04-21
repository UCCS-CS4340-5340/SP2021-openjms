/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.exolab.jms.net.util.SSLProperties;
import org.exolab.jms.net.util.SSLUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSSLUtil {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SSLProperties sSLProperties0 = SSLUtil.getSSLProperties("/", "/");
      assertNull(sSLProperties0.getTrustStoreType());
  }

  @Test
  public void test1()  throws Throwable  {
      try {
        SSLUtil.getHTTPSProperties("/gD{B@Sxf", "/gD{B@Sxf");
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Failed to locate keystore: /mnt/fastdata/ac1gf/SF110/dist/66_openjms/modules/net/target/gD{B@Sxf
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      try {
        SSLUtil.getTCPSProperties("wK48kW1", "wK48kW1");
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Failed to locate keystore: /mnt/fastdata/ac1gf/SF110/dist/66_openjms/modules/net/target/wK48kW1
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SSLUtil sSLUtil0 = new SSLUtil();
      assertNotNull(sSLUtil0);
  }

  @Test
  public void test4()  throws Throwable  {
      SSLUtil.clearProperties();
  }
}
