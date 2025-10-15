class BankAccount {
    String holderName;
    String accountType;
    long accountNumber;
    double balance;

    
    BankAccount() {
        this("Sagar"); 
        System.out.println("No-args constructor called");
    }

  
    BankAccount(String holderName) {
        this(holderName, "Savings"); 
		this.holderName = holderName;
        System.out.println("One-argument constructor called");
    }

    
    BankAccount(String holderName, String accountType) {
        this(holderName, accountType, 1234567890L);
        this.holderName = holderName;
        this.accountType = accountType;		
        System.out.println("Two-argument constructor called");
    }

    
    BankAccount(String holderName, String accountType, long accountNumber) {
        this(holderName, accountType, accountNumber, 50000.0); 
		this.holderName = holderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        System.out.println("Three-argument constructor called");
    }

   
    BankAccount(String holderName, String accountType, long accountNumber, double balance) {
        this.holderName = holderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Four-argument constructor called");
    }

    
   
        

    	
	
	
	
    }

