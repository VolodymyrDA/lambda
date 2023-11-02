package hw11;

import hw11.Game;
import hw11.NotRegisteredException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameTest {
    @Test
    public void ifFirstPlayerWin() {
        Player mark = new Player(123, "Mark", 150);
        Player dasha = new Player(156, "Dasha", 80);
        Game game = new Game();

        game.register(mark);
        game.register(dasha);

        int actual = game.round("Mark", "Dasha");
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void ifSecondPlayerWin() {
        Player mark = new Player(123, "Mark", 150);
        Player kolya = new Player(132, "Kolya", 151);
        Game game = new Game();

        game.register(mark);
        game.register(kolya);

        int actual = game.round("Mark", "Kolya");
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void ifDraw() {
        Player mark = new Player(123, "Mark", 150);
        Player maksim = new Player(163, "Maksim", 150);
        Game game = new Game();

        game.register(mark);
        game.register(maksim);

        int actual = game.round("Mark", "Maksim");
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void ifFirstPlayerNotRegistered() {

        Player maksim = new Player(163, "Maksim", 150);
        Game game = new Game();


        game.register(maksim);

//        int actual = game.round("Mark", "Maksim");
//        int expected = 0;

        Assertions.assertThrows(NotRegisteredException.class, () -> {game.round("Mark","Maksim");});
    }
    @Test
    public void ifSecondPlayerNotRegistered() {

        Player maksim = new Player(163, "Maksim", 150);
        Game game = new Game();


        game.register(maksim);

//        int actual = game.round("Mark", "Maksim");
//        int expected = 0;

        Assertions.assertThrows(NotRegisteredException.class, () -> {game.round("Maksim","Mark");});
    }


}
