class Chef extends Restaurant {

    public void serve() {
        System.out.println("the chef personally serves special dishes");
    }
    public void sound() {
        System.out.println("the chef gives cooking instructions loudly");
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.open();
        r.close();
        r.serve();
        r.sound();

        System.out.println("---------------------------");

        Chef c = new Chef();
        c.serve();
        c.sound();

        System.out.println("---------------------------");

        Restaurant obj = new Chef();
        obj.serve();
        obj.sound();
    }
}