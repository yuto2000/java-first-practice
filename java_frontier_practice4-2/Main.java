import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int result = 1;
    int number = 2;

    for (int i = 1; i<9; i++) {
      result = result * number;
      System.out.println("2の" + i + "乗は" + result + "です");
    }
  }
}
