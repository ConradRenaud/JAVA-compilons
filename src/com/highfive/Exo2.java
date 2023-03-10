package com.highfive;

public class Exo2 {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    // int n = 5;
    int factorial = 1;

    for (int i = 1; i <= n; ++i) {
      factorial *= i;
    }
    System.out.println(factorial);
    // System.out.println("voila " + n);
  }
}
