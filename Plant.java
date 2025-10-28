class Plant {
    Plant() {
        this(1);
        System.out.println("plant created...");
    }
    Plant(int age) {
        this(age, "Green Plant");
        System.out.println("plant age is " + age + " year");
    }
    Plant(int age, String type) {
        System.out.println("plant type is " + type);
    }
}

