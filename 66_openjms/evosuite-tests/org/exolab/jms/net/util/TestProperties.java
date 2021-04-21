/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.Properties;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestProperties {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Properties properties0 = new Properties((String) null);
      properties0.set((String) null, (Object) null);
  }

  @Test
  public void test1()  throws Throwable  {
      Properties properties0 = new Properties("");
      properties0.set("", (-1697));
  }

  @Test
  public void test2()  throws Throwable  {
      Properties properties0 = new Properties((String) null);
      Map<Object, Object> map0 = properties0.getProperties();
      Properties properties1 = new Properties((Map) map0, (String) null);
      assertNotSame(properties1, properties0);
  }

  @Test
  public void test3()  throws Throwable  {
      Properties properties0 = new Properties((String) null);
      properties0.setNonNull((String) null, (String) null);
  }

  @Test
  public void test4()  throws Throwable  {
      Properties properties0 = new Properties("[cTX${ i<rHjzX!");
      properties0.set("[cTX${ i<rHjzX!", false);
      boolean boolean0 = properties0.getBoolean("[cTX${ i<rHjzX!", true);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      Properties properties0 = new Properties((Map) null, "Path contains invalid escape sequence!");
      properties0.set("Path contains invalid escape sequence!", true);
      boolean boolean0 = properties0.getBoolean("Path contains invalid escape sequence!", true);
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      Properties properties0 = new Properties("Mm9+cE!Jf");
      Object object0 = new Object();
      properties0.set("Mm9+cE!Jf", object0);
  }

  @Test
  public void test7()  throws Throwable  {
      Properties properties0 = new Properties((String) null);
      properties0.setNonNull((String) null, (Object) null);
  }

  @Test
  public void test8()  throws Throwable  {
      Properties properties0 = new Properties("[cTX${ i<rHjzX!");
      properties0.setNonNull("[cTX${ i<rHjzX!", "{}");
      try {
        properties0.getBoolean("[cTX${ i<rHjzX!", true);
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Invalid boolean for property=[cTX${ i<rHjzX![cTX${ i<rHjzX!: {}
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      hashMap0.put("", object0);
      Properties properties0 = new Properties((Map) hashMap0, "");
      try {
        properties0.get("");
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Invalid type for property=
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Properties properties0 = new Properties((String) null);
      boolean boolean0 = properties0.getBoolean((String) null, false);
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      Properties properties0 = new Properties("Tz'gj@q0gcL{!\"");
      int int0 = properties0.getInt("Tz'gj@q0gcL{!\"", 0);
      assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      Properties properties0 = new Properties("");
      properties0.setNonNull("", "");
      try {
        properties0.getInt("", (-1697));
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Invalid int for property=: 
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Properties properties0 = new Properties("[cTX${ i<rHjzX!");
      URI uRI0 = properties0.getURI("[cTX${ i<rHjzX!");
      assertNull(uRI0);
  }

  @Test
  public void test14()  throws Throwable  {
      Properties properties0 = new Properties("");
      properties0.setNonNull("", "");
      try {
        properties0.getURI("");
        fail("Expecting exception: ResourceException");
      } catch(ResourceException e) {
        /*
         * Invalid URI for property=: 
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Properties properties0 = new Properties("Tz'gj@q0gcL{!\"");
      properties0.setNonNull("java.lang.object@5827233b", "Invalid type for property=");
  }
}