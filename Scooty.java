class Scooty{
public static void main(String[] args){
int price[]={4461,3253,986,6742,1328};
int i=0;
System.out.println("the forward loop");
for( i=0;i<price.length;i++){
	if(i==2){
		System.out.println("the price of the scooty is 4461");
		break;
	}
		else{
			System.out.println("the price of the scooty is not 4461");
		}

}System.out.println("the reverse loop");
 i=0;
for(i=price.length-1;i>=0;i--){
System.out.println("the price of the scooty is:"+price[i]);
}
System.out.println("for each loop"	);
i=0;
for(int p:price){
	
	System.out.println("the price of the scooty is:"+p);
}
 i=3;
do{
	System.out.println("the price of the scooty:"+price[i]);
	i++;
}
while(i<price.length);
i=0;
while(i<price.length){
	System.out.println("the price of the scooty:"+price[i]);
	i++;
}

}
}