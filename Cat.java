class Cat extends Mammal {
    public static void main(String[] args) {
        Mammal.warmBlooded();
        Mammal.feed();
        Cat c = new Cat();
        c.walk();
        c.sound();
    }
}
