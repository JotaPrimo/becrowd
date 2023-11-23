import br.com.classes.HelloWord;
import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {

    private final String RESULT = "Hello World!\n";
    private final String RESULT_NOT_EXPECTED = "Hello World!";
    @Test
    public void test_deve_ser_igual () {
        Assert.assertTrue("Deve ser igual", HelloWord.start() == RESULT);
    }

    @Test
    public void test_nao_deve_ser_igual() {
        Assert.assertNotEquals(HelloWord.start(), RESULT_NOT_EXPECTED);
    }



}
