class Watch {
    int id;
    int price;
    String brand;
    boolean isSmart;

    Watch() {
        System.out.println("No arguments are === ");
    }

    Watch(boolean isSmart) {
        System.out.println("---------\n");
        System.out.println("One argument === ");
        System.out.println("Smartwatch available: " + isSmart);
    }

    Watch(int price, String brand) {
        System.out.println("---------\n");
        System.out.println("Two arguments === ");
        System.out.println("Watch price: " + price);
        System.out.println("Watch brand: " + brand);
    }

    public static void main(String[] args) {
        Watch w1 = new Watch();
        w1.id = 200;
        w1.price = 15000;
        w1.brand = "Noise";
        w1.isSmart;

        System.out.println("Watch ID: " + w1.id);
        System.out.println("Watch Price: " + w1.price);
        System.out.println("Watch Brand: " + w1.brand);
        System.out.println("Smartwatch: " + w1.isSmart);

        Watch w2 = new Watch(true);
        Watch w3 = new Watch(25000, "Apple");
    }
}
