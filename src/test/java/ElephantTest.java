import org.junit.*;

import static org.junit.Assert.*;


public class ElephantTest {

    Elephant e;

    @Before
    public void setUp() throws Exception {
        e = new Elephant();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(12, e.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        e.upgradeSpeed();
        assertEquals(17, e.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        e.downgradeSpeed();
        assertEquals(7, e.getMaxSpeed());
    }


}
