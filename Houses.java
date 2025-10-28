class Houses extends Building {
    Houses(int cost) {
        super(cost);
        System.out.println("house cost is " + cost);
    }
    public static void main(String[] args) {
        Houses h = new Houses(5000000);
    }
}