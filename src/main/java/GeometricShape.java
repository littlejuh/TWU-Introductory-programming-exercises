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

    public String isoscelesTriangle(int numberOfLines) {
        this.validateNumberOfLines(numberOfLines);

        StringBuilder shapeToReturn = new StringBuilder();
        shapeToReturn.append(this.putWhiteSpace(numberOfLines-1));
        shapeToReturn.append(this.shape);

        if (numberOfLines >= 2) {
            for (int i = 1; i <= numberOfLines - 1; i++) {
                shapeToReturn.append("\n" +
                        shapeToReturn.substring(shapeToReturn.length() - i - numberOfLines + 2,
                                shapeToReturn.length()) + this.shape + this.shape);
            }
        }
        return shapeToReturn.toString();
    }

    public String diamond(int numberOfLines) {
        this.validateNumberOfLines(numberOfLines);

        StringBuilder shapeToReturn = new StringBuilder();
        int middle = (int) Math.ceil((double) (numberOfLines + 2) / 2);

        shapeToReturn.append(putWhiteSpace(middle-1));
        shapeToReturn.append(this.shape);

        if (numberOfLines % 2 == 0) {
            shapeToReturn.append(this.shape);
        }

        for (int i = 1; i <= numberOfLines + 1; i++) {
            if (i < middle) {
                shapeToReturn.append("\n" +
                        shapeToReturn.substring(shapeToReturn.length() - numberOfLines / 2 - i,
                                shapeToReturn.length()) + this.shape + this.shape);
            } else {
                shapeToReturn.append("\n " +
                        shapeToReturn.substring(shapeToReturn.length() - (numberOfLines + 2 + middle - i),
                                shapeToReturn.length() - 2));
            }
        }
        return shapeToReturn.toString();
    }

    private void validateNumberOfLines(int numberOfLines){
        if (numberOfLines <= 0) {
            throw new InvalidParameterException();
        }
    }

    private String putWhiteSpace(int n) {
        String space = "";
        for (int i = 0; i < n; i++) {
            space = " " + space;
        }
        return space;
    }

    public char getShape() {
        return this.shape;
    }
}
