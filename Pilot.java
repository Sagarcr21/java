class Pilot extends Airline {

    
    public void manageCrew() {
        System.out.println("the pilot manages the crew personally during flight");
    }
    public void sound() {
        System.out.println("the pilot communicates with ATC and passengers");
    }

    public static void main(String[] args) {
        Airline a = new Airline();
        a.operateFlight();
        a.maintain();
        a.manageCrew();
        a.sound();

        System.out.println("---------------------------");

        Pilot p = new Pilot();
        p.manageCrew();
        p.sound();

        System.out.println("---------------------------");

        Airline obj = new Pilot();
        obj.manageCrew();
        obj.sound();
    }
}