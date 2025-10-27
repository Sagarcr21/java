class Song extends Music {
    public void artist() {
        System.out.println("Song sung by Arijit Singh");
    }
    public void type() {
        System.out.println("Music type: romantic song");
    }

    public static void main(String[] args) {
        Music m = new Song();
        m.play();
        m.type();
        if (m instanceof Song) {
            Song s = (Song) m;
            s.artist();
            s.type();
        }
    }
}
