class Transport extends Train {


    public void operate() {
        System.out.println("the transport service manages train operations personally");
    }
    public void sound() {
        System.out.println("the transport service communicates alerts");
    }

    public static void main(String[] args) {
        Train t = new Train();
        t.start();
        t.stop();
        t.operate();
        t.sound();

        System.out.println("---------------------------");

        Transport tr = new Transport();
        tr.operate();
        tr.sound();

        System.out.println("---------------------------");

        Train obj = new Transport();
        obj.operate();
        obj.sound();
    }
}