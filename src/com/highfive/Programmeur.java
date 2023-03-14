package com.highfive;

public class Programmeur extends Personne {
  {
    System.out.println("first bloc");
  }

  {
    System.out.println("second bloc");
  }

  {
    System.out.println("third bloc");
  }

  @Override
  public void Present() {
    System.out.println("je suis un programmeur.");
  }

  public Programmeur(
    String firstName,
    String lastName,
    int age,
    Address add,
    String bloc1,
    String bloc2,
    String bloc3
  ) {
    super(firstName, lastName, age, add);
    System.out.println("Constructeur de programmeur");
  }

  public Programmeur() {
    super();
    System.out.println("C'est moi");
    // super.getFirstName();
  }

  static {
    System.out.println("bloc static");
  }

  public static void main(String[] args) {
    Programmeur rad = new Programmeur();
    rad.Present();
  }
}
