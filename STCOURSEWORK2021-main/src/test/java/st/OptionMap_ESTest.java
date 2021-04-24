/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 31 16:45:17 GMT 2021
 */

package st;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import st.OptionMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OptionMap_ESTest extends OptionMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("A", "", 4);
      assertEquals(1, OptionMap.INTEGER);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("xV", "xV", 2);
      optionMap0.setValueWithOptioShortcut("xV", ", value=");
      assertEquals(1, OptionMap.INTEGER);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("xV", "xV", 2);
      optionMap0.setValueWithOptionName("xV", "");
      assertEquals(1, OptionMap.INTEGER);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("<nq<+XS0\"x6[1{%", "OptionMap [options=\n]", (Integer) 3);
      optionMap_Option0.setValue("OptionMap [options=\n]");
      assertEquals("OptionMap [options=\n]", optionMap_Option0.getShortcut());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option((String) null, "~XP7G%=", (Integer) 3);
      String string0 = optionMap_Option0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("m1t=ET", (Integer) 4);
      String string0 = optionMap_Option0.getName();
      assertEquals("m1t=ET", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("", "", (Integer) 1);
      Integer integer0 = optionMap_Option0.getType();
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("", "", (Integer) 1);
      String string0 = optionMap_Option0.getShortcut();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("lE", (Integer) 2);
      OptionMap.Option optionMap_Option1 = optionMap0.new Option("n?", "n?", (Integer) 4);
      boolean boolean0 = optionMap_Option1.equals(optionMap_Option0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option((String) null, (Integer) 3);
      OptionMap.Option optionMap_Option1 = optionMap0.new Option((String) null, (String) null, (Integer) 2);
      boolean boolean0 = optionMap_Option0.equals(optionMap_Option1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("", "", (Integer) 1);
      OptionMap.Option optionMap_Option1 = optionMap0.new Option((String) null, "", (Integer) 1);
      boolean boolean0 = optionMap_Option1.equals(optionMap_Option0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap optionMap1 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap1.new Option("st.OptionMap$Option", "OptionMap [options=\n", (Integer) 1);
      OptionMap.Option optionMap_Option1 = optionMap0.new Option("$GB>%@r;qUP", (Integer) optionMap0.CHAR);
      boolean boolean0 = optionMap_Option1.equals(optionMap_Option0);
      assertFalse(boolean0);
      assertEquals("OptionMap [options=\n", optionMap_Option0.getShortcut());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("OptionMap [options=\n]", "OptionMap [options=\n", (Integer) 4);
      Object object0 = new Object();
      boolean boolean0 = optionMap_Option0.equals(object0);
      assertFalse(boolean0);
      assertEquals("OptionMap [options=\n", optionMap_Option0.getShortcut());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("8`cG]pIrWZIYlbtBw `", "8`cG]pIrWZIYlbtBw `", (Integer) 3);
      boolean boolean0 = optionMap_Option0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("<nq<+XS0\"x6[1{%", "OptionMap [options=\n]", (Integer) 3);
      boolean boolean0 = optionMap_Option0.equals(optionMap_Option0);
      assertTrue(boolean0);
      assertEquals("OptionMap [options=\n]", optionMap_Option0.getShortcut());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("A", "A", 1);
      String string0 = optionMap0.toString();
      assertEquals("OptionMap [options=\n\t{name=A, shortcut=A, type=1, value=}\n]", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      // Undeclared exception!
      try { 
        optionMap0.store("keF7p2f", "keF7p2f", 640);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("st.OptionMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      // Undeclared exception!
      try { 
        optionMap0.store("J", "J", (-2147483645));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("st.OptionMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      // Undeclared exception!
      try { 
        optionMap0.store("A", "-", 4);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("st.OptionMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      // Undeclared exception!
      try { 
        optionMap0.store("FvF$oo<BJ+", "OptionMap [options=\n]", 31);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("st.OptionMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      // Undeclared exception!
      try { 
        optionMap0.store("", "", 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("st.OptionMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      // Undeclared exception!
      try { 
        optionMap0.store((String) null, (String) null, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("st.OptionMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("xV", "xV", 2);
      optionMap0.setValueWithOptioShortcut("m}", "q!6x8Z,:I$}}akG*O");
      assertEquals(3, OptionMap.STRING);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("xV", "xV", 2);
      optionMap0.setValueWithOptionName("\t{name=", "xV");
      assertEquals(3, OptionMap.STRING);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("U7", "A", 3);
      int int0 = optionMap0.getType("Fh8.7gdP,o");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("lE", "lE", 2);
      int int0 = optionMap0.getType("lE");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("U7", "A", 3);
      int int0 = optionMap0.getType("A");
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("lH", "", 1);
      String string0 = optionMap0.getValue("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      String string0 = optionMap0.getValue("<nq<+XS0\"x6[1{%");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("xV", "xV", 2);
      optionMap0.store("xV", "xV", 2);
      assertEquals(4, OptionMap.CHAR);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      // Undeclared exception!
      try { 
        optionMap0.store("A", (String) null, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("st.OptionMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("xV", "xV", 2);
      String string0 = optionMap0.getValue("xV");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("xV", "xV", 2);
      optionMap0.setValueWithOptioShortcut("xV", "xV");
      String string0 = optionMap0.getValue("xV");
      assertEquals("xV", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("", "", (Integer) 1);
      optionMap_Option0.setShortcut("");
      assertEquals("", optionMap_Option0.getName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("uZY!", (Integer) 3);
      optionMap_Option0.setName("uZY!");
      assertEquals("", optionMap_Option0.getValue());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      optionMap0.store("U7", "A", 3);
      String string0 = optionMap0.getValue("}Yvc#-\"U^B$bu#!6ct/");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OptionMap optionMap0 = new OptionMap();
      OptionMap.Option optionMap_Option0 = optionMap0.new Option("K", "K", (Integer) 4);
      optionMap_Option0.setType((Integer) 2);
      assertEquals("K", optionMap_Option0.getName());
  }
}