class Even{
public static void main(String[] args){
int num=4;
int i=num;
for( i=num;i<=num;i++){
if(num%2==0){
System.out.println("even");
}else{
System.out.println("odd");
}
}
//while loop
num=4;
i=num;
while(i==num){
	if(num%2==0){
System.out.println("even");
}else{
System.out.println("odd");
}
i++;
}
//do while
i=num;
num=4;
do{
	if(num%2==0){
	System.out.println("even");
}else{
System.out.println("odd");
}i++;
}
while(i==num);	
}
}