public class ElectronicProduct extends Product{
    private int powerAmount;
    private int warranty;

    public ElectronicProduct(int price, String description, int totoalInStock, int powerAmount, int warranty) {
        super(price, description, totoalInStock);
        this.powerAmount = powerAmount;
        this.warranty = warranty;
    }

    @Override
    public void buy(int amount) {
        System.out.println("Buying electronic product (tahvil 3 rooz bad)" + "amount: " + amount + ", price: " + getPrice() + ", description: " + getDescription() + ", total in stock: " + getTotoalInStock() + ", power amount: " + powerAmount + ", warranty: " + warranty);
    }
}
