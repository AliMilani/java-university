public class Pooshak  extends Mahssol{
    private int size;
    private String jensParche;

    public Pooshak(int price, String description, int tedadMojoodi, int size, String jensParche) {
        super(price, description, tedadMojoodi);
        this.size = size;
        this.jensParche = jensParche;
    }

    @Override
    public void buy(int amount) {
        System.out.println("خرید لباس یک هفته");
    }

}
