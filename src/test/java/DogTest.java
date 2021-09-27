/* This file does the testing for Dog.java
 */

import org.junit.*;
import static org.junit.Assert.*;

public class DogTest {
    Dog dog;

    @Before
    public void setUp() throws Exception {
        dog = new Dog();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Woof!", dog.sound());
    }

    @Test(timeout = 50)
    public void TestGetHappiness() {
        assertEquals(10, dog.getHappiness());
    }

    @Test(timeout = 50)
    public void TestFeedTreat() {
        dog.feedTreat(8);
        assertEquals(50, dog.getHappiness());
    }

    @Test(timeout = 50)
    public void TestPunishment() {
        dog.punishment(100);
        assertEquals(0, dog.getHappiness());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, dog.getPrice());
    }

}
