/**
 * 
 */

/**
 * @author toliy47
 *
 */
public class GameCharacterSlash extends GameCharacter{
	public GameCharacterSlash(){
		instrumentUsed = new GibsonSG();
		actUsed = new PutTheGuitarOnFire();
	}

	public void display() {
		System.out.println("I'm Slash!");
	}
}
