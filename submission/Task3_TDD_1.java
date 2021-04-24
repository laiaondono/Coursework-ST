package st;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Task3_TDD_1 {
	
	private Parser parser;

	@Before
	public void set_up() {
		parser = new Parser();
	}
	
	@Test
	public void orderOfSearch_test() { //specification 1
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=test123");
		parser.add("list_new", "list", Parser.STRING);
		parser.parse("-list=test_aux");
		List<Character> expected_list = Arrays.asList('t', 'e', 's', 't', '1', '2', '3');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void optionWithoutValue_test() { //specification 2
		parser.add("list", "l", Parser.STRING);
		parser.parse("");
		List<Character> expected_list = Arrays.asList();
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void validList_test() { //specification 3
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=test123.txt");
		List<Character> expected_list = Arrays.asList('t', 'e', 's', 't', '1', '2', '3', '.', 't', 'x', 't');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void invalidList_test() { //specification 3
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=test123*.txt:)");
		List<Character> expected_list = Arrays.asList('t', 'e', 's', 't', '1', '2', '3', '.', 't', 'x', 't');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void caseInsensitive_test() { //specification 4
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=TEST123.txt");
		List<Character> expected_list = Arrays.asList('t', 'e', 's', 't', '1', '2', '3', '.', 't', 'x', 't');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void HyphenFirstCharacter_test() { //specification 5
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=-test123.txt");
		List<Character> expected_list = Arrays.asList();
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void HyphenNotFirstCharacter_test() { //specification 5
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=test123-.txt");
		List<Character> expected_list = Arrays.asList('t', 'e', 's', 't', '1', '2', '3', '.', 't', 'x', 't');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void lowercaseASCRange_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=a-d");
		List<Character> expected_list = Arrays.asList('a', 'b', 'c', 'd');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void lowercaseDESCRange_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=d-a");
		List<Character> expected_list = Arrays.asList('d', 'c', 'b', 'a');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void uppercaseASCRange_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=A-D");
		List<Character> expected_list = Arrays.asList('a', 'b', 'c', 'd');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void uppercaseDESCRange_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=D-A");
		List<Character> expected_list = Arrays.asList('d', 'c', 'b', 'a');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void mixCaseASCRange_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=a-D");
		List<Character> expected_list = Arrays.asList('a', 'b', 'c', 'd');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void mixCaseDESCRange_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=D-a");
		List<Character> expected_list = Arrays.asList('d', 'c', 'b', 'a');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void length1Range_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=A-a");
		List<Character> expected_list = Arrays.asList('a');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void digitToDigitRange_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=test1-4-.txt");
		List<Character> expected_list = Arrays.asList('t', 'e', 's', 't', '1', '2', '3', '4', '.', 't', 'x', 't');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void digitToAlphabeticRangeASC_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=test8-c.txt");
		List<Character> expected_list = Arrays.asList('t', 'e', 's', 't', '8', '9', 'a', 'b', 'c', '.', 't', 'x', 't');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void alphabeticToDigitRangeDESC_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=c-8");
		List<Character> expected_list = Arrays.asList('c', 'b', 'a', '9', '8');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void TwoIntervals1_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=a-c-f");
		List<Character> expected_list = Arrays.asList('a', 'b', 'c', 'c', 'd', 'e', 'f');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void TwoIntervals2_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=a-cc-f");
		List<Character> expected_list = Arrays.asList('a', 'b', 'c', 'c', 'd', 'e', 'f');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void TwoIntervals3_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=e-e-e");
		List<Character> expected_list = Arrays.asList('e', 'e');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void TwoHyphens_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=a--d");
		List<Character> expected_list = Arrays.asList('a', 'd');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}

}
