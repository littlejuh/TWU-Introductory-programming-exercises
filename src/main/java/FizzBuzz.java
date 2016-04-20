import java.security.InvalidParameterException;
import java.util.ArrayList;

public class FizzBuzz {
    private final ArrayList<Object> fizzBuzzSequence;

    public FizzBuzz() {
        this.fizzBuzzSequence = new ArrayList<Object>();
        this.upTo();
    }

    public Object makeFizzBuzz(int number) {
        if (number <= 0) {
            throw new InvalidParameterException();
        } else {
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            }
            if (number % 3 == 0) {
                return "Fizz";
            }
            if (number % 5 == 0) {
                return "Buzz";
            }
        }
        return number;
    }

    private void upTo() {
        for (int i = 1; i <= 100; i++) {
            this.fizzBuzzSequence.add(this.makeFizzBuzz(i));
        }
    }

    public void foreachNumberPrintFizzBuzz() {
        for (Object l : this.fizzBuzzSequence) {
            System.out.println(l.toString());
        }
    }
}
