import java.util.*;

public class List implements Attribut {
    private Set<String> values = new HashSet<>();
    private String value;
    private String name;

    public List(String name) {
        this.name = name;
    }

    public boolean valueExists(String value) {
        return (this.values != null && this.values.contains(value));
    }

    public void setValues(HashSet values) {
        this.values = values;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }
}
