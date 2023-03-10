package com.highfive;

public class Exo1 {

  //   public static void main(String[] args) {
  //     System.out.println(args[0]);
  //   }

  public static void main(String[] args) {
    // quand on a bcp d'arguments il faut parcourir son tableau String et exécuter la commande dans la console
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}
