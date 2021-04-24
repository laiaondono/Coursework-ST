package st;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Task3_TDD_2 {

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
	public void length1RangeInBetween_test() { //specification 6 NEW
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=testA-a-.txt");
		List<Character> expected_list = Arrays.asList('t', 'e', 's', 't', 'a', '.', 't', 'x', 't');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void length1RangeInBetween2_test() { //specification 6 NEW
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=test.-A-a.txt");
		List<Character> expected_list = Arrays.asList('t', 'e', 's', 't', '.', 'a', '.', 't', 'x', 't');
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
	public void noRangeAndRange_test() { //specification 6 NEW
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=test1-.1-4.txt");
		List<Character> expected_list = Arrays.asList('t', 'e', 's', 't', '1', '.', '1', '2', '3', '4', '.', 't', 'x', 't');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void noRangeAndRange2_test() { //specification 6 NEW
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=test1-.-1-4.txt");
		List<Character> expected_list = Arrays.asList('t', 'e', 's', 't', '1', '.', '1', '2', '3', '4', '.', 't', 'x', 't');
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
	public void twoIntervals1_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=a-c-f");
		List<Character> expected_list = Arrays.asList('a', 'b', 'c', 'c', 'd', 'e', 'f');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void twoIntervals2_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=a-cc-f");
		List<Character> expected_list = Arrays.asList('a', 'b', 'c', 'c', 'd', 'e', 'f');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void twoIntervals3_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=e-e-e");
		List<Character> expected_list = Arrays.asList('e', 'e');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void threeIntervals_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=1-2-3-4");
		List<Character> expected_list = Arrays.asList('1', '2', '2', '3', '3', '4');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	@Test
	public void twoHyphens_test() { //specification 6
		parser.add("list", "l", Parser.STRING);
		parser.parse("--list=a--d");
		List<Character> expected_list = Arrays.asList('a', 'd');
		assertEquals(expected_list, parser.getCharacterList("list"));
	}
	
	//TESTS FOR HELPER METHODS (NEW)
	
	//isRange
	@Test
	public void isRange_test1() {
		assertEquals(false, parser.isRange("a--d", 1));
	}
	
	@Test
	public void isRange_test2() {
		assertEquals(true, parser.isRange("e-e-e", 1));
	}
	
	@Test
	public void isRange_test3() {
		assertEquals(false, parser.isRange("test1-.-1-4.txt", 5));
	}
	
	@Test
	public void isRange_test4() {
		assertEquals(false, parser.isRange("test1-.-1-4.txt", 7));
	}
	
	@Test
	public void isRange_test5() {
		assertEquals(true, parser.isRange("test1-.-1-4.txt", 9));
	}
	
	@Test
	public void isRange_test6() {
		assertEquals(false, parser.isRange("test1-4-.txt", 7));
	}
	
	//getRange
	@Test
	public void getRange_test1() {
		List<Character> expected_list = Arrays.asList();
		assertEquals(expected_list, parser.getRange("e-e-e", 1));
	}
	
	@Test
	public void getRange_test2() {
		List<Character> expected_list = Arrays.asList('2', '3', '4');
		assertEquals(expected_list, parser.getRange("test1-4-.txt", 5));
	}
	
	@Test
	public void getRange_test3() {
		List<Character> expected_list = Arrays.asList('d', 'e', 'f');
		assertEquals(expected_list, parser.getRange("a-cc-f", 4));
	}
	
	@Test
	public void getRange_test4() {
		List<Character> expected_list = Arrays.asList('4', '5');
		assertEquals(expected_list, parser.getRange("aa3-5", 3));
	}
	
	@Test
	public void getRange_test5() {
		List<Character> expected_list = Arrays.asList('o', 'n', 'm', 'l');
		assertEquals(expected_list, parser.getRange("p-l", 1));
	}
	
	@Test
	public void getRange_test6() {
		List<Character> expected_list = Arrays.asList('8', '7', '6');
		assertEquals(expected_list, parser.getRange("test9-6-.txt", 5));
	}

}
