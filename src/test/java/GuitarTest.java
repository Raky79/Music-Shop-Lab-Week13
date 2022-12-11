import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    InstrumentType instrumentType;

    @Before
    public void before() {
        guitar = new Guitar("Mustang", 200.0, 300.0,instrumentType.STRINGS, "Mahogany Wood","Fender");
    }

    @Test
    public void guitarHasName() {
        assertEquals("Mustang", guitar.getName());
    }

    @Test
    public void guitarHasABuyingPrice() {
        assertEquals(200.0, guitar.getPriceBought(), 0.0);
    }

    @Test
    public void guitarHasASoldPrice() {
        assertEquals(300.0, guitar.getPriceSold(), 0.0);
    }

    @Test
    public void guitarHasAnInstrumentType() {
        assertEquals(instrumentType.STRINGS, guitar.getInstrumentType());
    }

    @Test
    public void guitarHasMaterial() {
        assertEquals("Mahogany Wood", guitar.getMaterial());
    }

    @Test
    public void guitarHasManufacturer() {
        assertEquals("Fender", guitar.getManufacturer());
    }

    @Test
    public void guitarIsBeingPlayed() {
        assertEquals("And the guitar goes: a-woogah woogah", guitar.playInstrument("a-woogah woogah"));
    }

    @Test
    public void guitarSaleHasMarkup() {
        assertEquals(100.0, guitar.calculateMarkup(100.0), 0.0);
    }




}
