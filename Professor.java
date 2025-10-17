class Professor extends University {

   
    public void manage() {
        System.out.println("the professor manages their department personally");
    }
    public void sound() {
        System.out.println("the professor communicates with students");
    }

    public static void main(String[] args) {
        University u = new University();
        u.teach();
        u.research();
        u.manage();
        u.sound();

        System.out.println("---------------------------");

        Professor p = new Professor();
        p.manage();
        p.sound();

        System.out.println("---------------------------");

        University obj = new Professor();
        obj.manage();
        obj.sound();
    }
}