class Device {
    public static void info() {
        System.out.println("static method");
        System.out.println("------------");
        System.out.println("Devices are used for communication and processing");
    }
    public static void charge() {
        System.out.println("Devices need charging");
    }
    public void powerOn() {
        System.out.println("non static method");
        System.out.println("------------");
        System.out.println("Device is powered on");
    }
    public void powerOff() {
        System.out.println("Device is powered off");
    }
}


