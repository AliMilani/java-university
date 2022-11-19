public class Ghazai extends Mahssol{
    private int tarikhTolid;
    private int tarikhEngheza;
    private int vazn;

    public Ghazai(int price, String description, int tedadMojoodi, int tarikhTolid, int tarikhEngheza, int vazn) {
        super(price, description, tedadMojoodi);
        this.tarikhTolid = tarikhTolid;
        this.tarikhEngheza = tarikhEngheza;
        this.vazn = vazn;
    }

    @Override
    public void buy(int amount) {
        System.out.println("خرید غذا آنی");
    }
}
