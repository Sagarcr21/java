class Cafe extends Restaurant {
    public void coffeeMenu() {
        System.out.println("Cafe serves espresso and cappuccino");
    }
    public void openHours() {
        System.out.println("Cafe open from 8AM to 8PM");
    }

    public static void main(String[] args) {
        Restaurant r = new Cafe();
        r.serveFood();
        r.openHours();
        if (r instanceof Cafe) {
            Cafe c = (Cafe) r;
            c.coffeeMenu();
            c.openHours();
        }
    }
}
