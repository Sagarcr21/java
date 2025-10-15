class Hospitals {
    public static void about() {
        System.out.println("static method");
        System.out.println("------------");
        System.out.println("Hospitals provide medical care");
    }
    public static void timings() {
        System.out.println("Hospital is open 24 hours");
    }
    public void admitPatient() {
        System.out.println("non static method");
        System.out.println("------------");
        System.out.println("Patient admitted successfully");
    }
    public void dischargePatient() {
        System.out.println("Patient discharged successfully");
    }
}

