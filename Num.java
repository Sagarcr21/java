class Num{
public static void main(String[] args){
  int number=4;
  number=5;
  switch(number){
  
  
  case 1:
                System.out.println("the number is 1");
				
                break;
  case 2:
                System.out.println("the number is 2");
                break;
  case 3:
                System.out.println("the number is 3");
                break;
  case  4:
                System.out.println("the number is 4");
                break;
  case  5:
                System.out.println("the number is 5");
				if(!(number>4 && number==5)||number<3){
					System.out.println("true");
				}else{
					System.out.println("false");
				}
                break;
  default:
                System.out.println("the number is unknown");
  }
  }
  }
  