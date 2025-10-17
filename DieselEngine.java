class DieselEngine extends Engine {


    public void operate() {
        System.out.println("the diesel engine operates with fuel injection");
    }
    public void sound() {
        System.out.println("the diesel engine makes loud rumbling sound");
    }

    public static void main(String[] args) {
        Engine e = new Engine();
        e.start();
        e.stop();
        e.operate();
        e.sound();

        System.out.println("---------------------------");

        DieselEngine de = new DieselEngine();
        de.operate();
        de.sound();

        System.out.println("---------------------------");

        Engine obj = new DieselEngine();
        obj.operate();
        obj.sound();
    }
}