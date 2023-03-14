package com.highfive;

public class Personne {

  private String firstName;
  private String lastName;
  private int age;
  private String username;

  {
    username = "Edhor";
  }

  private Address add;
  private String blaz;

  // protected String field;

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getBlaz() {
    return blaz;
  }

  public void setBlaz(String blaz) {
    this.blaz = blaz;
  }

  public Personne(String firstName, String lastName, int age, Address add) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.add = add;
  }

  public Personne() {
    blaz = "Arec";
    System.out.println("je suis là");
  }

  public void Present() {
    System.out.println(
      "Je m'appelle " +
      this.getFirstName() +
      " et j'habite au " +
      this.add.getCountry() +
      "/" +
      this.add.getCity() +
      " dans le " +
      this.add.getStreet()
    );
  }

  //   soit cette méthode pour afficher ce qu'on veut afficher via le main                    1-)
  @Override
  public String toString() {
    return this.firstName + " " + this.lastName + " " + this.age;
  }

  public static void main(String[] args) {
    // Address add = new Address("Bénin", "Cotonou", "14");
    // Personne obj = new Personne("Conrad", "Renaud", 50, add);
    // System.out.println(obj.toString()); // pour afficher le résultat, qui marche aussi sans le .toString           2-)

    // Personne blaze = new Personne();
    // System.out.println(blaze.blaz);
    // System.out.println(obj.firstName + " " + obj.lastName + " " + obj.age);
  }

  public Address getAdd() {
    return add;
  }

  public void setAdd(Address add) {
    this.add = add;
  }
}
