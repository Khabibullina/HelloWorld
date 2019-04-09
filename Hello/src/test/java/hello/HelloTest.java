package hello;

import hello.Hello;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class HelloTest {

    private Hello main;

    @Before
    public void load() {
        main = new Hello();
    }

    @Test
    public void shouldBigger() {
        assertTrue(main.isBigger(10, 5));
    }

    @Test
    public void shouldNotBigger() {
        assertFalse(main.isBigger(5, 5));
    }

    @Test
    public void shouldEquals() {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));

        Hello.main(null);

        System.setOut(consoleStream);

        String actual = byteArrayOutputStream.toString();
        String expected = "Hello world!" + System.lineSeparator() +
                "true" + System.lineSeparator();

        assertEquals(expected, actual);
    }
}