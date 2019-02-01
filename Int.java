import java.util.*;

public class Int extends Attribut {
    private int value;

    public Int(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
