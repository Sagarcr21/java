class Sparrow extends Bird {
    public static void main(String[] args) {
        Bird.wings();
        Bird.rest();
        Sparrow s = new Sparrow();
        s.fly();
        s.sing();
    }
}
