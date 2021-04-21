/*
 * This file was automatically generated by EvoSuite
 */


import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import javax.jms.JMSException;
import javax.jms.Message;
import org.exolab.jms.message.MessageImpl;
import org.exolab.jms.message.TextMessageImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SampleListenerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SampleListener sampleListener0 = new SampleListener();
      MessageImpl messageImpl0 = new MessageImpl();
      sampleListener0.onMessage((Message) messageImpl0);
      assertEquals(false, messageImpl0.getJMSRedelivered());
  }

  @Test
  public void test1()  throws Throwable  {
      SampleListener sampleListener0 = new SampleListener();
      TextMessageImpl textMessageImpl0 = new TextMessageImpl();
      sampleListener0.onMessage((Message) textMessageImpl0);
      assertEquals(false, textMessageImpl0.getReadOnly());
  }
}