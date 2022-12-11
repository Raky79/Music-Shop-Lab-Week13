import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings strings;

    @Before
    public void before() {
        strings = new Strings("Fender", 1.0, 7.0, "Guitar Strings");
    }

    @Test
    public void stringsHaveName() {
        assertEquals("Fender", strings.getName());
    }

    @Test
    public void stringsSaleHasMarkup() {
        assertEquals(6.0, strings.calculateMarkup(6.0), 0.0);
    }

    @Test
    public void stringsHaveADescription() {
        assertEquals("Guitar Strings", strings.getDescription());
    }
}
