import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertArrayEquals;

public class PrimeFactorTest {

    @Test
    public void shouldReturnPrimes() {
        int[] expected = new int[3];
        expected[0] = 2;
        expected[1] = 3;
        expected[2] = 5;
        assertArrayEquals(expected, PrimeFactor.generate(30));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldReturnNoSuchElementExceptionGeneratePrimeFactor() {
        PrimeFactor.generate(1);
    }


}
