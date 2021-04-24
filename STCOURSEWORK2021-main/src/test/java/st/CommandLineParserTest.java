package st;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommandLineParserTest {

private Parser parser;

	@Before
	public void set_up() {
		parser = new Parser();
	}
	
	@Test
	public void example_test() {
		parser.add("option", "o", Parser.STRING);
		parser.parse("--option=output.txt");
		assertEquals(parser.getString("option"), "output.txt");
	}

}
