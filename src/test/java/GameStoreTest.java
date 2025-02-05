import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        int tetrisCartQuantity = 4;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            if (tetrisCartQuantity > tetrisStoreQuantity) {
                throw new IllegalArgumentException("Error: Cannot add more than available stock (" + tetrisStoreQuantity + ").");
            }
        });

        assertEquals("Error: Cannot add more than available stock (2).", exception.getMessage());
    }

    @Test
    public void gameTitle() {
        String gameTitle = "Tetris";
        Assertions.assertNotNull(gameTitle);
    }
}
