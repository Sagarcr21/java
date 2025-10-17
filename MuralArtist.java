class MuralArtist extends PAinter {
    void muralWork() {
        System.out.println("Mural artist paints on walls");
    }

    public static void main(String[] args) {
        MuralArtist obj = new MuralArtist();
        obj.talent();
        obj.paint();
        obj.muralWork();
		 PAinter d =new MuralArtist();
		 d.muralWork();
		 Artist b = new PAinter();
		 b.paint();
    }
}