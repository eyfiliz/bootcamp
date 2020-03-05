package bolum9;

import java.util.*;

class JavaLoopsII {

  public static void main(String[] argh) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    for (int i = 0; i < t; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();
      int sonuc = 0;
      for (int j = 0; j < n; j++) {
        sonuc += a;
        for (int k = 0; k <= j; k++) {
          sonuc += Math.pow(2, k) * b;
        }
        System.out.print(sonuc + " ");
        sonuc = 0;
      }
      System.out.println();
    }
    in.close();
  }
}