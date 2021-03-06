/*
 * This file was automatically generated by EvoSuite
 */

package org.exolab.jms.selector.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import antlr.ANTLRLexer;
import antlr.ANTLRTokdefLexer;
import antlr.CharBuffer;
import antlr.InputBuffer;
import antlr.LexerSharedInputState;
import antlr.NoViableAltException;
import antlr.ParserSharedInputState;
import antlr.RecognitionException;
import antlr.TokenBuffer;
import antlr.TokenStream;
import antlr.TokenStreamException;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.io.Reader;
import java.io.StringReader;
import org.exolab.jms.selector.SelectorException;
import org.exolab.jms.selector.parser.SelectorAST;
import org.exolab.jms.selector.parser.SelectorParser;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestSelectorParser {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ANTLRLexer aNTLRLexer0 = new ANTLRLexer((LexerSharedInputState) null);
      SelectorParser selectorParser0 = new SelectorParser((TokenStream) aNTLRLexer0);
      selectorParser0.initialise();
      assertEquals(0, selectorParser0.mark());
  }

  @Test
  public void test1()  throws Throwable  {
      ParserSharedInputState parserSharedInputState0 = new ParserSharedInputState();
      SelectorParser selectorParser0 = new SelectorParser(parserSharedInputState0);
      assertEquals(false, selectorParser0.isDebugMode());
  }

  @Test
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'Y';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader((Reader) charArrayReader0);
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) bufferedReader0);
      ANTLRTokdefLexer aNTLRTokdefLexer0 = new ANTLRTokdefLexer((Reader) lineNumberReader0);
      SelectorParser selectorParser0 = new SelectorParser((TokenStream) aNTLRTokdefLexer0, (int) 'l');
      try {
        selectorParser0.selector();
        fail("Expecting exception: SelectorException");
      } catch(SelectorException e) {
        /*
         * line 1, column 1: unexpected token: Y
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)50;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ANTLRTokdefLexer aNTLRTokdefLexer0 = new ANTLRTokdefLexer((InputStream) byteArrayInputStream0);
      SelectorParser selectorParser0 = new SelectorParser((TokenStream) aNTLRTokdefLexer0, (int) (byte)0);
      try {
        selectorParser0.orExpression();
        fail("Expecting exception: NoViableAltException");
      } catch(NoViableAltException e) {
        /*
         * unexpected token: 2
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'j';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader((Reader) charArrayReader0);
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) bufferedReader0);
      ANTLRTokdefLexer aNTLRTokdefLexer0 = new ANTLRTokdefLexer((Reader) lineNumberReader0);
      TokenBuffer tokenBuffer0 = new TokenBuffer((TokenStream) aNTLRTokdefLexer0);
      SelectorParser selectorParser0 = new SelectorParser(tokenBuffer0);
      SelectorAST selectorAST0 = new SelectorAST();
      try {
        selectorParser0.comparisonExpression(selectorAST0);
        fail("Expecting exception: NoViableAltException");
      } catch(NoViableAltException e) {
        /*
         * unexpected token: j
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      StringReader stringReader0 = new StringReader("L2MJHi;");
      CharBuffer charBuffer0 = new CharBuffer((Reader) stringReader0);
      ANTLRTokdefLexer aNTLRTokdefLexer0 = new ANTLRTokdefLexer((InputBuffer) charBuffer0);
      TokenBuffer tokenBuffer0 = new TokenBuffer((TokenStream) aNTLRTokdefLexer0);
      SelectorParser selectorParser0 = new SelectorParser(tokenBuffer0, 0);
      try {
        selectorParser0.unaryExpression();
        fail("Expecting exception: NoViableAltException");
      } catch(NoViableAltException e) {
        /*
         * unexpected token: L2MJHi
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)50;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ANTLRTokdefLexer aNTLRTokdefLexer0 = new ANTLRTokdefLexer((InputStream) byteArrayInputStream0);
      SelectorParser selectorParser0 = new SelectorParser((TokenStream) aNTLRTokdefLexer0);
      try {
        selectorParser0.term();
        fail("Expecting exception: NoViableAltException");
      } catch(NoViableAltException e) {
        /*
         * unexpected token: 2
         */
      }
  }
}
