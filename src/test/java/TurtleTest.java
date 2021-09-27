/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class TurtleTest {
    Turtle t;

    @Before
    public void setUp() throws Exception {
        t = new Turtle();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Meow! :)", t.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        t.upgradeSpeed();
        assertEquals(103, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        t.downgradeSpeed();
        assertEquals(99, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(31415, t.getPrice());
    }

}