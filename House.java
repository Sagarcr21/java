class House {
    int houseNo;
    String ownerName;
    String location;
    double price;

    House() {
        this(101);
        System.out.println("No-args constructor");
    }

    House(int houseNo) {
        this(101, "Sagar");
		this.houseNo = houseNo;
        System.out.println("One-argument constructor");
    }

    House(int houseNo, String ownerName) {
		this(101, "Sagar", "Bangalore");
		this.houseNo = houseNo;
        this.ownerName = ownerName;
        
        System.out.println("Two-argument constructor");
    }

    House(int houseNo, String ownerName, String location) {
        this(101, "Sagar", "Bangalore", 5000000);
		this.houseNo = houseNo;
        this.ownerName = ownerName;
        this.location = location;
        System.out.println("Three-argument constructor");
    }

    House(int houseNo, String ownerName, String location, double price) {
        this.houseNo = houseNo;
        this.ownerName = ownerName;
        this.location = location;
        this.price = price;
        System.out.println("Four-argument constructor");
    }

	
	
        
    
}
