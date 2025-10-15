class WashingMachine extends Machine {
    public static void main(String[] args) {
        Machine.details();
        Machine.operate();
        WashingMachine w = new WashingMachine();
        w.start();
        w.stop();
    }
}
