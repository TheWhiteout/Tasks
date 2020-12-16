
public class ComicBook extends Book {
	private String characterName;

	public ComicBook(double regularPrice, String publisher, int yearPublished, String characterName) {
		super(regularPrice, publisher, yearPublished);
		setCharacterName(characterName);
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public double computeSalePrice() {
		return super.getRegularPrice() * 0.4;
	}
}
