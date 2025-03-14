package school.redrover;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void testSum() {
        Assert.assertEquals(Main.getSum(1,1), 2);
        Assert.assertEquals(Main.getSum(0,0), 0);
        Assert.assertEquals(Main.getSum(-10,-5), -15);
        Assert.assertEquals(Main.getSum(-10,5), -5);
    }
}
