 class Tabel3 {
  public static void main(String[] args) {
 
boolean isAvailable[]={true,false,true,false};
isAvailable[3]=true;


for(int i=0;i<isAvailable.length;i++){


if(isAvailable[i]==false){
	continue;
}
else{
	System.out.println(isAvailable[i]);
}
}
  }
}