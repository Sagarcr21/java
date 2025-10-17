

class Manager extends Hotel {
    public static void main(String[] args) {
        Hotel.info();
        Hotel.checkInTime();
        Manager m = new Manager();
        m.manageStaff();
        m.attendGuest();
    }
}
