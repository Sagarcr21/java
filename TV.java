class TV {
    int size;
    int price;
    String brand;
    boolean isSmart;

    TV() {
        System.out.println("No arguments are === ");
    }

    TV(boolean isSmart) {
        System.out.println("---------\n");
        System.out.println("One argument === ");
        System.out.println("Smart TV: " + isSmart);
    }

    TV(int price, String brand) {
        System.out.println("---------\n");
        System.out.println("Two arguments === ");
        System.out.println("TV price: " + price);
        System.out.println("TV brand: " + brand);
    }

    public static void main(String[] args) {
        TV t1 = new TV();
        t1.size = 55;
        t1.price = 45000;
        t1.brand = "Samsung";
        t1.isSmart = true;

        System.out.println("TV Size: " + t1.size);
        System.out.println("TV Price: " + t1.price);
        System.out.println("TV Brand: " + t1.brand);
        System.out.println("Smart TV: " + t1.isSmart);

        TV t2 = new TV(true);
        TV t3 = new TV(55000, "LG");
    }
}
