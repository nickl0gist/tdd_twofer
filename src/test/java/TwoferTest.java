import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TwoferTest{

    private Twofer tw;

    @Before
    public void setup() {
        tw = new Twofer();
    }

    @Test
    public void check_default_name() {
        Assert.assertEquals("One for you, one for me.", tw.twofer());
    }

    @Test
    public void check_Alice_name() {
        Assert.assertEquals("One for Alice, one for me.", tw.twofer("Alice"));
    }


}