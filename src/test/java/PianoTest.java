import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    InstrumentType instrumentType;

    @Before
    public void before() {
        piano = new Piano("CFX", 6000.0, 8000.0, instrumentType.STRINGS, "Maple Wood", "YAMAHA");
    }

    @Test
    public void pianoHasAName() {
        assertEquals("CFX", piano.getName());
    }

    @Test
    public void pianoHasABuyingPrice() {
        assertEquals(6000.0, piano.getPriceBought(), 0.0);
    }

    @Test
    public void pianoHasASellingPrice() {
        assertEquals(8000.0, piano.getPriceSold(), 0.0);
    }

    @Test
    public void pianoHasAnInstrumentType() {
        assertEquals(instrumentType.STRINGS, piano.getInstrumentType());
    }

    @Test
    public void pianoHasMaterial() {
        assertEquals("Maple Wood", piano.getMaterial());
    }

    @Test
    public void pianoHasAManufacturer() {
        assertEquals("YAMAHA", piano.getManufacturer());
    }

    @Test
    public void pianoIsBeingPlayed() {
        assertEquals("And the piano goes: ping, ping", piano.playInstrument("ping, ping"));
    }
}
