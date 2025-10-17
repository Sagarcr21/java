class Cat extends Mammal {

    
    public void walk() {
        System.out.println("the cat walks silently");
    }
    public void sound() {
        System.out.println("the cat meows");
    }

    public static void main(String[] args) {
        Mammal m = new Mammal();
        m.eat();
        m.sleep();
        m.walk();
        m.sound();

        System.out.println("---------------------------");

        Cat c = new Cat();
        c.walk();
        c.sound();

        System.out.println("---------------------------");

        Mammal obj = new Cat();
        obj.walk();
        obj.sound();
    }
}
