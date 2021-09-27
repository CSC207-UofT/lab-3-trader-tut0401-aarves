import org.junit.*;

import static org.junit.Assert.*;


public class OrcTest {
    Orc o;

    @Before
    public void setUp() throws Exception {
        o = new Orc();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("growl", o.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50, o.getPrice());
    }

}