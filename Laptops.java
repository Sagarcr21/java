class Laptops extends Device {
    public static void main(String[] args) {
        Device.info();
        Device.charge();
        Laptops l = new Laptops();
        l.powerOn();
        l.powerOff();
    }
}