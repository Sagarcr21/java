class Fan {
    int id;
    int speed;
    String brand;
    boolean isAutomatic;

    Fan() {
        System.out.println("No arguments are === ");
    }

    Fan(boolean isAutomatic) {
        System.out.println("---------\n");
        System.out.println("One argument === ");
        System.out.println("Automatic control: " + isAutomatic);
    }

    Fan(int speed, String brand) {
        System.out.println("---------\n");
        System.out.println("Two arguments === ");
        System.out.println("Fan speed: " + speed);
        System.out.println("Fan brand: " + brand);
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.id = 300;
        f1.speed = 5;
        f1.brand = "Usha";
        f1.isAutomatic = true;

        System.out.println("Fan ID: " + f1.id);
        System.out.println("Fan Speed: " + f1.speed);
        System.out.println("Fan Brand: " + f1.brand);
        System.out.println("Fan Automatic: " + f1.isAutomatic);

        Fan f2 = new Fan(true);
        Fan f3 = new Fan(4, "Havells");
    }
}
