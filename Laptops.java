class Laptops extends Device {

   
    public void operate() {
        System.out.println("the laptop operates with keyboard and touchpad");
    }
    public void sound() {
        System.out.println("the laptop makes system sounds");
    }

    public static void main(String[] args) {
        Device d = new Device();
        d.turnOn();
        d.turnOff();
        d.operate();
        d.sound();

        System.out.println("---------------------------");

        Laptop l = new Laptop();
        l.operate();
        l.sound();

        System.out.println("---------------------------");

        Device obj = new Laptop();
        obj.operate();
        obj.sound();
    }
}