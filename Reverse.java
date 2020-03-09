package hackerRank;

import java.io.*;
import java.util.*;

public class Reverse {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    boolean reverse = true;

    for (int i = 0, j = A.length() - 1; i < A.length() / 2; i++, j--) {
      if (A.charAt(i) != A.charAt(j)) {
        reverse = false;
        break;
      }
    }
    if (reverse) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

