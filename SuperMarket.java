class SuperMarket extends Shop {
    public void sections() {
        System.out.println("SuperMarket has grocery, clothes, and electronics sections");
    }
    public void discount() {
        System.out.println("SuperMarket offers 15% discount");
    }

    public static void main(String[] args) {
        Shop s = new SuperMarket();
        s.open();
        s.discount();
        if (s instanceof SuperMarket) {
            SuperMarket m = (SuperMarket) s;
            m.sections();
            m.discount();
        }
    }
}