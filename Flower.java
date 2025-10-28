class Flower extends Plant {
    Flower(String color) {
        super(2);
        System.out.println("flower color is " + color);
    }
    public static void main(String[] args) {
        Flower f = new Flower("Red");
    }
}