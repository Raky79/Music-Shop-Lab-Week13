public class DrumSticks extends Item{

    private String description;

    public DrumSticks(String name, double priceBought, double priceSold, String description) {
        super(name, priceBought, priceSold);

        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
