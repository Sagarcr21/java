class Train extends Transport {
    Train(int speed) {
        super("Government");
        System.out.println("train speed: " + speed + " km/h");
    }
    public static void main(String[] args) {
        Train t = new Train(180);
    }
}