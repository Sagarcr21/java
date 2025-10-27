class Player extends Level {
    void play() {
        System.out.println("Player is playing the game");
    }

	

    public static void main(String[] args) {
        Player obj = new Player();
        obj.startGame();
        obj.levelOne();
        obj.play();
		Level obj2 = new Player();
		obj2.play();
		Game d =new Player();
		d.levelOne();
		

    }
}