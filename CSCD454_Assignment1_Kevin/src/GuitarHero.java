/*
 * Kevin Borling
 * CSCD 454 | Design Patterns
 * Assignment 1 | Strategy Pattern
 */
public class GuitarHero {

    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacterSlash();
        GameCharacter player2 = new GameCharacterHendrix();
        GameCharacter player3 = new GameCharacterAngusYoung();
        player1.playGuitar();
        player2.playGuitar();
        player3.playGuitar();
        player1.playSolo();
        player2.playSolo();
        player3.playSolo();
    }// End main
}// End class