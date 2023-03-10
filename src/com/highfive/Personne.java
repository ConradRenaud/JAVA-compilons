package com.highfive;

public class Personne extends Object {

  private String firstName;
  private String lastName;
  private int age;

  private String blaz;

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
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

  public Personne(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public Personne() {
    blaz = "Arec";
  }

  //   soit cette méthode pour afficher ce qu'on peut afficher via le main                    1-)
  @Override
  public String toString() {
    return this.firstName + " " + this.lastName + " " + this.age;
  }

  public static void main(String[] args) {
    Personne obj = new Personne("Conrad", "Renaud", 50);

    Personne blaze = new Personne();

    System.out.println(blaze.blaz);

    // System.out.println(obj.firstName + " " + obj.lastName + " " + obj.age);

    System.out.println(obj.toString()); //et hop cette ligne de code pour afficher le résultat            2-)
  }
}
