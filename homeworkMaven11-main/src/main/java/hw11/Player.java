package hw11;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Player implements Comparable<Player>{
    protected int id;
    @Getter
    protected String name;
    @Getter
    protected int strength;

    @Override
    public int compareTo(Player o) {
        return Integer.compare(this.strength, o.strength);
    }
}