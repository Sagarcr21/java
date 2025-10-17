class Programmer extends Computer {

   
    public void operate() {
        System.out.println("the programmer operates the computer using code");
    }
    public void sound() {
        System.out.println("the programmer hears keyboard clicks");
    }

    public static void main(String[] args) {
        Computer c = new Computer();
        c.start();
        c.shutDown();
        c.operate();
        c.sound();

        System.out.println("---------------------------");

        Programmer p = new Programmer();
        p.operate();
        p.sound();

        System.out.println("---------------------------");

        Computer obj = new Programmer();
        obj.operate();
        obj.sound();
    }
}