package gr.codehub.assignment2.exercise1.model;

public class StoreAccount extends Account {

    private String storeName;
    private Category accountCategory;

    public StoreAccount(String owner, String storeName, Category accountCategory) {
        super(owner);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public StoreAccount(String owner, double balance,String storeName, Category accountCategory) {
        super(owner, balance);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public String getStoreName(){
        return this.storeName;
    }

    public void changeStoreName(String newName){
        this.storeName = newName;
    }

    public Category getAccountCategory(){
        return this.accountCategory;
    }

    public void changeCategory(Category category){
        this.accountCategory = category;
    }

}
