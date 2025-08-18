class Sandalwood{
	static int i;
  public static void main(String [] args){
	  //int i;
    String sandalwoodMovies[]={"devil","kaatera","raj","KGF","kantara","om"};
//	for loop(forward)
	for(i=0;i<sandalwoodMovies.length;i++){
	System.out.println(" the sandalwoodMovies is:"+sandalwoodMovies[i]);
  }
  //for loop(reverse)
  for(i=sandalwoodMovies.length-1;i>0;i--){
	System.out.println(" the sandalwoodMovies is:"+sandalwoodMovies[i]);
  }
	
 // for each statement
 for (String movie : sandalwoodMovies) {
            System.out.println("The sandalwood movie (for-each) is: " +movie);
        }
		}
}
