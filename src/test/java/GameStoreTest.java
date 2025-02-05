import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameStoreTest {

    @Test
    public void gameQuantityTest() {
        int tetrisStoreQuantity = 2;
        int tetrisCartQuantity = 1;
        Assertions.assertTrue(tetrisStoreQuantity >= tetrisCartQuantity);
    }

    @Test
    public void gameQuantityTestErrorMessage() {
        int tetrisStoreQuantity = 2;
        int tetrisCartQuantity = 1;
        Assertions.assertTrue(tetrisStoreQuantity >= tetrisCartQuantity);
    }

    @Test
    public void gameTitle() {
        String gameTitle = "Tetris";
        Assertions.assertNotNull(gameTitle);
    }
}
