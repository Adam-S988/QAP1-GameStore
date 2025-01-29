import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameStoreTest {

    @Test
    public void gamePriceTest() {
        int a = 1;
        int b = 2;
        Assertions.assertTrue(a < b);
    }

    @Test
    public void gameTitle() {
        String c = "Tetris";
        Assertions.assertNotNull(c);
    }
}
