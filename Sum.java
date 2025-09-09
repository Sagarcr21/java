import java.util.Scanner;
class Sum{
public static void main(String[] args) {
int a = 0;
int b = 1;
int temp = 0;
int i = 0;

Scanner sc=new Scanner(System.in);
System.out.println(" enter a number");
int n = sc.nextInt();
while(i<n){
	System.out.println(temp);
	temp = a + b;
	a = b;
	b = temp;
	i = i + 1;
}
}
}	