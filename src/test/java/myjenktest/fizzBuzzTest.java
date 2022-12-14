package myjenktest;

import org.junit.jupiter.api.*;


import myjenktest.tutorial.FizzBuzz;

public class fizzBuzzTest {
	
	public FizzBuzz fb;
	
	@BeforeEach
	public void setup(){
		fb= new FizzBuzz ();
	}
	
	@DisplayName("Play FizzBuzz with number=1")
	@Test
	public void testNumber() {
		String risultato=fb.play(1);
		Assertions.assertEquals(risultato, "1");
	}
	@DisplayName("Play FizzBuzz with number=3")
	@Test
	public void testFizz() {
		String risultato=fb.play(3);
		Assertions.assertEquals(risultato,"Fizz");
	}
	
		
}
