class Doctor extends Hospital {

  
    public void treat() {
        System.out.println("the doctor treats patients personally");
    }
    public void sound() {
        System.out.println("the doctor uses stethoscope sounds");
    }

    public static void main(String[] args) {
        Hospital h = new Hospital();
        h.open();
        h.close();
        h.treat();
        h.sound();

        System.out.println("---------------------------");

        Doctor d = new Doctor();
        d.treat();
        d.sound();

        System.out.println("---------------------------");

        Hospital obj = new Doctor();
        obj.treat();
        obj.sound();
    }
}