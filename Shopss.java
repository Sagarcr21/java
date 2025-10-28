class Shop {
    Shop() {
        this("Local");
        System.out.println("shop opened...");
    }
    Shop(String type) {
        this(type, 10);
        System.out.println("shop type: " + type);
    }
    Shop(String type, int workers) {
        System.out.println("workers in shop: " + workers);
    }
}

