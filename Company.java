class Company {
    String name;
    String location;
    int employees;
    double revenue;

    Company() {
        this("TechZone");
        System.out.println("No-args constructor");
    }

    Company(String name) {
        this(name, "Bangalore");
		this.name = name;
        System.out.println("One-argument constructor");
    }

    Company(String name, String location) {
        this(name, location, 120);
		this.name = name;
        this.location = location;
        System.out.println("Two-argument constructor");
    }

    Company(String name, String location, int employees) {
        this(name, location, employees, 2.5);
		this.name = name;
        this.location = location;
        this.employees = employees;
        System.out.println("Three-argument constructor");
    }

    Company(String name, String location, int employees, double revenue) {
        this.name = name;
        this.location = location;
        this.employees = employees;
        this.revenue = revenue;
        System.out.println("Four-argument constructor");
    }
	

	

    
        
    
}
