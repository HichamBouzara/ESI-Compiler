import java.util.*;

public class Action {
    private String name;
    private Condition condition;
    private Attribut attribut;
    private String affectation;

    public Action(String name, Condition cond, Attribut att, String aff) {
        this.name = name;
        this.condition = cond;
        this.attribut = att;
        this.affectation = aff;
    }

    public void execute() {
        if (condition.test()) {
            switch (attribut) {
            case (attribut instanceof Bool):
                attribut.setValue(parseBoolean(affectation));
                break;
            case (attribut instanceof Int):
                attribut.setValue(Integer.valueOf(affectation));
                break;
            case (attribut instanceof List):
                attribut.setValue(affectation);
                break;
            default:
                break;
            }
        }
    }
}
