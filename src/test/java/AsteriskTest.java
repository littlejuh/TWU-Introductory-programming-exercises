import org.junit.*;

import static org.junit.Assert.*;
public class AsteriskTest {

    @Test
    public void easiest(){
        assertEquals("*", new Asterisk().easiest());
    }

    @Test
    public void horizontalLine(){
        assertEquals("********",  new Asterisk().horizontalLine(8));
    }

    @Test
    public void verticalLine(){
        assertEquals("*\n" + "*\n" + "*",  new Asterisk().verticalLine(3));
    }

    @Test
    public void rightTriangle(){
        System.out.println(new Asterisk().rightTriangle(3));
        assertEquals("*\n" + "**\n" + "***", new Asterisk().rightTriangle(3));
    }

}