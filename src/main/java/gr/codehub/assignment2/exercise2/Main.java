package gr.codehub.assignment2.exercise2;

import gr.codehub.assignment2.exercise2.interfaces.IStore;
import gr.codehub.assignment2.exercise2.model.InventoryRetailStore;
import gr.codehub.assignment2.exercise2.model.Product;
import gr.codehub.assignment2.exercise2.model.SimpleRetailStore;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);

        IStore simple= new SimpleRetailStore();
        simple.buy(x1);
        simple.buy(x4);
        simple.sell(x1);
        System.out.println(simple.getRevenue());

        IStore invStore = new InventoryRetailStore();
        invStore.buy(x1);
        invStore.buy(x4);
        invStore.sell(x1);
        System.out.println(invStore.getRevenue());
        invStore.buy(x2);
        List<Product> inventory = invStore.getInventory();
        inventory.forEach(System.out::println);
        invStore.reset();
        System.out.println("Printing after reset");
        inventory.forEach(System.out::println);
    }
}
