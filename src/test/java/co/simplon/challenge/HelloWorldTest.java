package co.simplon.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest 
{
	 @Test
	    public void helloNoName() {
	        assertEquals("Hello, World!", HelloWorld.hello(""));
	        assertEquals("Hello, World!", HelloWorld.hello(null));
	    }

	    @Test
	    public void helloSampleName() {
	        assertEquals("Hello, Alice!", HelloWorld.hello("Alice"));
	    }

	    @Test
	    public void helloAnotherSampleName() {
	        assertEquals("Hello, Bob!", HelloWorld.hello("Bob"));
	    }
}
