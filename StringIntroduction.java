package hackerRank;

import java.io.*;
import java.util.*;

public class StringIntroduction {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();

    int sum = A.length() + B.length();
    System.out.println(sum);

    String isGreater = A.compareTo(B) > 0 ? "Yes" : "No";
    System.out.println(isGreater);

    String capitalisedA = A.substring(0,1).toUpperCase() + A.substring(1);
    String capitalisedB = B.substring(0,1).toUpperCase() + B.substring(1);
    System.out.println(capitalisedA + " " + capitalisedB);
  }
}
