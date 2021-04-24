package st;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Task1_Functional {
	
	private Parser parser;

	@Before
	public void set_up() {
		parser = new Parser();
	}

	@Test
	public void sameOptionNameAndShortcut_test() { //bug 1
		parser.add("opt", "opt", Parser.STRING);
	}
	
	@Test
	public void invalidOptionName_test() { //bug 2
		parser.add(".", "o", Parser.STRING);
	}
	
	@Test
	public void invalidCommandLine_test() { //bug 3
		parser.add("output", "o", Parser.STRING);
		parser.parse("--o");
	}
	
	@Test
	public void booleanOption_test() { //bug 4
		parser.add("optimise", "O", Parser.BOOLEAN);
		parser.parse("--optimise=0");
		assertTrue(parser.getBoolean("optimise") == false);
	}
	
	@Test
	public void defaultCharValue_test() { //bug 5
		parser.add("optchar", Parser.CHAR);
		assertTrue(parser.getChar("optchar") == '\0');
	}
	
	@Test
	public void valueFormat_test() { //bug 6
		parser.add("option", Parser.STRING);
		assertTrue(parser.parse("--option='value'") == parser.parse("--option=value"));
	}
	
	@Test
	public void quotationMarks_test() { //bug 9
		parser.add("input", "i", Parser.STRING);
		parser.add("output", "o", Parser.STRING);
		parser.parse("--input='value=\"abc.txt\"' --output='value=\"abc.txt\"'");
		assertEquals("value=\"abc.txt\"", parser.getString("input"));
	}
	
	@Test
	public void sameOptionNameAndShortcutInCommandLine_test() { //bug 10
		parser.add("o", Parser.BOOLEAN);
		parser.add("output", "o", Parser.STRING);
		assertEquals(0, parser.parse("--o=true -o=abs"));
	}
	
	@Test
	public void sameOptionNameAndShortcutInDifferentParsers_test() { //bug 11
		parser.add("output", "o", Parser.BOOLEAN);
		parser.parse("-o=false");
		parser.add("o", "osc", Parser.BOOLEAN);
		parser.parse("--o=true");
		assertEquals(true, parser.getBoolean("o"));
	}
	
	@Test
	public void emptyCommandLine_test() { //bug 12
		parser.parse("");
	}
	
	@Test
	public void searchOrder_test() { //bug 13
		parser.add("output", "o", Parser.BOOLEAN);
		parser.add("newoutput", "output", Parser.BOOLEAN);
		parser.parse("-o=true");
		parser.parse("-output=false");
		assertEquals(true, parser.getBoolean("output"));
	}
	
}
