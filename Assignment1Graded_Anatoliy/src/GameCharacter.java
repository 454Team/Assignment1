/**
 * @author toliy47
 *
 */
public abstract class GameCharacter {
	InstrumentUsed instrumentUsed;
	ActUsed actUsed;

	public abstract void display();
	
	public GameCharacter(){
	}
	
	public void playGuitar(){
		instrumentUsed.playGuitar();
	}
	
	public void playSolo(){
		actUsed.act();
	}
	
	public void changeInstrument(InstrumentUsed iu){
		instrumentUsed = iu;
	}
	
	public void changeSolo(ActUsed au){
		actUsed = au;
	}
}
