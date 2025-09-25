class Fibonocci{
public static void main(String[] args){
int a=0;
int b=1;
int num=20;

//for loop
for(int i=0;i<=num;i++){
System.out.println(a);
 int c=a+b;
a=b;
b=c;
}
//while loop
a=0;
b=1;
int i=0;
while(i<=num){
	System.out.println(a);
 int c=a+b;
a=b;
b=c;
i++;
}
//do while loop
a=0;
b=1;
 i=0;

do{
	System.out.println(a);
 int c=a+b;
a=b;
b=c;
i++;
}while(i<=num);
	
}
}