import java.util.*;

public class AttributFactory {
    private Attribut att = null;

    public Attribut createAttribut(String name, String type) {
        switch (type) {
        case "Boolean":
            this.att = new Bool(name);
            break;
        case "int":
            this.att = new Int(name);
            break;
        default:
            this.att = new List(name);
            break;
        }
        return this.att;
    }

}
