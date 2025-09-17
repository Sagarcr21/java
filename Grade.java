class Grade{
public static void main(String[] args){
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
  }
  