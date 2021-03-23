import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("国語の点数を入力してください");
    int pointKokugo = scan.nextInt();
    System.out.println("数学の点数を入力してください");
    int pointSugaku = scan.nextInt();
    int sum = pointKokugo + pointSugaku;
    System.out.println("合計は" + sum + "点です");
    String lank = "";
    if (sum >= 160) {
      lank = "優";
    } else if( sum >= 140) {
      lank = "良";
    } else if( pointKokugo < 40 || pointSugaku < 40) {
      lank = "追試";
    } else if(sum >= 100) {
      lank = "可";
    } else if (sum < 100) {
      lank = "追試";
    }
    System.out.println("あなたの成績は" + lank + "です");
  }
}
