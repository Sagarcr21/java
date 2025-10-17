class Loan extends Bank {

    public void operate() {
        System.out.println("the loan department processes loans personally");
    }
    public void sound() {
        System.out.println("the loan department communicates with clients");
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.openAccount();
        b.closeAccount();
        b.operate();
        b.sound();

        System.out.println("---------------------------");

        Loan l = new Loan();
        l.operate();
        l.sound();

        System.out.println("---------------------------");

        Bank obj = new Loan();
        obj.operate();
        obj.sound();
    }
}