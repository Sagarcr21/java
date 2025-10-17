class Electrician extends PowerPlant {


    public void operate() {
        System.out.println("the electrician personally operates and monitors systems");
    }
    public void sound() {
        System.out.println("the electrician gives alert sounds and instructions");
    }

    public static void main(String[] args) {
        PowerPlant pp = new PowerPlant();
        pp.generatePower();
        pp.maintain();
        pp.operate();
        pp.sound();

        System.out.println("---------------------------");

        Electrician e = new Electrician();
        e.operate();
        e.sound();

        System.out.println("---------------------------");

        PowerPlant obj = new Electrician();
        obj.operate();
        obj.sound();
    }
}