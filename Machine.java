class Machine {
    public static void details() {
        System.out.println("static method");
        System.out.println("------------");
        System.out.println("machines help to ease human work");
    }
    public static void operate() {
        System.out.println("machines are operated by humans or automatically");
    }
    public void start() {
        System.out.println("non static method");
        System.out.println("------------");
        System.out.println("machine has started");
    }
    public void stop() {
        System.out.println("machine has stopped");
    }
}

