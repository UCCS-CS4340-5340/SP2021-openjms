/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.http;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.sun.net.ssl.internal.www.protocol.https.Handler;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLStreamHandler;
import org.exolab.jms.net.connector.ResourceException;
import org.exolab.jms.net.http.HTTPInputStream;
import org.exolab.jms.net.http.HTTPRequestInfo;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.Properties;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HTTPInputStreamEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HTTPInputStream hTTPInputStream0 = new HTTPInputStream("G+8SE5/$Qab%", (URL) null, (HTTPRequestInfo) null);
      // Undeclared exception!
      try {
        hTTPInputStream0.read();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Handler handler0 = new Handler();
      URL uRL0 = new URL("t&VSA1|2Q-B", "t&VSA1|2Q-B", (-1), "t&VSA1|2Q-B", (URLStreamHandler) handler0);
      URI uRI0 = new URI();
      Properties properties0 = new Properties("t&VSA1|2Q-B");
      HTTPRequestInfo hTTPRequestInfo0 = new HTTPRequestInfo(uRI0, properties0);
      HTTPInputStream hTTPInputStream0 = new HTTPInputStream("t&VSA1|2Q-B", uRL0, hTTPRequestInfo0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try {
        hTTPInputStream0.read(byteArray0, (-1), (int) (byte)0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Handler handler0 = new Handler("", 31);
      URL uRL0 = new URL("", "", 31, "", (URLStreamHandler) handler0);
      HTTPInputStream hTTPInputStream0 = new HTTPInputStream("", uRL0, (HTTPRequestInfo) null);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try {
        hTTPInputStream0.read(byteArray0, (int) (byte)80, (int) (byte) (-79));
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      URI uRI0 = new URI("o4", "o4", "o4", "o4", "o4");
      HTTPRequestInfo hTTPRequestInfo0 = new HTTPRequestInfo(uRI0);
      HTTPInputStream hTTPInputStream0 = new HTTPInputStream("o4", (URL) null, hTTPRequestInfo0);
      assertNotNull(hTTPInputStream0);
      
      byte[] byteArray0 = new byte[6];
      int int0 = hTTPInputStream0.read(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(0, int0);
  }
}