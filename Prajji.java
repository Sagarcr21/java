class Prajji{

public static void main(String[] agrs){
String car[]={"bmw","audi","kia","mat"};
System.out.println(" the car is :");
for(int i=0;i<car.length;){
if((!(i==1||i<2))&& i>1){
		continue;
	}
	else{
		
		System.out.println(car[i]+"\t");
}

}
}
}