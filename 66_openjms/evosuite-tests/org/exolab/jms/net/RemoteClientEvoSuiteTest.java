/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.net;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import org.exolab.jms.net.RemoteClient;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RemoteClientEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Class<?> class0 = RemoteClient.class;
      RemoteClient remoteClient0 = null;
      try {
        remoteClient0 = new RemoteClient("", "", (Class) class0);
        fail("Expecting exception: RemoteException");
      } catch(RemoteException e) {
        /*
         * Invalid URI: ; nested exception is: 
         * \torg.exolab.jms.net.uri.InvalidURIException: Argument base is null and argument uriSpec is null or an empty string
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Class<?> class0 = RemoteClient.class;
      RemoteClient remoteClient0 = null;
      try {
        remoteClient0 = new RemoteClient("tcps", "tcps", (Class) class0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Failed to locate keystore: /mnt/fastdata/ac1gf/SF110/dist/66_openjms/modules/net/target/test.keystore
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Class<?> class0 = RemoteClient.class;
      RemoteClient remoteClient0 = null;
      try {
        remoteClient0 = new RemoteClient("https", "https", (Class) class0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Failed to locate keystore: /mnt/fastdata/ac1gf/SF110/dist/66_openjms/modules/net/target/test.keystore
         */
      }
  }
}