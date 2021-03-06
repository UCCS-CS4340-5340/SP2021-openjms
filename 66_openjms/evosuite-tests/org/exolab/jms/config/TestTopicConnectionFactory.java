/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.Writer;
import org.exolab.castor.util.NestedIOException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.jms.config.TopicConnectionFactory;
import org.junit.BeforeClass;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderAdapter;

@RunWith(EvoSuiteRunner.class)
public class TestTopicConnectionFactory {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TopicConnectionFactory topicConnectionFactory0 = new TopicConnectionFactory();
      // Undeclared exception!
      try {
        topicConnectionFactory0.marshal((Writer) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'out' is null.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TopicConnectionFactory topicConnectionFactory0 = new TopicConnectionFactory();
      boolean boolean0 = topicConnectionFactory0.isValid();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      TopicConnectionFactory topicConnectionFactory0 = new TopicConnectionFactory();
      XMLReaderAdapter xMLReaderAdapter0 = new XMLReaderAdapter();
      try {
        topicConnectionFactory0.marshal((ContentHandler) xMLReaderAdapter0);
        fail("Expecting exception: NestedIOException");
      } catch(NestedIOException e) {
        /*
         * System property org.xml.sax.parser not specified
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      pipedWriter0.write("H");
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) pipedReader0);
      try {
        TopicConnectionFactory.unmarshal((Reader) lineNumberReader0);
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
