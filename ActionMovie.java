class ActionMovie extends Movie {
    public void stuntScenes() {
        System.out.println("Action movie has thrilling stunts");
    }
    public void rating() {
        System.out.println("Action movie rating: 5 stars");
    }

    public static void main(String[] args) {
        Movie m = new ActionMovie();
        m.play();
        m.rating();
        if (m instanceof ActionMovie) {
            ActionMovie a = (ActionMovie) m;
            a.stuntScenes();
            a.rating();
        }
    }
}