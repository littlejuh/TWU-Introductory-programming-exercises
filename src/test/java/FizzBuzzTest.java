import org.junit.*;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnNumber() {
        assertEquals(2, this.fizzBuzz.makeFizzBuzz(2));
    }

    @Test
    public void shouldReturnFizz() {
        assertEquals("Fizz", this.fizzBuzz.makeFizzBuzz(3));
    }

    @Test
    public void shouldReturnBuzz() {
        assertEquals("Buzz", this.fizzBuzz.makeFizzBuzz(5));
    }

    @Test
    public void shouldReturnFizzBuzz() {
        assertEquals("FizzBuzz", this.fizzBuzz.makeFizzBuzz(15));
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldReturnInvalidParameterWhenInvalidArgumentFizzBuzz() {
        this.fizzBuzz.makeFizzBuzz(0);
    }

}
