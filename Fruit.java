class Fruit{
public static void main(String[] args){
  
 String fruit = "Apple";
 fruit = "Orange";
 
        switch (fruit) {
            case "Apple":
                System.out.println("apple fruit");
                break;
            case "Orange":
                System.out.println("orange fruit");
				if(!(fruit=="Orange"&&"Orange"=="Apple")){
					System.out.println("fruit is true");
				}else{
					System.out.println("fruit is false");
				}
                break;
			case "Banana":
                System.out.println("banana fruit");			
            default:
                System.out.println("Unknown fruit");
        }
}
}