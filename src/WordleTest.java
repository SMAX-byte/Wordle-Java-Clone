import org.junit.jupiter.api.test;
import static org.junit.jupiter.api.Assertions.*;
public class WordleTest {

   @test
   public void testdidWin() {
       char[] guess1 = {'H', 'E', 'L', 'L', 'O'};
       char[] target1 = {'H', 'E', 'L', 'L', 'O'};
       assertTrue(src.Game.didWin(guess1, target1));

       char[] guess2 = {'H', 'E', 'L', 'L', 'O'};
       char[] target2 = {'W', 'O', 'R', 'L', 'D'};
       assertFalse(src.Game.didWin(guess2, target2));

       char[] guess3 = {'A', 'B', 'C', 'D', 'E'};
       char[] target3 = {'A', 'B', 'C', 'D', 'F'};
       assertFalse(src.Game.didWin(guess3, target3));}
}