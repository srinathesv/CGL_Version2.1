import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author srinath
 *
 */
class TestGame {
	public void liveCellIsAlive() throws Exception {
        assertTrue(LiveCell.INSTANCE.isAlive());
	}
}
