class Prime{
public static void main(String [] args){
int num=73;
int count=0;
//for loop
for(int i=1;i<=num;i++){
    if(num%i==0){
	count++;
	}
}
	if(count==2){
	System.out.println("prime");
	}else{
	System.out.println("not prime");
	}
	//while loop
	int i=1;
	count=0;
	while(i<=num){
		if(num%i==0){
			count++;
		}
		i++;
	}
	if(count==2){
	System.out.println("prime");
	}else{
	System.out.println("not prime");
	}
	//do while loop
	i=1;
	count=0;
	do{
		if(num%i==0){
		count++;
		}i++;
	}while(i<=num);
	if(count==2){
	System.out.println("prime");
	}else{
	System.out.println("not prime");
	}
	}
	}

