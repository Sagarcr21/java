class GoldFish extends Fish {
    public void swim() {
        System.out.println("the goldfish swims beautifully");
    }
    public void sound() {
        System.out.println("the goldfish makes small bubble sounds");
    }

    public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();
        f.sleep();
        f.swim();
        f.sound();

        System.out.println("---------------------------");

        GoldFish g = new GoldFish();
        g.swim();
        g.sound();

        System.out.println("---------------------------");

        Fish obj = new GoldFish();
        obj.swim();
        obj.sound();
    }
}
