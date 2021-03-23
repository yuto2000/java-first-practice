import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("数字を入力してください");
    int number = scan.nextInt();

    int judgeNumber = (int)Math.signum(number);
    String judgment = "";

    if(judgeNumber == 1 && number%2 == 0) {
      judgment = "正の偶数";
    } else if (judgeNumber == 1 && number%2 == 1) {
      judgment = "正の奇数";
    } else if (judgeNumber == -1 && number%2 == 0) {
      judgment = "負の偶数";
    } else if (judgeNumber == -1 && number%2 == -1) {
      judgment = "負の奇数";
    } else if (judgeNumber == 0) {
      judgment = "0";
    }
    System.out.println(judgment + "です");
  }
}
