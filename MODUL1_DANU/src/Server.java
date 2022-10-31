import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception {
        Database db = new database();
        Menu menu1 = new Menu();
        menu1.setName("Bakso");
        menu1.setPrice(10000);
        menu1.setCategory("Makanan");

        Menu menu2 = new Menu();
        menu2.setName("Es teh");
        menu2.setPrice(5000);
        menu2.setCategory("Minuman");

        Menu menu3 = new Menu();
        menu3.setName("Brownies");
        menu3.setPrice(2500);
        menu3.setCategory("Dessert");

        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("==================================");

    }
}
