class Surgeon extends Doctor {
    public void operation() {
        System.out.println("Surgeon performs operations");
    }
    public void fees() {
        System.out.println("Surgeon charges 2000 per operation");
    }

    public static void main(String[] args) {
        Doctor d = new Surgeon();
        d.treat();
        d.fees();
        if (d instanceof Surgeon) {
            Surgeon s = (Surgeon) d;
            s.operation();
            s.fees();
        }
    }
}