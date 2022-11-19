public class Electronic extends Mahssol{
    private int mizanBargh;
    private String garanti;

    public Electronic(int price, String description, int tedadMojoodi, int mizanBargh, String garanti) {
        super(price, description, tedadMojoodi);
        this.mizanBargh = mizanBargh;
        this.garanti = garanti;
    }

    @Override
    public void buy(int amount) {

        System.out.println("خرید محصول الکترونیکی سه روز بعد");
}
}
