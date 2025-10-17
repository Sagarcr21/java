class Astronaut extends SpaceAgency {

   
    public void operate() {
        System.out.println("the astronaut operates the spacecraft personally");
    }
    public void sound() {
        System.out.println("the astronaut communicates via radio");
    }

    public static void main(String[] args) {
        SpaceAgency sa = new SpaceAgency();
        sa.launch();
        sa.train();
        sa.operate();
        sa.sound();

        System.out.println("---------------------------");

        Astronaut a = new Astronaut();
        a.operate();
        a.sound();

        System.out.println("---------------------------");

        SpaceAgency obj = new Astronaut();
        obj.operate();
        obj.sound();
    }
}