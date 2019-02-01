import java.util.*;

public class Composant {

  static final String arr[] = {"Fenêtre", "boite Dialogue", "panel", "Bouton", "Champs Texte", "Combo Box", "Liste Déroulante", "case A cochet","Bouton Radio","cône"}; 
  static final Set<String> types = new HashSet<>(Arrays.asList(arr));
  private String type;
  private String name;
  HashMap<String, Attribut> attributs = new HashMap<String, Attribut>();
  HashMap<String, Action> actions = new HashMap<String, Action>();
  HashMap<String, Composant> composants = new HashMap<String, Composant>();

  public Composant(String name, String type) {
    this.type = type;
    this.name = name;
  }

  public static boolean typeExists(String type) {
    return (types.contains(type));
  }

  public boolean attExists(String att) {
    return (attributs.containsKey(att));
  }

  public boolean actionExists(String act) {
    return (actions.containsKey(act));
  }

  public Attribut getAttribut(String att) {
    return (attributs.get(att));
  }

  public Action getAction(String act) {
    return (actions.get(act));
  }

  public void addComposant(String name, Composant comp) {
    this.composants.put(name, comp);
  }

  public void addAttribut(String name, Attribut att) {
    this.attributs.put(name, att);
  }

  public void addAction(String name, Action act) {
    this.actions.put(name, act);
  }

  public void action(String name) {
    Action act = this.actions.get(name);
    act.execute();
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the type
   */
  public String getType() {
    return type;
  }

}
