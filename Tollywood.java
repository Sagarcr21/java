class Tollywood{ 

	public static void For(){
  int i;
  String tollywoodMovies[]={"bahubali","peddi","rrr","sita ramam","puspa"};
    for(i=0;i<tollywoodMovies.length;i++){
	System.out.println( "the tollywood movies is :"+tollywoodMovies[i]);
	}
	
//	for loop reverse
    for(i=tollywoodMovies.length-1;i>=0;i--){
	System.out.println(" the tollywoodMoviesis :"+tollywoodMovies[i]);
	}
	
	
//for each statement
  for(String movie: tollywoodMovies){
  System.out.println("tollywoodMoviesis:"+movie);
} 
	}

public static void While(){
  int numbers[] = {10, 20, 30, 40, 50};

        int i = 0;

      
        do {
            System.out.println("the numbers are :"+numbers[i]);
           i=i+1;
        } while (i < numbers.length);
}
		
public static void Ifelse(){
boolean isAvailable[]={true,false,true,false};

   isAvailable[3]=true;
   for( int i=0;i<isAvailable.length;i++){
	   if(i==2){
		  System.out.println("the an:"+isAvailable[i]);
	   }else{
		     System.out.println("the");
	   }
	   
   }
  
		
}
public static void Switch(){
  char grade='B';
  grade='C';
 switch(grade){
 
  
  case 'A':
                System.out.println("the grade is A");
			     break;
  case 'B':
                System.out.println("the grade is B");
                break;
  case 'C':
                System.out.println("the grade is C");
				if(!(grade>'A' || grade=='C')&&grade<'B'){
                       System.out.println("true");
                 }else{
                       System.out.println("false");
               }
			     break;
				 
				 
  case 'D':
                System.out.println("the grade is D");
				break;
				 
  case  'E':
                System.out.println("the grade is E");
				
                break;
  default:
                System.out.println("the grade is unknown");
  }
	

}
public static void enterMetrostation(){
System.out.println("entering the metro station ");
}
public static void ticketBooking(){
System.out.println("first tickry booking");
}
public static void enterMetro(){
System.out.println("enter the metro");
}
public static void reachDestination(){
System.out.println("leave the metro");
}
public static void returnHome(){
System.out.println("return home");
}
	
	 }