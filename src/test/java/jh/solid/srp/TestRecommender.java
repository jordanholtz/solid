package jh.solid.srp;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRecommender {

	@Test
	public void basic_test() {
		Recommender r = new Recommender();
		
		List<Movie> recommenations = r.recommendations(BBDD.JOHN);
		
		Assertions.assertFalse(recommenations.contains(BBDD.ET));
	}
	
	@Test 
	public void test_format() {
		Recommender r = new Recommender();
		
		String csv = r.recommendationsCSV(BBDD.JOHN);
		
		String expected = "Saving Private Ryan,Spielberg,war";
		
		Assertions.assertEquals(expected, csv);
	}

}
