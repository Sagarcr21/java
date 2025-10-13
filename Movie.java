class Movie {
    String name;
    String actor;
    int rating;

    Movie(String name, String actor, int rating) {
        this.name = name;
        this.actor = actor;
        this.rating = rating;
    }

    void movieName() {
        System.out.println("Movie Name: " + name);
        hero();
    }

    void hero() {
        System.out.println("Lead Actor: " + actor);
        rate();
    }

    void rate() {
        System.out.println(name + " has IMDb rating: " + rating);
    }

    public static void main(String[] args) {
        Movie m = new Movie("KGF", "Yash", 9);
        m.movieName();
    }
}
