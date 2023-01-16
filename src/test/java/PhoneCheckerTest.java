import Demos.PhoneChecker;
import Demos.PhoneTypeEnum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PhoneCheckerTest {

    PhoneChecker checker;

    @Before
    public void setUp() throws Exception {
        checker = new PhoneChecker("12345", PhoneTypeEnum.HOME);


    }

    @Test
    public void checkValid() {
        Assert.assertTrue(checker.testPhone("12345"));
    }

    @Test
    public void checkInvalid() {
        Assert.assertFalse(checker.testPhone("A76744"));
    }
}
