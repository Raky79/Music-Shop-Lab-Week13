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

    @Test
    public void shopCanAddItemToStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(strings);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void shopCanRemoveItemFromStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(strings);
        shop.addItemToStock(strings);
        shop.removeItemFromStock(guitar);
        assertEquals(2, shop.stockCount());
    }


}
