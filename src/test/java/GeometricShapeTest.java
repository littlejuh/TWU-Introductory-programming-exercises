import org.junit.*;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class GeometricShapeTest {

    private GeometricShape geometricShape;
    private char shape;

    @Before
    public void setUp() {
        this.geometricShape = new GeometricShape();
        this.shape = geometricShape.getShape();
    }

    @Test
    public void shouldReturnEasiest() {
        assertEquals(this.shape, this.geometricShape.easiest());
    }

    @Test
    public void shouldReturnHorizontalLine() {
        StringBuilder expected = new StringBuilder();
        expected.append(this.shape).append(this.shape).append(this.shape).append(this.shape).append(this.shape)
                .append(this.shape).append(this.shape).append(this.shape);

        assertEquals(expected.toString(),
                this.geometricShape.horizontalLine(8));
    }

    @Test
    public void shouldReturnVerticalLine() {
        assertEquals(this.shape + "\n" + this.shape + "\n" + this.shape, this.geometricShape.verticalLine(3));
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldReturnInvalidParameterWhenInvalidNumberOfLinesInVerticalLine() {
        this.geometricShape.verticalLine(0);
    }

    @Test
    public void shouldReturnRightTriangle() {
        assertEquals(this.shape + "\n" + this.shape + this.shape + "\n" + this.shape + this.shape + this.shape,
                this.geometricShape.rightTriangle(3));
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldReturnInvalidParameterWhenInvalidNumberOfLinesInRightTriangle() {
        this.geometricShape.rightTriangle(0);
    }

    @Test
    public void shouldReturnIsoscelesTriangle() {
        assertEquals("  " + this.shape + "\n " + this.shape + this.shape + this.shape + "\n"
                        + this.shape + this.shape + this.shape + this.shape + this.shape,
                this.geometricShape.isoscelesTriangle(3));
    }

    @Test(expected = InvalidParameterException.class)
    public void shouldReturnInvalidParameterWhenInvalidNumberOfLinesInIsoscelesTriangle() {
        this.geometricShape.isoscelesTriangle(0);
    }

    @Test
    public void shouldReturnDiamond() {
        assertEquals("  " + this.shape + "\n" + " " + this.shape + this.shape + this.shape + "\n"
                        + this.shape + this.shape + this.shape + this.shape + this.shape + "\n"
                        + " " + this.shape + this.shape + this.shape + "\n" + "  " + this.shape,
                this.geometricShape.diamond(3));
    }

    /*
    @Test
    public void shouldReturnDiamondWithName() {
        assertEquals("  " + this.shape + "\n" + " " + this.shape + this.shape + this.shape + "\n" + "Bill" +"\n"
                        + " " + this.shape + this.shape + this.shape + "\n" + "  " + this.shape,
                this.geometricShape.diamondWithName(3, "Bill"));
    }
    */
}