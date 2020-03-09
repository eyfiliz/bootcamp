package hackerRank;

import java.util.Scanner;

public class Anagrams {

  static boolean isAnagram(String a, String b) {
    int sayacA = 0;
    int sayacB = 0;

    if (a == null) {
      return false;
    }
    if (b == null) {
      return false;
    }
    if (a.length() != b.length()) {
      return false;
    }

    for (char ch = 'a', ch2 = 'A'; ch < 'z'; ch++, ch2++) {

      for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) == ch || a.charAt(i) == ch2) {
          sayacA++;
        }
        if (b.charAt(i) == ch || b.charAt(i) == ch2) {
          sayacB++;
        }
      }
      if (sayacA != sayacB) {
        return false;
      }
      sayacA = 0;
      sayacB = 0;
    }
    return true;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }
}