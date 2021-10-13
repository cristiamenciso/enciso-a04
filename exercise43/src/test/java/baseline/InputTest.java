package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void setSiteName() {
        Input test = new Input();
        test.setSiteName("Cool.com");
        String actual = test.getSiteName();
        String expected = "Cool.com";
        assertEquals(expected, actual);
    }

    @Test
    void getSiteName() {
        Input test = new Input();
        String actual = test.getSiteName();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void setAuthor() {
        Input test = new Input();
        test.setAuthor("Cristiam Enciso");
        String actual = test.getAuthor();
        String expected = "Cristiam Enciso";
        assertEquals(expected, actual);
    }

    @Test
    void getAuthor() {
        Input test = new Input();
        String actual = test.getAuthor();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void setJs() {
        Input test = new Input();
        test.setJS("y");
        String actual = test.getJS();
        String expected = "y";
        assertEquals(expected, actual);
    }

    @Test
    void getJs() {
        Input test = new Input();
        String actual = test.getJS();
        String expected = null;
        assertEquals(expected, actual);
    }

    @Test
    void setCss() {
        Input test = new Input();
        test.setCSS("y");
        String actual = test.getCSS();
        String expected = "y";
        assertEquals(expected, actual);
    }

    @Test
    void getCss() {
        Input test = new Input();
        String actual = test.getCSS();
        String expected = null;
        assertEquals(expected, actual);
    }


}