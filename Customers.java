class Customer extends Shop {


    public void sell() {
        System.out.println("the customer buys products personally");
    }
    public void sound() {
        System.out.println("the customer talks in the shop");
    }

    public static void main(String[] args) {
        Shop s = new Shop();
        s.open();
        s.close();
        s.sell();
        s.sound();

        System.out.println("---------------------------");

        Customer c = new Customer();
        c.sell();
        c.sound();

        System.out.println("---------------------------");

        Shop obj = new Customer();
        obj.sell();
        obj.sound();
    }
}