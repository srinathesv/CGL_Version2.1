import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author srinath
 *
 */
class CellTest {
	Cell c= new Cell();
		
	@Test
	public void testcount() {
		System.out.println("======TEST TWO EXECUTED=======");
		Assertions.assertEquals(2, c.count(5,6));
	}

}
