import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    InstrumentType instrumentType;

    @Before
    public void before() {
        drums = new Drums("Superstar", 1000.0, 2500.0, instrumentType.PERCUSSION, "birch", "Tama" );
    }

    @Test
    public void drumsHaveAName() {
        assertEquals("Superstar", drums.getName());
    }

    @Test
    public void drumsHaveABuyingPrice() {
        assertEquals(1000.0, drums.getPriceBought(), 0.0);
    }

    @Test
    public void drumsHaveASellingPrice() {
        assertEquals(2500.0, drums.getPriceSold(), 0.0);
    }

    @Test
    public void drumsHaveAnInstrumentType() {
        assertEquals(instrumentType.PERCUSSION, drums.getInstrumentType());
    }

    @Test
    public void drumsHaveMaterial() {
        assertEquals("birch", drums.getMaterial());
    }

    @Test
    public void drumsHaveManufacturer() {
        assertEquals("Tama", drums.getManufacturer());
    }

    @Test
    public void drumsAreBeingPlayed() {
        assertEquals("And the drum goes: da dum da dum", drums.playInstrument("da dum da dum"));
    }

    @Test
    public void drumsSaleHasMarkup() {
        assertEquals(1500.0, drums.calculateMarkup(1500.0), 0.0);
    }

}
