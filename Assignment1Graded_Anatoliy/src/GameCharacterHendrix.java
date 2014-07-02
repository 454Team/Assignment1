/**
 * 
 */

/**
 * @author toliy47
 *
 */
public class GameCharacterHendrix extends GameCharacter{
	public GameCharacterHendrix(){
		instrumentUsed = new FenderTelecaster();
		actUsed = new JumpOffTheStage();
	}
	public void display() {
		System.out.println("I'm Jimmy Hendrix!");
	}

}
