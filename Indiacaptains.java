class Indiacaptains{ 
public static void main(String[] args){
  int i;
  String captainofIndia[]={"virat","rohit","kl rahul","rahul dhravid","dhoni"};
  /*  for(i=0;i<captainofIndia.length;i++){
	System.out.println( "the captainofIndia is :"+captainofIndia[i]);
	}
	
//	for loop reverse
    for(i=captainofIndia.length-1;i>0;i--){
	System.out.println(" thecaptainofIndia  :"+captainofIndia[i]);
	}*/
	
//for each statement
  for(String captain: captainofIndia){
  System.out.println("captainofIndia:"+captain);
}  

	
	}
	}