import java.util.*;

public class Bool extends Attribut {
    private boolean value;

    public Bool(String name) {
        this.name = name;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return this.value;
    }

}
