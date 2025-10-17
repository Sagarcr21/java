class Engineer extends Builder {

    
    public void build() {
        System.out.println("the engineer personally oversees building with precision");
    }
    public void sound() {
        System.out.println("the engineer communicates technical instructions");
    }

    public static void main(String[] args) {
        Builder b = new Builder();
        b.plan();
        b.supervise();
        b.build();
        b.sound();

        System.out.println("---------------------------");

        Engineer e = new Engineer();
        e.build();
        e.sound();

        System.out.println("---------------------------");

        Builder obj = new Engineer();
        obj.build();
        obj.sound();
    }
}
