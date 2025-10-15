class Camera {
    String brand;
    String type;
    int megapixels;
    double price;

    Camera() {
        this("Canon");
        System.out.println("No-args constructor");
    }

    Camera(String brand) {
        this(brand, "DSLR");
		this.brand = brand;
        System.out.println("One-argument constructor");
    }

    Camera(String brand, String type) {
        this(brand, type, 24);
		this.brand = brand;
        this.type = type;
        System.out.println("Two-argument constructor");
    }

    Camera(String brand, String type, int megapixels) {
        this(brand, type, megapixels, 55000);
		this.brand = brand;
        this.type = type;
        this.megapixels = megapixels;
        System.out.println("Three-argument constructor");
    }

    Camera(String brand, String type, int megapixels, double price) {
        this.brand = brand;
        this.type = type;
        this.megapixels = megapixels;
        this.price = price;
        System.out.println("Four-argument constructor");

	}
	}
