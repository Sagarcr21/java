class WashingMachine extends Machine {

 
    public void operate() {
        System.out.println("the washing machine washes clothes");
    }
    public void sound() {
        System.out.println("the washing machine makes a spinning sound");
    }

    public static void main(String[] args) {
        Machine m = new Machine();
        m.start();
        m.stop();
        m.operate();
        m.sound();

        System.out.println("---------------------------");

        WashingMachine w = new WashingMachine();
        w.operate();
        w.sound();

        System.out.println("---------------------------");

        Machine obj = new WashingMachine();
        obj.operate();
        obj.sound();
    }
}
