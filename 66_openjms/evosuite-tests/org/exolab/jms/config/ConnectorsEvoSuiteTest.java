/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Enumeration;
import org.exolab.castor.util.NestedIOException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.Connector;
import org.exolab.jms.config.Connectors;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;

@RunWith(EvoSuiteRunner.class)
public class ConnectorsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      boolean boolean0 = connectors0.isValid();
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      Connector connector0 = new Connector();
      connectors0.addConnector(connector0);
      connectors0.getConnector();
      assertEquals(1, connectors0.getConnectorCount());
  }

  @Test
  public void test2()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      Enumeration<Object> enumeration0 = connectors0.enumerateConnector();
      assertEquals(false, enumeration0.hasMoreElements());
  }

  @Test
  public void test3()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      boolean boolean0 = connectors0.removeConnector((Connector) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      StringWriter stringWriter0 = new StringWriter(85);
      try {
        connectors0.marshal((Writer) stringWriter0);
        fail("Expecting exception: ValidationException");
      } catch(ValidationException e) {
        /*
         * A minimum of 1 Connector object(s) are required.
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      connectors0.clearConnector();
      assertEquals(false, connectors0.isValid());
  }

  @Test
  public void test6()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      Connector connector0 = new Connector();
      connectors0.addConnector(0, connector0);
      assertEquals(1, connectors0.getConnectorCount());
  }

  @Test
  public void test7()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      DefaultHandler defaultHandler0 = new DefaultHandler();
      try {
        connectors0.marshal((ContentHandler) defaultHandler0);
        fail("Expecting exception: NestedIOException");
      } catch(NestedIOException e) {
        /*
         * System property org.xml.sax.parser not specified
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      int int0 = connectors0.getConnectorCount();
      assertEquals(0, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      try {
        connectors0.getConnector((-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      try {
        connectors0.getConnector(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      try {
        connectors0.getConnector(3);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      Connector connector0 = new Connector();
      try {
        connectors0.setConnector((-20), connector0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      Connector connector0 = new Connector();
      try {
        connectors0.setConnector(0, connector0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      try {
        connectors0.setConnector(1, (Connector) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Connectors connectors0 = new Connectors();
      Connector[] connectorArray0 = new Connector[4];
      connectors0.setConnector(connectorArray0);
      assertEquals(4, connectors0.getConnectorCount());
  }

  @Test
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("oBVp0Ga~");
      try {
        Connectors.unmarshal((Reader) stringReader0);
        fail("Expecting exception: MarshalException");
      } catch(MarshalException e) {
        /*
         * Parsing Error : Content is not allowed in prolog.
         * Line : 1
         * Column : 1
         */
      }
  }
}
