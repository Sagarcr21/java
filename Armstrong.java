class Armstrong{
public static void main(String[] args){
int num=153;
int div=num;
int s=0;
//while loop
while(num>0){
int digit=num%10;
s=s+(digit*digit*digit);
num=num/10;
}
if(div==s){
System.out.println("armstrong");
	}else{
	System.out.println("not armstrong");
	}
	//do while loop
	num=152;
	div=num;
	s=0;
	do{
		int digit=num%10;
        s=s+(digit*digit*digit);
        num=num/10;
	}while(num>0);
	if(div==s){
System.out.println("armstrong");
	}else{
	System.out.println("not armstrong");
	}
		
	}
	}