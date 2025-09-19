class Swap{
public static void main(String[] arags){
int a=2;
int b=3;
System.out.println("before swaping");
System.out.println("a="+a+"b="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swaping");
System.out.println("a="+a+"b="+b	);
}
}