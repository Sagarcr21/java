class Pizza extends Food {
    public void size() {
        System.out.println("Pizza comes in large size");
    }
    public void price() {
        System.out.println("Pizza is expensive");
    }

    public static void main(String[] args) {
        Food f = new Pizza();
        f.taste();
        f.price();
        if (f instanceof Pizza) {
            Pizza p = (Pizza) f;
            p.size();
            p.price();
        }
    }
}