import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    public ArrayList<ISell> stock;

    private String name;

    public Shop(String name) {

        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int stockCount() {
        return stock.size();
    }

    public void addItemToStock(ISell item) {
        stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        stock.remove(item);
    }

}
