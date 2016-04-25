import java.security.InvalidParameterException;

public class GeometricShape {

    private final char shape;

    public GeometricShape() {
        this.shape = '*';
    }

    public GeometricShape(char c) {
        this.shape = c;
    }

    public char easiest() {
        return this.shape;
    }

    public String horizontalLine(int numberOfLines) {
        this.validateNumberOfLines(numberOfLines);

        StringBuilder shapeToReturn = new StringBuilder();
        for (int i = 0; i < numberOfLines; i++) {
            shapeToReturn = shapeToReturn.append(this.shape);
        }
        return shapeToReturn.toString();
    }

    public String verticalLine(int numberOfLines) {
        this.validateNumberOfLines(numberOfLines);

        String character = Character.toString(this.shape);
        StringBuilder shapeToReturn = new StringBuilder(character);
        if (numberOfLines >= 2) {
            for (int i = 1; i <= numberOfLines - 1; i++) {
                shapeToReturn.append("\n" + character);
            }
        }
        return shapeToReturn.toString();
    }

    public String rightTriangle(int numberOfLines) {
        this.validateNumberOfLines(numberOfLines);
        String character = Character.toString(this.shape);
        StringBuilder shapeToReturn = new StringBuilder(character);
        if (numberOfLines >= 2) {
            for (int i = 1; i <= numberOfLines - 1; i++) {
                shapeToReturn.append("\n" + character +
                        shapeToReturn.substring(shapeToReturn.length() - i, shapeToReturn.length()));
            }
        }
        return shapeToReturn.toString();
    }

    public String isoscelesTriangle(int n) {
        this.validateNumberOfLines(n);
        String stringFinal = horizontalLine(n + 2) + "\n";
        String sideLine;
        for(int i = n; i > n/2 ; i--){
            sideLine = reduceLine(stringFinal, i);
            stringFinal = String.format("%s%s", sideLine, stringFinal);
        }
        stringFinal = stringFinal.substring(0, stringFinal.length()-1);
        return stringFinal;
    }

    public String diamond(int n) {
        String middleLine = horizontalLine(n + 2);
        return diamondWithName(n,middleLine);
    }

    public String diamondWithName(int n, String name) {
        this.validateNumberOfLines(n);
        String sideLine = " " + horizontalLine(n) + "\n";
        String stringFinal = String.format("%s%s%s", sideLine, name + "\n", sideLine);
        for(int i = n-1; i > n/2 ; i--){
            sideLine = reduceLine(stringFinal, i);
            stringFinal = String.format("%s%s%s", sideLine, stringFinal, sideLine);
        }
        stringFinal = stringFinal.substring(0, stringFinal.length()-1);
        return stringFinal;
    }

    private void validateNumberOfLines(int numberOfLines) {
        if (numberOfLines <= 0) {
            throw new InvalidParameterException();
        }
    }

    public char getShape() {
        return this.shape;
    }

    private String reduceLine(String string, int index) {
        return " " + string.substring(0, index) + "\n";
    }

}