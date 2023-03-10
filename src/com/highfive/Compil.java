package com.highfive;

import java.util.Scanner;

public class Compil {

  public static void main(String[] args) {
    // int brother = 2;
    // short sister = 1;
    // long population = 11000000L;
    // byte teeth = 32;
    // float size = 1.84f;
    // double money = 15.000000000d;
    // char foot = 'R';
    // boolean masculin = true;

    // double taille = 2.5d;
    // float alcool = (float) taille;           // on parlera de conversion explicite
    // float alcool = taille;                  // on parlera de conversion implicite (dans ce cas ce code ne marchera pas)

    // System.out.println(alcool);
    // System.out.println("Hello Word");

    Scanner sc = new Scanner(System.in);
    System.out.println("Entre un nombre: ");

    // int nombre = sc.nextInt();      // le type de la variable doit ressortir dans le next...()
    double nombre = (float) sc.nextDouble(); // on peut faire la conversion ici en sortant les entrées

    System.out.println("le nombre entré est: " + nombre);
    sc.close();
  }
}
/**
 * javac ==> (c) pour "compiler" ;
 * javac --version  ==>  nous donne la version du compiler
 *
 * javac Compil.java  ==>  nous permet de compiler en un fichier "Compil.class", inutilisable
 * après compilation, on peut afficher le contenu avec   ==>  java Compil
 *
 *il faut compiler chaque fois qu'il y a une modif avant d'exécuter le programme (quand on veut éviter le "Run")
 */
