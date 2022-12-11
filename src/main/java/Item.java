public abstract class Item {

    private String name;

    private double priceBought;

    private double priceSold;

    public Item(String name, double priceBought, double priceSold) {
        this.name = name;
        this.priceBought = priceBought;
        this.priceSold = priceSold;
    }

    public String getName() {
        return name;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceSold() {
        return priceSold;
    }
}
