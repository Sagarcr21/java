class React{
public static void main(String [] args){
		Television obj=new Television(10000,"sony");
		System.out.println("the price of the television is :"+obj.price);
		System.out.println("the name of the television is :"+obj.name);
	
		Television obj1=new Television(20000,"lg");
		System.out.println("the price of the television is :"+obj1.price);
		System.out.println("the name of the television is :"+obj1.name);
	
		Television obj2=new Television(25000,"samsung");
	    System.out.println("the price of the television is :"+obj2.price);
	    System.out.println("the name of the television is :"+obj2.name);
	
	    System.out.println("-------------------------");
	
	    Refrigerator obj3 = new Refrigerator(25000, "LG");
        System.out.println("The price of the refrigerator is: " + obj3.price);
        System.out.println("The brand of the refrigerator is: " + obj3.brand);

        Refrigerator obj4 = new Refrigerator(35000, "Whirlpool");
        System.out.println("The price of the refrigerator is: " + obj4.price);
        System.out.println("The brand of the refrigerator is: " + obj4.brand);
		
		Refrigerator obj5 = new Refrigerator(30000, "Samsung");
        System.out.println("The price of the refrigerator is: " + obj5.price);
        System.out.println("The brand of the refrigerator is: " + obj5.brand);
		
		System.out.println("-------------------------");
		
		Headphone obj6 = new Headphone(2500, "Boat");
        System.out.println("The price of the headphone is: " + obj6.price);
        System.out.println("The brand of the headphone is: " + obj6.brand);

        Headphone obj7 = new Headphone(5000, "Sony");
        System.out.println("The price of the headphone is: " + obj7.price);
        System.out.println("The brand of the headphone is: " + obj7.brand);
		
		Headphone obj8 = new Headphone(4000, "iphone");
        System.out.println("The price of the headphone is: " + obj8.price);
        System.out.println("The brand of the headphone is: " + obj8.brand);
		
		System.out.println("-------------------------");
		
		Printer ref = new Printer(12000, "HP");
        System.out.println("The price of the printer is: " + ref.price);
        System.out.println("The brand of the printer is: " + ref.brand);

        Printer ref1 = new Printer(18000, "Canon");
        System.out.println("The price of the printer is: " + ref1.price);
        System.out.println("The brand of the printer is: " + ref1.brand);
		
		Printer ref2 = new Printer(15000, "dell");
        System.out.println("The price of the printer is: " + ref2.price);
        System.out.println("The brand of the printer is: " + ref2.brand);
}
}