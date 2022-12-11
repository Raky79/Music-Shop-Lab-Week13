import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private String manufacturer;


    public Piano(String name, double priceBought, double priceSold, InstrumentType instrumentType, String material, String manufacturer) {
        super(name, priceBought, priceSold, instrumentType, material);

        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    private String play(String data) {
        return "And the piano goes: " + data;
    }

    public String playInstrument(String data) {
        return this.play(data);
    }
}
