class Palindrome{
public static void main(String[] args){
int num =121;
int div=num;
int s=0;
//while loop
while(num>0){
int digit=num%10;
s=s*10+digit;
num=num/10;
}
if(div==s){
System.out.println("palindrome");
}
else{
System.out.println("not palindrome");
}
//for loop
String name ="malayalam";
String rev="";
for( int i=name.length()-1;i>=0;i--){
	rev=rev+name.charAt(i);
}
System.out.println(rev);
num=div;
s=0;
do {
	int digit=num%10;
	s=(s*10)+digit;
	num=num/10;
}while(num>0);

if(div==s){	

System.out.println("palindrome");
}
else{
System.out.println("not palindrome");
}
}
}
