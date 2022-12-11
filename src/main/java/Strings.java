public class Strings extends Item{

    private String description;

    public Strings(String name, double priceBought, double priceSold, String description) {
        super(name, priceBought, priceSold);

        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
