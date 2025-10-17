class Snake extends Reptile {

    
    public void crawl() {
        System.out.println("the snake crawls silently");
    }
    public void sound() {
        System.out.println("the snake hisses");
    }

    public static void main(String[] args) {
        Reptile r = new Reptile();
        r.eat();
        r.sleep();
        r.crawl();
        r.sound();

        System.out.println("---------------------------");

        Snake s = new Snake();
        s.crawl();
        s.sound();

        System.out.println("---------------------------");

        Reptile obj = new Snake();
        obj.crawl();
        obj.sound();
    }
}