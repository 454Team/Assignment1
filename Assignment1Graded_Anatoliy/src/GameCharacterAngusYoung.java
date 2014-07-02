/**
 * 
 */

/**
 * @author toliy47
 *
 */
public class GameCharacterAngusYoung extends GameCharacter{
	public GameCharacterAngusYoung(){
		instrumentUsed = new GibsonFlyingV();
		actUsed = new SmashTheGuitar();
	}
	public void display() {
		System.out.println("I'm Angus Young!");
	}

}
