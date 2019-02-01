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
        switch (att1) {
        case (att1 instanceof Bool):
            return (att1.getValue() == parseBoolean(att2));
        case (att1 instanceof Int):
            int val1 = att1.getValue();
            int val2 = Integer.valueOf(att2);
            if (op.equals("="))
                return (val1 == val2);
            else if (op.equals("<"))
                return (val1 < val2);
            else if (op.equals(">"))
                return (val1 > val2);
            else
                return (val1 == val2);
        case (att1 instanceof List):
            if (att1.valueExists(att2))
                return (att1.getValue().equals(att2));
            else
                return false;
        default:
            return false;
        }
    }

}
