package school.redrover;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BlockTest {

    @Test
    public void basicTests() {
        Assert.assertEquals("Lew", Kata.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Lew"));
        Assert.assertEquals("Harry", Kata.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4), "Harry"));
        Assert.assertEquals("Harald", Kata.declareWinner(new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4), "Harry"));
        Assert.assertEquals("Harald", Kata.declareWinner(new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4), "Harald"));
        Assert.assertEquals("Harald", Kata.declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Jerry"));
        Assert.assertEquals("Harald", Kata.declareWinner(new Fighter("Jerry", 30, 3),
                new Fighter("Harald", 20, 5), "Harald"));
    }

}
