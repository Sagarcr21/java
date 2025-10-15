class Doctor extends Hospitals {
    public static void main(String[] args) {
        Hospitals.about();
        Hospitals.timings();
        Doctor d = new Doctor();
        d.admitPatient();
        d.dischargePatient();
    }
}
