class Goldfish extends Fish {
    public static void main(String[] args) {
        Fish.swim();
        Fish.breathe();
        Goldfish g = new Goldfish();
        g.move();
        g.eat();
    }
}
