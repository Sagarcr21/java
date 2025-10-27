class SBI extends Banks {
    public void atmServices() {
        System.out.println("SBI provides ATM services");
    }
    public void interestRate() {
        System.out.println("SBI interest rate: 7%");
    }

    public static void main(String[] args) {
        Banks b = new SBI();
        b.interestRate();
        b.branch();
        if (b instanceof SBI) {
            SBI s = (SBI) b;
            s.atmServices();
            s.interestRate();
        }
    }
}