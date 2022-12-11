import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    Guitar guitar;

    Strings strings;

    InstrumentType instrumentType;

    @Before
    public void before() {
        shop = new Shop("Coding Music");
        guitar = new Guitar("JCRG2204", 3000.0, 5790.0,instrumentType.STRINGS, "Wenge wood", "Ibanez");
        strings = new Strings("Gibson", 1.0, 5.0, "Guitar Strings");
    }

    @Test
    public void storeHasAName() {
        assertEquals("Coding Music", shop.getName());
    }


}
