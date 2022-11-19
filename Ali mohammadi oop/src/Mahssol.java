public class Mahssol implements MahsoolInterface{
    private int price;
    private String description;
    private int tedadMojoodi;

    public Mahssol(int price, String description, int tedadMojoodi) {
        this.price = price;
        this.description = description;
        this.tedadMojoodi = tedadMojoodi;
    }

    public void buy(int amount) {

        System.out.printf("خرید محصول");
    }

}