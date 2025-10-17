class Nurse extends Clinic {

  
    public void treat() {
        System.out.println("the nurse treats patients personally");
    }
    public void sound() {
        System.out.println("the nurse communicates with patients and staff");
    }

    public static void main(String[] args) {
        Clinic c = new Clinic();
        c.open();
        c.close();
        c.treat();
        c.sound();

        System.out.println("---------------------------");

        Nurse n = new Nurse();
        n.treat();
        n.sound();

        System.out.println("---------------------------");

        Clinic obj = new Nurse();
        obj.treat();
        obj.sound();
    }
}