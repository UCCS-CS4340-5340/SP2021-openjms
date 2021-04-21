/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.messagemgr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.jms.InvalidSelectorException;
import javax.jms.JMSException;
import org.exolab.jms.client.JmsTemporaryTopic;
import org.exolab.jms.client.JmsTopic;
import org.exolab.jms.messagemgr.DestinationManager;
import org.exolab.jms.messagemgr.DurableConsumerEndpoint;
import org.exolab.jms.messagemgr.TopicConsumerEndpoint;
import org.exolab.jms.persistence.PersistenceException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestAbstractConsumerEndpoint {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JmsTopic jmsTopic0 = new JmsTopic("Nug+y");
      DurableConsumerEndpoint durableConsumerEndpoint0 = null;
      try {
        durableConsumerEndpoint0 = new DurableConsumerEndpoint((-571L), jmsTopic0, "Nug+y", (DestinationManager) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TopicConsumerEndpoint topicConsumerEndpoint0 = null;
      try {
        topicConsumerEndpoint0 = new TopicConsumerEndpoint((-1397L), (-1397L), (JmsTopic) null, "", false, (DestinationManager) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Argument 'destination' is null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      JmsTemporaryTopic jmsTemporaryTopic0 = new JmsTemporaryTopic();
      TopicConsumerEndpoint topicConsumerEndpoint0 = null;
      try {
        topicConsumerEndpoint0 = new TopicConsumerEndpoint((-1006L), (-1006L), (JmsTopic) jmsTemporaryTopic0, "/%$2_o:", true, (DestinationManager) null);
        fail("Expecting exception: InvalidSelectorException");
      } catch(InvalidSelectorException e) {
        /*
         * line 1, column 1: unexpected token: /
         */
      }
  }
}
