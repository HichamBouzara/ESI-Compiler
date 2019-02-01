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
            if (this.attribut instanceof Bool) {
                Bool b = (Bool) attribut;
                b.setValue(affectation);
            }

            else if (this.attribut instanceof Int) {
                Int i = (Int) attribut;
                i.setValue(affectation);
            }

            else if (this.attribut instanceof List) {
                List l = (List) attribut;
                l.setValue(affectation);
            }

        }
    }
}
