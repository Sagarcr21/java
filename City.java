class City extends State {
    void cityName() {
        System.out.println("City: Bangalore");
    }



    public static void main(String[] args) {
        City obj = new City();
        obj.countryName();
        obj.stateName();
        obj.cityName();
		State h = new City();
		h.cityName();
		Country n=new State();
		n.stateName();
    }
}