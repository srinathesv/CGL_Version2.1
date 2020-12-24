import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author srinath
 *
 */
class TestBoard {
	public void test_create_board(){
		
		 int[][] arrayint=new int[6][2];
		 arrayint[0][0]=0;
		 arrayint[0][1]=4;
		 arrayint[1][0]=1;
		 arrayint[1][1]=1;
		 arrayint[2][0]=2;
		 arrayint[2][1]=1;
		 arrayint[3][0]=3;
		 arrayint[3][1]=2;
		 arrayint[4][0]=5;
		 arrayint[4][1]=4;
		
		 Board b = new Board(6,arrayint);
		
		
	
	 System.out.println("======TEST ONE EXECUTED=======");
	       Assertions.assertEquals("...*..\n*.....\n*.....\n.*....\n......\n...*..",b.createBoard(5, arrayint) );
		
		
	 }
	 public void test_countLiveCells()
	 {
		 int[][] arrayint=new int[6][2];
		
		 arrayint[0][0]=0;
		 arrayint[0][1]=4;
		 arrayint[1][0]=1;
		 arrayint[1][1]=1;
		 arrayint[2][0]=2;
		 arrayint[2][1]=1;
		 arrayint[3][0]=3;
		 arrayint[3][1]=2;
		 arrayint[4][0]=5;
		 arrayint[4][1]=4;
		
		 Board b = new Board(6,arrayint);
		 System.out.println("======TEST ONE EXECUTED=======");
	     Assertions.assertEquals(1,b.countLiveCells(2,3) );
		
		
		
		
	 }
	 @Test	
	 public void  generateNextGeneration()
	 {
		 int[][] arrayint=new int[6][2];
		
		 arrayint[0][0]=0;
		 arrayint[0][1]=4;
		 arrayint[1][0]=1;
		 arrayint[1][1]=1;
		 arrayint[2][0]=2;
		 arrayint[2][1]=1;
		 arrayint[3][0]=3;
		 arrayint[3][1]=2;
		 arrayint[4][0]=5;
		 arrayint[4][1]=4;
		
		 Board b = new Board(6,arrayint);
		 System.out.println("======TEST ONE EXECUTED=======");
	     Assertions.assertEquals("...*..\n......\n......\n.*....\n......\n......",b.generateNextGeneration());
		
	 }
}
