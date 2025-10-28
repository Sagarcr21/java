class Transport {
    Transport() {
        this("Public");
        System.out.println("transport created...");
    }
    Transport(String type) {
        this(type, "Railway");
        System.out.println("transport type: " + type);
    }
    Transport(String type, String mode) {
        System.out.println("mode of transport: " + mode);
    }
}

