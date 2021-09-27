import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DogTest {
    Dog c;
    Dog gs;

    @Before
    public void setUp() {
        c = new Dog("Chihuahua");
        gs = new Dog("German Shepherd");
    }

    @Test(timeout=50)
    public void TestGetBreed() {
        assertEquals("Chihuahua", c.getBreed());
        assertEquals("German Shepherd", gs.getBreed());
    }

    @Test(timeout=50)
    public void TestGetPrice() {
        assertEquals(5, c.getPrice());
        assertEquals(20, gs.getPrice());
    }

    @Test(timeout=50)
    public void TestSound() {
        assertEquals("Woof!", c.sound());
        assertEquals("Woof!", gs.sound());
        assertEquals(c.sound(), gs.sound());
    }

}
