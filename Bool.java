import java.util.*;

public class Bool implements Attribut {
    private boolean value;
    private String name;

    public Bool(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = Boolean.parseBoolean(value);
    }

    public Boolean getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

}
