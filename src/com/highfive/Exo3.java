package com.highfive;

public class Exo3 {

  private String name;
  private String travail;
  private int old;

  public Exo3(String nom) {
    this.name = nom;
  }

  public Exo3(int age) {
    this.old = age;
  }

  // public void Work(String dev) {
  //   this.travail = dev;
  // }

  // public String Works() {
  //   return this.travail;
  // }

  public Exo3() {
    travail = "développeur";
  }

  public static void main(String[] args) {
    Exo3 humain = new Exo3(60);
    Exo3 etudiant = new Exo3("Conrad");
    Exo3 job = new Exo3();

    System.out.println(humain.old + " ans");
    System.out.println(
      etudiant.name +
      " que je suis se met au travail en tant que " +
      job.travail
    );
  }
}
