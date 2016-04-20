
public class TWUIntroductoryProgrammingExercises {
    public static void main(String args[]) {
        printGeometricShapes();
        new FizzBuzz().foreachNumberPrintFizzBuzz();
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
