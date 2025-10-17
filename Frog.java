class Frog extends Amphibians {

    public void jump() {
        System.out.println("the frog jumps high");
    }
    public void sound() {
        System.out.println("the frog croaks");
    }

    public static void main(String[] args) {
        Amphibians a = new Amphibians();
        a.eat();
        a.sleep();
        a.jump();
        a.sound();

        System.out.println("---------------------------");

        Frog f = new Frog();
        f.jump();
        f.sound();

        System.out.println("---------------------------");

        Amphibians obj = new Frog();
        obj.jump();
        obj.sound();
    }
}