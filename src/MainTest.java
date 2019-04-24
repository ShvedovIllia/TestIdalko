import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void isBalancedTest() {
        Assert.assertTrue(Main.isBalanced("(()()())"));
    }

    @Test
    public void isBalancedFailedTest() {
        Assert.assertFalse(Main.isBalanced("((((())"));
    }

}