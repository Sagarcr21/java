class Reacts{
	public static void main(String[] args){
Honda v = new Honda();
	    System.out.println("\nHonda Details:");
		System.out.println("the car name " + v.name);
        System.out.println("the hundai series" + v.series);
        System.out.println("Price: " + v.price);
        System.out.println("the car is Available: " + v.isAvailable);
House h = new House(102,"praju");
        System.out.println("\nHouse Details:");
        System.out.println("House No: " + h.houseNo);
        System.out.println("Owner: " + h.ownerName);
        System.out.println("Location: " + h.location);
        System.out.println("Price: " + h.price);
BankAccount account = new BankAccount("chiru","current",65341351l); 
        System.out.println("\nBank Account Details:");
        System.out.println("Holder Name: " + account.holderName);
        System.out.println("Account Type: " + account.accountType);
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Balance: " + account.balance);	
Company c = new Company("TechZone","BTM Layout");
        System.out.println("\nCompany Details:");
        System.out.println("Name: " + c.name);
        System.out.println("Location: " + c.location);
        System.out.println("Employees: " + c.employees);
        System.out.println("Revenue: " + c.revenue + " crore");
Camera c1 = new Camera();
        System.out.println("\nCamera Details:");
        System.out.println("Brand: " + c1.brand);
        System.out.println("Type: " + c1.type);
        System.out.println("Megapixels: " + c1.megapixels);
        System.out.println("Price: " + c1.price);
    
    }
	}