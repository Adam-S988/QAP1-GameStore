import com.keyin.Cart;
import com.keyin.Game;
import com.keyin.GameStore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameStoreTest {

    @Test
    public void addGameToGameStore() {

        GameStore store = new GameStore();
        Game game = new Game(1, "Bo6", 39.99, 10);

        store.addGameToStore(game);

        Assertions.assertTrue(store.browseGames().contains(game), "Game should be added to the store.");
    }

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
    public void calculateCartTotalTest() throws Exception {
        GameStore store = new GameStore();
        Cart cart = new Cart(store);

        Game game1 = new Game(1, "Tetris", 39.99, 5);
        Game game2 = new Game(2, "Super Mario", 59.99, 5);

        store.addGameToStore(game1);
        store.addGameToStore(game2);

        cart.addGame(game1, 1);
        cart.addGame(game2, 2);

        double expectedTotal = (1 * 39.99) + (2 * 59.99);
        Assertions.assertEquals(expectedTotal, cart.calculateTotal(), 0.01, "Total price calculation is incorrect.");
    }



    @Test
    public void gameTitle() {
        String gameTitle = "Tetris";
        Assertions.assertNotNull(gameTitle);
    }
}
