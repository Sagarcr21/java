class Array{
public static void main(String[] args){
String name="Sagar";
String rev=" ";

for(int i=name.length()-1;i>=0;i--){
	rev=rev+name.charAt(i);
}
System.out.println("the reverse order is:"+rev);
int [] num={1,2,3,4,5,6,7,8,9};
		System.out.println("the reverse order of number is :");
		for(int i=num.length-1;i>=0;i--){
			System.out.println(num[i]);
		}

}
}