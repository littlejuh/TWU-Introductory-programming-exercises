import java.util.Scanner;

public class TWUIntroductoryProgrammingExercises {
    public static void main(String args[]) {
        printOptionsMenu();
        boolean handlerMenu = true;
        while (handlerMenu) {
            handlerMenu = handlerMenu(getInput());
        }
    }

    private static void printOptionsMenu() {
        System.out.println("Choose from these choices:");
        System.out.println("1 - GeometricShape(Triangle and Diamond)");
        System.out.println("2 - FizzBuzz");
        System.out.println("3 - PrimeFactors");
        System.out.println("4 - Quit");
    }

    private static boolean handlerMenu(String optionSelected) {
        switch (optionSelected) {
            case "GeometricShape":
            case "1":
                printGeometricShapes();
                return true;
            case "FizzBuzz":
            case "2":
                new FizzBuzz().foreachNumberPrintFizzBuzz();
                return true;
            case "PrimeFactors":
            case "3":
                printPrimeFactor();
                return true;
            case "Quit":
            case "4":
                System.out.println("Bye");
                return false;
            default:
                System.out.println("Select a valid option!");
                return true;
        }
    }

    private static String getInput() {
        String selection;
        Scanner input = new Scanner(System.in);
        selection = input.nextLine();
        return selection;
    }

    private static void printPrimeFactor() {
        int[] primes = PrimeFactor.generate(30);
        for (int i = 0; i <= primes.length - 1; i++)
            System.out.println(primes[i]);
    }

    private static void printGeometricShapes() {
        GeometricShape asterisk = new GeometricShape();
        GeometricShape line = new GeometricShape('-');
        System.out.println(asterisk.easiest());
        System.out.println(line.horizontalLine(10));
        System.out.println(asterisk.horizontalLine(8));
        System.out.println(line.horizontalLine(10));
        System.out.println(asterisk.rightTriangle(3));
        System.out.println(line.horizontalLine(10));
        System.out.println(asterisk.verticalLine(3));
        System.out.println(line.horizontalLine(10));
        System.out.println(asterisk.isoscelesTriangle(3));
        System.out.println(line.horizontalLine(10));
        System.out.println(asterisk.diamond(3));
        System.out.println(line.horizontalLine(10));
        System.out.println(asterisk.diamondWithName(3, "Bill"));
    }
}
