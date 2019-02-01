import java.util.*;

public class Composant {

  static final String arr[] = {"Fenêtre", "boite Dialogue", "panel", "Bouton", "Champs Texte", "Combo Box", "Liste Déroulante", "case A cochet","Bouton Radio","cône"}; 
  static final Set<String> types = new HashSet<>(Arrays.asList(arr));
  private String type;
  private String name;
  ArrayList<Attribut> attributs = new ArrayList<>();
  ArrayList<Composant> composants = new ArrayList<Composant>();

  public Composant(String name, String type) {
    this.type = type;
    this.name = name;
  }

  public static boolean typeExists(String type) {
    return (types.contains(type));
  }

  public void addComposant(Composant comp) {
    this.composants.add(comp);
  }

  public void addAttribut(Attribut att) {
    this.attributs.add(att);
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
