

class Prime {
    public static void main(String[] args) {
        
			int num =125;
			int count = 0;
			
		int i=1;
    while(i<=num){
		if(num%i==0){
			
	count++;
		}
		i++;
	}
	
        if (count == 2) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }	
		
    }
}

