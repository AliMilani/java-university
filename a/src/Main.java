public class Main {
    public static void main(String[] args) {
        // implement ElectronicProduct class
        ElectronicProduct product = new ElectronicProduct(100, "Laptop", 10, 100, 2);
        product.buy(5);

        // implement FoodProduct class
        FoodProduct foodProduct = new FoodProduct(100, "Apple", 10, 100, 200, 2);
        foodProduct.buy(6);

        // implement ClothingProduct class
        ClothingProduct clothingProduct = new ClothingProduct(100, "Shirt", 10, 100, "Cotton");
        clothingProduct.buy(7);
    }
}