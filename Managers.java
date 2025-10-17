class Manager extends Hotel {


    public void operate() {
        System.out.println("the manager supervises hotel operations personally");
    }
    public void sound() {
        System.out.println("the manager announces information to staff");
    }

    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.open();
        h.close();
        h.operate();
        h.sound();

        System.out.println("---------------------------");

        Manager m = new Manager();
        m.operate();
        m.sound();

        System.out.println("---------------------------");

        Hotel obj = new Manager();
        obj.operate();
        obj.sound();
    }
}