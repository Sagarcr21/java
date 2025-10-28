class GroceryShop extends Shop {
    GroceryShop(String name) {
        super("Retail");
        System.out.println("shop name is " + name);
    }
    public static void main(String[] args) {
        GroceryShop s = new GroceryShop("Fresh Mart");
    }
}