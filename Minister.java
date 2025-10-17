class Minister extends Government {

   
    public void work() {
        System.out.println("the minister executes government work personally");
    }
    public void sound() {
        System.out.println("the minister addresses the public");
    }

    public static void main(String[] args) {
        Government g = new Government();
        g.createPolicy();
        g.implementLaw();
        g.work();
        g.sound();

        System.out.println("---------------------------");

        Minister m = new Minister();
        m.work();
        m.sound();

        System.out.println("---------------------------");

        Government obj = new Minister();
        obj.work();
        obj.sound();
    }
}