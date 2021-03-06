/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net.uri;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.exolab.jms.net.uri.URI;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestURI {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("#IEW:i#`jY");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      URI uRI0 = new URI("A", "A", "A", 1597, "A", "A", "A");
      assertNotNull(uRI0);
      
      URI uRI1 = new URI(uRI0);
      assertEquals("a://A@A:1597A?A#A", uRI1.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = new URI(uRI0, (String) null);
      assertNotNull(uRI1);
      assertEquals("", uRI1.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      URI uRI0 = new URI("dbkmwco.://dbkMWcO.dbkMWcO./dbkMWcO.?dbkMWcO.#dbkMWcO.");
      assertNotNull(uRI0);
      assertEquals("/dbkMWcO.", uRI0.getPath());
      assertEquals("dbkmwco.://dbkMWcO.dbkMWcO./dbkMWcO.?dbkMWcO.#dbkMWcO.", uRI0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      URI uRI0 = new URI("A", "A", "A", 1597, "A", "A", "A");
      assertNotNull(uRI0);
      
      int int0 = uRI0.hashCode();
      assertEquals(1347666990, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI((String) null, (String) null);
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument scheme is null or an empty string
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("&U!:r` acrIFmQ/", "");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument schemeSpecificPart is null or an empty string
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("", "");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument scheme is null or an empty string
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("&!rsyk]%f[B", (String) null);
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument schemeSpecificPart is null or an empty string
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      URI uRI0 = new URI("e", "e");
      assertNotNull(uRI0);
      
      URI uRI1 = new URI(uRI0, "e");
      assertNotNull(uRI1);
      
      uRI1.appendPath("?");
      assertEquals("e:/?", uRI1.toString());
      assertEquals("/?", uRI1.getSchemeSpecificPart());
  }

  @Test
  public void test10()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI((String) null, (String) null, (String) null, (-1120), (String) null, (String) null, (String) null);
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument scheme is null or an empty string
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("", "$U", "", "", "z!");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument scheme is null or an empty string
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("\"o7d:Ja~", (String) null, "\"o7d:Ja~", "\"o7d:Ja~", "\"o7d:Ja~");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * The scheme is not conformant.
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("/./", "/./", (String) null, (-1152), (String) null, "/./", (String) null);
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument userInfo must be null if host is null
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("p", (String) null, (String) null, 0, (String) null, (String) null, (String) null);
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument port must be null if host is null
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("OLZ ;o", "", "OLZ ;o", "", "");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument host is an empty string
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("K.", "K.", "K.", 781, (String) null, "K.", "K.");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("|l", "1V", "dfbkmwco.://dfbkMWcO.dfbkMWcO.?dfbkMWcO.#dfbkMWcO.", "dfbkmwco.://dfbkMWcO.dfbkMWcO.?dfbkMWcO.#dfbkMWcO.", "dfbkMWcO.");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument queryString is illegal if path includes query string
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("hoQ!#=", "", "hoQ!#=", 849, "hoQ!#=", (String) null, (String) null);
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * The scheme is not conformant.
         */
      }
  }

  @Test
  public void test19()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("ftwUf#MFm", "ftwUf#MFm", "ftwUf#MFm", 5, "ftwUf#MFm", "ftwUf#MFm", "ftwUf#MFm");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument fragment is illegal if path includes fragment identifier
         */
      }
  }

  @Test
  public void test20()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI((String) null);
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test21()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = new URI(uRI0, "");
      assertNotNull(uRI1);
      assertEquals("", uRI1.getSchemeSpecificPart());
  }

  @Test
  public void test23()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("dfbkMWcO..");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test24()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = new URI(uRI0, "//");
      assertNotNull(uRI1);
      
      String string0 = uRI1.getPath(false, false);
      assertEquals(-1, uRI1.getPort());
      assertNotNull(string0);
      assertEquals(true, uRI1.isGenericURI());
      assertEquals("", uRI0.getSchemeSpecificPart());
      assertEquals("", string0);
  }

  @Test
  public void test25()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("a://A@A:1597A?A#A");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * 1597A is invalid. Port should only contain digits!
         */
      }
  }

  @Test
  public void test26()  throws Throwable  {
      URI uRI0 = new URI("e", "e");
      assertNotNull(uRI0);
      
      URI uRI1 = new URI(uRI0, "?");
      assertEquals("e:e?", uRI1.toString());
      assertNotNull(uRI1);
  }

  @Test
  public void test27()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = new URI(uRI0, "#");
      assertNotNull(uRI1);
      assertEquals("#", uRI1.getSchemeSpecificPart());
  }

  @Test
  public void test28()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = new URI(uRI0, "/dfbkMWcO.");
      assertNotNull(uRI1);
      
      uRI1.appendPath("/dfbkMWcO.");
      assertEquals("/dfbkMWcO./dfbkMWcO.", uRI1.getPath());
      assertEquals("/dfbkMWcO./dfbkMWcO.", uRI1.toString());
  }

  @Test
  public void test29()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = new URI(uRI0, "hfI");
      assertNotNull(uRI1);
      
      boolean boolean0 = uRI1.equals((Object) uRI0);
      assertEquals(false, boolean0);
      assertEquals(-1, uRI0.getPort());
  }

  @Test
  public void test30()  throws Throwable  {
      String string0 = "f-3O2QTn";
      URI uRI0 = new URI("f-3O2QTn", "f-3O2QTn", "f-3O2QTn", 929, "//0QI97", "//0QI97", "//0QI97");
      assertNotNull(uRI0);
      
      URI uRI1 = new URI(uRI0, string0);
      assertEquals(929, uRI0.getPort());
      assertEquals("////", uRI1.getPath());
      assertNotNull(uRI1);
  }

  @Test
  public void test31()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("////db@db:980db?db#db");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * No scheme found in URI.
         */
      }
  }

  @Test
  public void test32()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = null;
      try {
        uRI1 = new URI(uRI0, "Fh(?CB6j=o&=:0m");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * The scheme is not conformant.
         */
      }
  }

  @Test
  public void test33()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = null;
      try {
        uRI1 = new URI(uRI0, "eML2dmm%~L%C%d8+h;m");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Path contains invalid escape sequence!
         */
      }
  }

  @Test
  public void test34()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = null;
      try {
        uRI1 = new URI(uRI0, "eML2dmmX~L%C%d8+h;m");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Path contains invalid escape sequence!
         */
      }
  }

  @Test
  public void test35()  throws Throwable  {
      URI uRI0 = new URI();
      try {
        uRI0.setPath("QX6D9[E);w$ILu");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Path contains invalid character: [
         */
      }
  }

  @Test
  public void test36()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("db", "?`-7}W]43p.X`");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Query string contains invalid character:`
         */
      }
  }

  @Test
  public void test37()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = null;
      try {
        uRI1 = new URI(uRI0, "Q.HGT#%.53_n");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Fragment contains invalid escape sequence!
         */
      }
  }

  @Test
  public void test38()  throws Throwable  {
      URI uRI0 = new URI();
      uRI0.setPath("hoQ!#=");
      assertEquals("hoQ!#=", uRI0.getSchemeSpecificPart());
      assertEquals("hoQ!", uRI0.getPath());
  }

  @Test
  public void test39()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = null;
      try {
        uRI1 = new URI(uRI0, "H'izj#fY`qG^");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Fragment contains invalid character:`
         */
      }
  }

  @Test
  public void test40()  throws Throwable  {
      URI uRI0 = new URI("dfbkMWcO.", "dfbkMWcO.", "dfbkMWcO.", "dfbkMWcO.", "dfbkMWcO.");
      assertNotNull(uRI0);
      
      String string0 = uRI0.toString();
      assertEquals("dfbkmwco.://dfbkMWcO.dfbkMWcO.?dfbkMWcO.#dfbkMWcO.", string0);
  }

  @Test
  public void test41()  throws Throwable  {
      URI uRI0 = new URI("db", "db", "db", 90, "db", "db", "db");
      assertNotNull(uRI0);
      
      String string0 = uRI0.getPath(true, true);
      assertEquals("db?db#db", string0);
      assertEquals(90, uRI0.getPort());
      assertNotNull(string0);
  }

  @Test
  public void test42()  throws Throwable  {
      URI uRI0 = new URI("db", "db");
      assertNotNull(uRI0);
      
      String string0 = uRI0.getPath(true, true);
      assertNotNull(string0);
      assertEquals("db", string0);
      assertEquals("db:db", uRI0.toString());
  }

  @Test
  public void test43()  throws Throwable  {
      URI uRI0 = new URI("db", "db", "db", "db", (String) null);
      assertNotNull(uRI0);
      
      try {
        uRI0.setScheme((String) null);
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Argument scheme is null
         */
      }
  }

  @Test
  public void test44()  throws Throwable  {
      URI uRI0 = new URI();
      try {
        uRI0.setUserinfo("tP^OA/C$/T%]{s]#E");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Userinfo cannot be set when host is null!
         */
      }
  }

  @Test
  public void test45()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("yK", "bMAJ:>#s@?!HX#", "yK", 475, "yK", "yK", "bMAJ:>#s@?!HX#");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Userinfo contains invalid character:>
         */
      }
  }

  @Test
  public void test46()  throws Throwable  {
      URI uRI0 = new URI();
      uRI0.setHost((String) null);
      assertEquals("", uRI0.toString());
      assertEquals(-1, uRI0.getPort());
  }

  @Test
  public void test47()  throws Throwable  {
      URI uRI0 = new URI();
      uRI0.setHost("");
      assertEquals(true, uRI0.isGenericURI());
      assertEquals("//", uRI0.toString());
  }

  @Test
  public void test48()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("d", "d", "Argument base is null and argument uriSpec is null or an empty string", 1692, "d", "d", "Argument base is null and argument uriSpec is null or an empty string");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Host is not a well formed address!
         */
      }
  }

  @Test
  public void test49()  throws Throwable  {
      URI uRI0 = new URI("db.", "db.", "db.", 1597, "db.", "db.", "db.");
      assertNotNull(uRI0);
      
      try {
        uRI0.setPort(1490623080);
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Invalid port number!
         */
      }
  }

  @Test
  public void test50()  throws Throwable  {
      URI uRI0 = new URI();
      try {
        uRI0.setPort(0);
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Port cannot be set when host is null!
         */
      }
  }

  @Test
  public void test51()  throws Throwable  {
      URI uRI0 = new URI();
      uRI0.appendPath((String) null);
      assertEquals(-1, uRI0.getPort());
      assertEquals("", uRI0.toString());
  }

  @Test
  public void test52()  throws Throwable  {
      URI uRI0 = new URI("e", "e");
      assertNotNull(uRI0);
      
      uRI0.appendPath("?");
      assertEquals("e/?", uRI0.getPath());
      assertEquals("e:e/?", uRI0.toString());
  }

  @Test
  public void test53()  throws Throwable  {
      URI uRI0 = new URI();
      uRI0.appendPath("");
      assertEquals("", uRI0.toString());
      assertEquals("", uRI0.getSchemeSpecificPart());
  }

  @Test
  public void test54()  throws Throwable  {
      URI uRI0 = new URI();
      try {
        uRI0.appendPath("#");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Path contains invalid character!
         */
      }
  }

  @Test
  public void test55()  throws Throwable  {
      URI uRI0 = new URI();
      uRI0.appendPath("/0Q9");
      assertEquals("/0Q9", uRI0.getSchemeSpecificPart());
      assertEquals(-1, uRI0.getPort());
  }

  @Test
  public void test56()  throws Throwable  {
      URI uRI0 = new URI("hfI", "/");
      assertNotNull(uRI0);
      
      uRI0.appendPath("/");
      assertEquals("/", uRI0.getSchemeSpecificPart());
      assertEquals(-1, uRI0.getPort());
  }

  @Test
  public void test57()  throws Throwable  {
      URI uRI0 = new URI();
      uRI0.appendPath("eML2dmmX~L@C%d8+h;m");
      URI uRI1 = new URI(uRI0, "eML2dmmX~L@C%d8+h;m");
      uRI1.appendPath("eML2dmmX~L@C%d8+h;m");
      assertEquals("/eML2dmmX~L@C%d8+h;m", uRI0.toString());
      assertEquals("//eML2dmmX~L@C%d8+h;m", uRI1.toString());
  }

  @Test
  public void test58()  throws Throwable  {
      URI uRI0 = new URI();
      uRI0.setQueryString((String) null);
      assertEquals("", uRI0.getSchemeSpecificPart());
      assertEquals("", uRI0.toString());
  }

  @Test
  public void test59()  throws Throwable  {
      URI uRI0 = new URI("e", "e");
      assertNotNull(uRI0);
      
      try {
        uRI0.setQueryString("g");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Query string can only be set for a generic URI!
         */
      }
  }

  @Test
  public void test60()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = new URI(uRI0, "//");
      assertNotNull(uRI1);
      
      uRI1.setPath((String) null);
      try {
        uRI1.setQueryString("");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Query string cannot be set when path is null!
         */
      }
  }

  @Test
  public void test61()  throws Throwable  {
      URI uRI0 = new URI("hfI", "X");
      assertNotNull(uRI0);
      
      try {
        uRI0.setFragment("X");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Fragment can only be set for a generic URI!
         */
      }
  }

  @Test
  public void test62()  throws Throwable  {
      URI uRI0 = new URI("dfbkMWcO.", "dfbkMWcO.", "dfbkMWcO.", "dfbkMWcO.", "dfbkMWcO.");
      assertNotNull(uRI0);
      
      uRI0.equals((Object) "Fragment cannot be set when path is null!");
      assertEquals("//dfbkMWcO.dfbkMWcO.?dfbkMWcO.#dfbkMWcO.", uRI0.getSchemeSpecificPart());
      assertEquals("dfbkmwco.://dfbkMWcO.dfbkMWcO.?dfbkMWcO.#dfbkMWcO.", uRI0.toString());
  }

  @Test
  public void test63()  throws Throwable  {
      URI uRI0 = new URI();
      boolean boolean0 = uRI0.equals((Object) uRI0);
      assertEquals("", uRI0.getSchemeSpecificPart());
      assertEquals(true, boolean0);
  }

  @Test
  public void test64()  throws Throwable  {
      URI uRI0 = new URI("f-3O2QTn", "f-3O2QTn");
      assertNotNull(uRI0);
      
      URI uRI1 = new URI();
      uRI0.equals((Object) uRI1);
      assertEquals("f-3o2qtn:f-3O2QTn", uRI0.toString());
      assertEquals("", uRI1.toString());
  }

  @Test
  public void test65()  throws Throwable  {
      URI uRI0 = new URI("A", "A", "A", 1597, "A", "A", "A");
      assertNotNull(uRI0);
      
      boolean boolean0 = uRI0.equals((Object) uRI0);
      assertEquals(true, boolean0);
      assertEquals("a://A@A:1597A?A#A", uRI0.toString());
  }

  @Test
  public void test66()  throws Throwable  {
      URI uRI0 = new URI("db", "db", "db", 90, "db", "db", "db");
      assertNotNull(uRI0);
      
      URI uRI1 = new URI("db", "db");
      assertNotNull(uRI1);
      
      uRI1.equals((Object) uRI0);
      assertEquals(90, uRI0.getPort());
      assertEquals("db:db", uRI1.toString());
      assertEquals("db", uRI1.getSchemeSpecificPart());
  }

  @Test
  public void test67()  throws Throwable  {
      URI uRI0 = new URI("db", "db");
      assertNotNull(uRI0);
      
      URI uRI1 = new URI("db", "db", "db", "db", (String) null);
      assertNotNull(uRI1);
      
      uRI0.equals((Object) uRI1);
      assertEquals("db", uRI1.getPath());
      assertEquals("db", uRI0.getSchemeSpecificPart());
  }

  @Test
  public void test68()  throws Throwable  {
      URI uRI0 = new URI();
      URI uRI1 = new URI(uRI0, "X$Q&");
      assertNotNull(uRI1);
      
      boolean boolean0 = uRI0.equals((Object) uRI1);
      assertEquals("", uRI1.toString());
      assertFalse(uRI1.equals(uRI0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test69()  throws Throwable  {
      URI uRI0 = new URI("e", "e");
      assertNotNull(uRI0);
      
      URI uRI1 = new URI(uRI0, "e");
      boolean boolean0 = uRI1.equals((Object) uRI0);
      assertEquals("e:e", uRI0.toString());
      assertEquals("e:", uRI1.toString());
      assertEquals(false, boolean0);
  }

  @Test
  public void test70()  throws Throwable  {
      URI uRI0 = new URI();
      int int0 = uRI0.hashCode();
      assertEquals(0, int0);
  }

  @Test
  public void test71()  throws Throwable  {
      boolean boolean0 = URI.isConformantSchemeName((String) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test72()  throws Throwable  {
      boolean boolean0 = URI.isConformantSchemeName("");
      assertEquals(false, boolean0);
  }

  @Test
  public void test73()  throws Throwable  {
      boolean boolean0 = URI.isWellFormedAddress((String) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test74()  throws Throwable  {
      boolean boolean0 = URI.isWellFormedAddress("");
      assertEquals(false, boolean0);
  }

  @Test
  public void test75()  throws Throwable  {
      boolean boolean0 = URI.isWellFormedAddress(".3");
      assertEquals(false, boolean0);
  }

  @Test
  public void test76()  throws Throwable  {
      boolean boolean0 = URI.isWellFormedAddress("-3");
      assertEquals(false, boolean0);
  }

  @Test
  public void test77()  throws Throwable  {
      URI uRI0 = new URI();
      try {
        uRI0.setHost("3.");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Host is not a well formed address!
         */
      }
  }

  @Test
  public void test78()  throws Throwable  {
      boolean boolean0 = URI.isWellFormedAddress("0QI97");
      assertEquals(false, boolean0);
  }

  @Test
  public void test79()  throws Throwable  {
      URI uRI0 = null;
      try {
        uRI0 = new URI("dbkMWcO.", "dbkmwco.://dbkMWcO.dbkMWcO./dbkMWcO.?dbkMWcO.#dbkMWcO.", "dbkmwco.://dbkMWcO.dbkMWcO./dbkMWcO.?dbkMWcO.#dbkMWcO.", (-514355543), "dbkMWcO.", "dbkmwco.://dbkMWcO.dbkMWcO./dbkMWcO.?dbkMWcO.#dbkMWcO.", "dbkMWcO.");
        fail("Expecting exception: URI.MalformedURIException");
      } catch(URI.MalformedURIException e) {
        /*
         * Host is not a well formed address!
         */
      }
  }
}
