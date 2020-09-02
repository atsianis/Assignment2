package gr.codehub.assignment2.exercise2.model;

import gr.codehub.assignment2.exercise2.interfaces.IStore;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class SimpleRetailStore implements IStore {

    private double totalBuyBalance;
    private double totalSellBalance;

    public SimpleRetailStore() {
        this.totalBuyBalance = 0.0;
        this.totalSellBalance = 0.0;
    }

    @Override
    public void buy(Product product) {
        this.totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        this.totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public BigDecimal getRevenue() {
        return new BigDecimal(this.totalSellBalance - this.totalBuyBalance).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public List<Product> getInventory() {
        return null;
    }

    @Override
    public void reset() {
    }
}
