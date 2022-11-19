public class Main {
    public static void main(String[] args) {
        Electronic electronic = new Electronic(100, "لپ تاپ", 10, 100, "2 سال");
        Ghazai ghazai = new Ghazai(100, "ماهی", 10, 100, 200, 2);
        Pooshak pooshak = new Pooshak(100, "شلوار", 10, 100, "پارچه");

        // خرید
        electronic.buy(1);
        pooshak.buy(1);
        ghazai.buy(1);
    }
}