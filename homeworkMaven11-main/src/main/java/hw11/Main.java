package hw11;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player(1, "Player1", 80);
        Player player2 = new Player(2, "Player02", 85);
        Player player3 = new Player(3, "Player3", 90);
        Player player4 = new Player(4, "Player4", 75);
        Player player5 = new Player(5, "Player5", 88);
        Player player6 = new Player(6, "Player6", 92);
        Player player7 = new Player(7, "Player7", 78);
        Player player8 = new Player(8, "Player8", 87);
        Player player9 = new Player(9, "Player9", 91);
        Player player10 = new Player(10, "Player10", 84);

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        game.register(player6);
        game.register(player7);
        game.register(player8);
        game.register(player9);
        game.register(player10);

        System.out.println(game);

        game.sort();
        System.out.println(game);

        game.sort((p1, p2) -> Integer.compare(p1.id, p2.id));
        System.out.println(game);

        game.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(game);

        game.filter(p->p.strength<90);
        System.out.println(game);

        game.replace(player -> {
            player.strength = 10;
            return player;
        });
        System.out.println(game);
    }
}