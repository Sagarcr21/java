class Product{
	public static void main(String[] args){
		int price=45;
		price=56;
		
  		int i=9;
		
		switch(price){
			case 4:
			System.out.println("the lower price :"+price);
			break;
			case 6:
			System.out.println("the moderate price :"+price);
		    break;
			case 33:
			System.out.println("the mid price :"+price);
			break;
			case 56:
			System.out.println("the acquised price :"+price);
			break;
			case 78:
			System.out.println("the premium price :"+price);
			break;
			default:
			System.out.println("the unknown price :"+price);
}

		while(i<100){
			System.out.println("the number is "+price);
			
			if(i==1){
				
				System.out.println("the number is 1");
			}
				else{
					System.out.println("the number is not 1 ");
				}break;
			
		}
	}
}