abstract public class Product {
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotoalInStock() {
        return totoalInStock;
    }

    public void setTotoalInStock(int totoalInStock) {
        this.totoalInStock = totoalInStock;
    }

    private int price;
    private String description;
    private int totoalInStock;

    public Product(int price, String description, int totoalInStock) {
        this.price = price;
        this.description = description;
        this.totoalInStock = totoalInStock;
    }

    abstract public void buy(int amount);
}
