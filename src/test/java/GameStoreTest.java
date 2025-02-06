import com.keyin.Cart;
import com.keyin.Game;
import com.keyin.GameStore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameStoreTest {

    @Test
    public void gameQuantityTest() throws Exception {
        GameStore store = new GameStore();
       Cart cart = new Cart(store);

       Game game = new Game(1,"Bo6",39.99,10);

       Exception exception = assertThrows(Exception.class, () ->  {
            cart.addGame(game,11);
        });
        assertEquals("Cannot add more than available stock.", exception.getMessage());
    }

    @Test
    public void gameTitle() {
        String gameTitle = "Tetris";
        Assertions.assertNotNull(gameTitle);
    }
}
