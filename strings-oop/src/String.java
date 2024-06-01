
import java.util.Arrays;

/**
 * Each instance of this class represents a sequence of text characters
 * 
 * @invar|getLength()==getCharacters().length
 * @invar|getCharacters()!=null
 * 
 * @immutable
 * 
 */
public class String {
	
	/**
	 * @representationObject
	 * 
	 */
	private char[] characters;
	
	
	/**
	 * 
	 * @inspects|this 
	 * @Creates | result
	 * 
	 */
	public char[] getCharacters() {
		return characters.clone();
	}

	/**
	 * 
	 * @inspects|this
	 * 
	 */
	public int getLength() {
		return characters.length;
	}
	
	/**
	 * @pre|index>=0&&index<= getLength()
	 * 
	 * @inspects|this
	 * 
	 * @post|result==getCharacters()[index]
	 * 
	 */
	public char getCharacterAt(int index) {
		return characters[index];
	}
	
	
	
	/**	 
	 * @pre|characters!=null
	 *  
	 * @inspects|characters
	 * 
	 * @post|Arrays.equals(getCharacters(),characters)
	 */
	public String(char[] characters) {
		this.characters=characters.clone();
	}
	
	
	
	
	
	
	
	
	
}
