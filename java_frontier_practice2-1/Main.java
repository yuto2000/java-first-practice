import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("数字を入力してください");
    int number = scan.nextInt();
    String judgment = "";
    if (number%2 == 0) {
      judgment = "偶数";
    } else {
      judgment = "奇数";
    }
    System.out.println("数字は" + judgment + "です");
  }
}
