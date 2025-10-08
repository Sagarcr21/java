

class Shoes {
    int size;
    int price;
    String brand;
    boolean isLeather;

    Shoes() {
        System.out.println("No arguments are === ");
    }

    Shoes(boolean isLeather) {
        System.out.println("---------\n");
        System.out.println("One argument === ");
        System.out.println("Shoes are leather: " + isLeather);
    }

    Shoes(int price, String brand) {
        System.out.println("---------\n");
        System.out.println("Two arguments === ");
        System.out.println("Shoes price: " + price);
        System.out.println("Shoes brand: " + brand);
    }

    public static void main(String[] args) {
        Shoes s1 = new Shoes();
        s1.size = 9;
        s1.price = 3000;
        s1.brand = "Nike";
        s1.isLeather = false;

        System.out.println("Shoe Size: " + s1.size);
        System.out.println("Shoe Price: " + s1.price);
        System.out.println("Shoe Brand: " + s1.brand);
        System.out.println("Leather Shoes: " + s1.isLeather);

        Shoes s2 = new Shoes(true);
        Shoes s3 = new Shoes(4500, "Puma");
    }
}
