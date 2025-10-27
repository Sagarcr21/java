class Slipper{
 public void quality(){
 System.out.println("the slipper is good quality");
s.price();
s.quality();
if(s instanceof Cross){
Cross c =(Cross) s;
c.moderte();
c.price();
}else{
System.out.println("not an instance");
}
	
}
}
