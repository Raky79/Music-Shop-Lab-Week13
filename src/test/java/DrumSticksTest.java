import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Vater", 2.0, 9.0, "Drum Sticks");
    }

    @Test
    public void drumSticksHaveAName() {
        assertEquals("Vater", drumSticks.getName());
    }

    @Test
    public void drumSticksSaleHaveMarkup() {
        assertEquals(7.0, drumSticks.calculateMarkup(7.0), 0.0);
    }

    @Test
    public void drumSticksHaveADescription() {
        assertEquals("Drum Sticks", drumSticks.getDescription());
    }

}
