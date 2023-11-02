package hw11;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

@ToString
public class Game {
    List<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    public Player findPlayerByName(String name) {
        Player player = null;
        for (Player currentPlayer : players) {
            if (currentPlayer.name.equals(name)) {
                player = currentPlayer;
            }
        }
        if (player == null) {
            throw new NotRegisteredException(name);
        }
        return player;
    }
    public int round(String playerName1, String playerName2) {
//        ArrayList<Player> test = new ArrayList<Player>();  // создаём объект тест класса Лист плеер.

        Player player1 = findPlayerByName(playerName1);
        Player player2 = findPlayerByName(playerName2);

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }
        if (player2.getStrength() > player1.getStrength()) {
            return 2;
        }
        return 0;
    }
  public void sort(){
      Collections.sort(players);
  }
    public void sort(Comparator<Player> comparator){
        Collections.sort(players,comparator);
    }

    public void filter(Predicate<Player> predicate){
        players.removeIf(predicate);
    }

    public void replace(UnaryOperator<Player> unaryOperator){
        players.replaceAll(unaryOperator);
    }
}