public class FoodProduct extends Product{
    private int expirationDate;
    private int weight;
    private int createDate;

    public FoodProduct(int price, String description, int totoalInStock, int createDate ,int expirationDate, int weight) {
        super(price, description, totoalInStock);
        this.expirationDate = expirationDate;
        this.createDate = createDate;
        this.weight = weight;
    }

    @Override
    public void buy(int amount) {
        System.out.println("Buying food product (tahvil ani)" + "amount: " + amount + ", price: " + getPrice() + ", description: " + getDescription() + ", total in stock: " + getTotoalInStock() + ", create date: " + createDate + ", expiration date: " + expirationDate + ", weight: " + weight);
    }
}
