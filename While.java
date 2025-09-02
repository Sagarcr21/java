class While{
public static void main(String[] args){

int i=10;
boolean flag=true;
while(flag){
if(i>11){
System.out.println("true");
i=i+1;

}
else{
System.out.println("false");
break;
}
}
}
}