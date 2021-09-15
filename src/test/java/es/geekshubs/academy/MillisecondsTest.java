package es.geekshubs.academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MillisecondsTest {

  private Milliseconds milliseconds;

  @Before
  public void setUp() throws Exception {
    this.milliseconds = new Milliseconds();
  }

  @After
  public void tearDown() throws Exception {
    this.milliseconds = null;
  }

  @Test public void test1 () {
    final int expected =  61000;
    final int result = milliseconds.apply(0,1,1);
    assertEquals(expected, result);  }

  @Test public void test2 () {
    final int expected =  0;
    final int result = milliseconds.apply(0,0,0);
    assertEquals(expected, result);
  }

  @Test public void test3 () {
    final int expected =  3601000;
    final int result = milliseconds.apply(1,0,1);
    assertEquals(expected, result);
  }

  @Test public void test4 () {
    final int expected =  3661000;
    final int result = milliseconds.apply(1,1,1);
    assertEquals(expected, result);
  }

  @Test public void test5 () {
    final int expected =  3600000;
    final int result = milliseconds.apply(1,0,0);
    assertEquals(expected, result);
  }

  @Test public void test6 () {
    final int expected =  60000;
    final int result = milliseconds.apply(0,1,0);
    assertEquals(expected, result);
  }

  @Test public void test7 () {
    final int expected =  1000;
    final int result = milliseconds.apply(0,0,1);
    assertEquals(expected, result);
  }

  @Test public void test8 () {
    final int expected =  86399000;
    final int result = milliseconds.apply(23,59,59);
    assertEquals(expected, result);
  }

  @Test public void test9 () {
    final int expected =  -1;
    final int result = milliseconds.apply(24,10,10);
    assertEquals(expected, result);
  }

  @Test public void test10 () {
    final int expected =  -1;
    final int result = milliseconds.apply(1,60,0);
    assertEquals(expected, result);
  }

  @Test public void test11 () {
    final int expected =  -1;
    final int result = milliseconds.apply(0,0,60);
    assertEquals(expected, result);
  }

  @Test public void test12 () {
    final int expected =  55506000;
    final int result = milliseconds.apply(15,25,6);
    assertEquals(expected, result);
  }

  @Test public void test13 () {
    final int expected =  85510000;
    final int result = milliseconds.apply(23,45,10);
    assertEquals(expected, result);
  }

  @Test public void test14 () {
    final int expected =  37508000;
    final int result = milliseconds.apply(10,25,8);
    assertEquals(expected, result);
  }

  @Test public void test15 () {
    final int expected =  2400000;
    final int result = milliseconds.apply(0,40,0);
    assertEquals(expected, result);
  }

  @Test public void test16 () {
    final int expected =  -1;
    final int result = milliseconds.apply(-1,12,0);
    assertEquals(expected, result);
  }

  @Test public void test17 () {
    final int expected =  -1;
    final int result = milliseconds.apply(50,-1,16);
    assertEquals(expected, result);
  }

  @Test public void test18 () {
    final int expected =  -1;
    final int result = milliseconds.apply(39,45,-1);
    assertEquals(expected, result);
  }

  @Test public void test19 () {
    final int expected =  21966000;
    final int result = milliseconds.apply(6,6,6);
    assertEquals(expected, result);
  }

  @Test public void test20 () {
    final int expected =  -1;
    final int result = milliseconds.apply(99,76,60);
    assertEquals(expected, result);
  }

}