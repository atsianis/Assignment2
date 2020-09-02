package gr.codehub.assignment2.exercise2.model;

import gr.codehub.assignment2.exercise2.interfaces.IStore;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore extends SimpleRetailStore {

    private List<Product> inventory;

    public InventoryRetailStore() {
        super();
        this.inventory = new ArrayList<>();
    }

    @Override
    public List<Product> getInventory(){
        return this.inventory;
    }

    @Override
    public void reset(){
        this.inventory.clear();
    }

    @Override
    public void buy(Product product) {
        super.buy(product);
        inventory.add(product);
    }

    @Override
    public void sell(Product product) {
        super.sell(product);
        inventory.remove(product);
    }

}
