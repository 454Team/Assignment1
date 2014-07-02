public abstract class GameCharacter {
	
	Guitar guitar;
	Solo solo;

	public GameCharacter() {}

	public void playGuitar()
	{
		guitar.play();
	}

	public void playSolo()
	{
		solo.perform();
	}

	public void setGuitar(Guitar newGuitar)
	{
		this.guitar = newGuitar;
	}

	public void setSolo(Solo newSolo)
	{
		this.solo = newSolo;
	}

}// End class