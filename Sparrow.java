class Sparrow extends Bird {
    public void fly() {
        System.out.println("the sparrow flies");
    }
    public void sound() {
        System.out.println("the sparrow sounds");
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
        b.sound();

        System.out.println("---------------------------");

        Sparrow s = new Sparrow();
        s.fly();
        s.sound();

        System.out.println("---------------------------");

        Bird obj = new Sparrow();
        obj.fly();
        obj.sound();
    }
}