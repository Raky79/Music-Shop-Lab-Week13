import behaviours.ISell;

public abstract class Instrument extends Item {

    private InstrumentType instrumentType;

    private String material;

    public Instrument(String name, double priceBought, double priceSold, InstrumentType instrumentType, String material) {
        super(name, priceBought, priceSold);
        this.instrumentType = instrumentType;
        this.material = material;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getMaterial() {
        return material;
    }


}
