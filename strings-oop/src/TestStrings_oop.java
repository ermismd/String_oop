import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStrings_oop {

	@Test
	void testStrings() {
		
		char[] characters= {'h','e','l','l','o'};
		String mystring=new String(characters);
		assertArrayEquals(new char[] {'h','e','l','l','o'},mystring.getCharacters());
		
	assertEquals(5,mystring.getLength());
	assertEquals('h',mystring.getCharacterAt(0));
		
		
	}

}
