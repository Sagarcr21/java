class Building {
    Building() {
        this(2);
        System.out.println("building constructed...");
    }
    Building(int floors) {
        this(floors, "Residential");
        System.out.println("building has " + floors + " floors");
    }
    Building(int floors, String type) {
        System.out.println("building type is " + type);
    }
}

