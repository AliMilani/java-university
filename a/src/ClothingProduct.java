public class ClothingProduct extends Product {
    private int size;
    private String fabricMaterial;

    public ClothingProduct(int price, String description, int totoalInStock, int size, String fabricMaterial) {
        super(price, description, totoalInStock);
        this.size = size;
        this.fabricMaterial = fabricMaterial;
    }

    @Override
    public void buy(int amount) {
        System.out.println("Buying clothing product (tahvil ye hafte bad)" + "amount: " + amount + ", price: " + getPrice() + ", description: " + getDescription() + ", total in stock: " + getTotoalInStock() + ", size: " + size + ", fabric material: " + fabricMaterial);
    }
}


