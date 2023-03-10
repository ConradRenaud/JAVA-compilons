package com.highfive;

public class Compteur {

  private int count; //  un champ, la variable
  private static int i;

  static {
    i = 0;
    // System.out.println(i);
  }

  public Compteur() {
    // count = 0;
    // count++;
    i++;
    // System.out.println(count);
    System.out.println(i);
  }

  public static void main(String[] args) {
    Compteur c1 = new Compteur();
    Compteur c2 = new Compteur();
    Compteur c3 = new Compteur();
  }
}
