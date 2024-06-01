
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
	 * 
	 * @inspects|this 
	 * @Creates | result
	 * 
	 */
	public char[] getCharacters() {
		throw new RuntimeException("Not yet implemented");
	}

	/**
	 * 
	 * @inspects|this
	 * 
	 */
	public int getLength() {
		throw new RuntimeException("Not yet impl");
	}
	
	/**
	 * @pre|index>0&&index<= getLength()
	 * 
	 * @inspects|this
	 * 
	 * @post|result==getCharacters()[index]
	 * 
	 */
	public char getCharacterAt(int index) {
		throw new RuntimeException("Not yet implemented");
	}
	
	
	
	/**	 
	 * @pre|characters!=null
	 *  
	 * @inspects|characters
	 * 
	 * @post|Arrays.equals(getCharacters(),characters)
	 */
	public String(char[] characters) {
		throw new RuntimeException("not yet impl");
	}
	
	
	
	
	
	
	
	
	
}
