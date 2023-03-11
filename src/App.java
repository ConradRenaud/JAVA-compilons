import com.highfive.Address;
import com.highfive.Personne;
import com.highfive.Programmeur;

public class App {

  public static void main(String[] args) {
    Address add = new Address("Bénin", "Cotonou", "14");
    Personne obj = new Personne("Conrad", "Renaud", 50, add);
    obj.Present();

    Personne blaze = new Personne();
    System.out.println(blaze.getBlaz());

    Programmeur block = new Programmeur();
  }
}
