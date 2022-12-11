import behaviours.IPlay;

public class Drums extends Instrument implements IPlay {

    private String manufacturer;

    public Drums(String name, double priceBought, double priceSold, InstrumentType instrumentType, String material, String manufacturer) {
        super(name, priceBought, priceSold, instrumentType, material);

        this.manufacturer = manufacturer;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    private String play(String data) {
        return "And the drum goes: " + data;
    }

    public String playInstrument(String data) {
        return this.play(data);
    }
}
