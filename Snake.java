class Snake extends Reptile {
    public static void main(String[] args) {
        Reptile.coldBlooded();
        Reptile.crawl();
        Snake s = new Snake();
        s.shedSkin();
        s.hiss();
    }
}
