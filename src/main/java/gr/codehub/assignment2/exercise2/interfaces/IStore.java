package gr.codehub.assignment2.exercise2.interfaces;

import gr.codehub.assignment2.exercise2.model.Product;

import java.math.BigDecimal;
import java.util.List;

public interface IStore {

    void buy(Product product);

    void sell(Product product);

    BigDecimal getRevenue();

    List<Product> getInventory();

    void reset();
}
