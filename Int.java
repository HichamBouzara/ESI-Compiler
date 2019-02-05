import java.util.*;

public class Int implements Attribut {
    private int value;
    private String name;

    public Int(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = Integer.valueOf(value);
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

}
