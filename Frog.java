class Frog extends Amphibian {
    public static void main(String[] args) {
        Amphibian.habitat();
        Amphibian.reproduce();
        Frog f = new Frog();
        f.jump();
        f.croak();
    }
}