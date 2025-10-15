class Honda {
    char series;
    int price;
    boolean isAvailable;
    String name;

    Honda() {
        this("Brezza");
        System.out.println("No-argument constructor");
    }

    Honda(String name) {
        this("Brezza", 'A');
		this.name=name;
        System.out.println("One-argument constructor ");
		
    }

    Honda(String name, char series) {
        this("Brezza", 'A', true);
		this.name=name;
		this.series=series;
        System.out.println("Two-argument constructor ");
		
    }

    Honda(String name, char series, boolean isAvailable) {
        this("Brezza", 'A', true, 23455);
		this.name = name;
        this.series = series;
        this.isAvailable = isAvailable;
        System.out.println("Three-argument constructor ");
		

    }

    Honda(String name, char series, boolean isAvailable, int price) {
        this.name = name;
        this.series = series;
        this.isAvailable = isAvailable;
        this.price = price;
        System.out.println("Four-argument constructor ");


    }
	
		}