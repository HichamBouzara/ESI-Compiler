import java.util.*;

public class Condition {
    private String att2, op;
    private Attribut att1;

    public Condition(Attribut att1, String op, String att2) {
        this.att1 = att1;
        this.att2 = att2;
        this.op = op;
    }

    public Boolean test() {
        if (att1 instanceof Bool) {
            Bool b = (Bool) att1;
            return (b.getValue() == Boolean.parseBoolean(att2));
        } else if (att1 instanceof Int) {
            Int i = (Int) att1;
            int val1 = i.getValue();
            int val2 = Integer.valueOf(att2);
            if (op.equals("="))
                return (val1 == val2);
            else if (op.equals("<"))
                return (val1 < val2);
            else if (op.equals(">"))
                return (val1 > val2);
            else if (op.equals("!="))
                return (val1 != val2);
            else
                return (val1 == val2);
        } else if (att1 instanceof List) {
            List l = (List) att1;
            if (l.valueExists(att2))
                return (l.getValue().equals(att2));
            else
                return false;
        } else
            return false;

    }

}
