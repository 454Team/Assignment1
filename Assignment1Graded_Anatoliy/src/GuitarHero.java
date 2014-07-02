public class GuitarHero {
    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacterSlash();
        GameCharacter player2 = new GameCharacterHendrix();
        
        player1.display();
        player1.playGuitar();
        
        player2.display();
        player2.playGuitar();
        
        player1.display();
        player1.playSolo();
        
        player2.display();
        player2.playSolo();
        
        player1.changeInstrument(new GibsonFlyingV());
        player1.changeSolo(new SmashTheGuitar());
        player1.display();
        player1.playGuitar();
        player1.playSolo();
    }
}
