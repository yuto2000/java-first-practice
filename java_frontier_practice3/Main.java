import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("体重を入力してください(小数点一桁,kg)");
    double weight = scan.nextDouble();

    System.out.println("身長を入力してください(小数点一桁,m)");
    double height = scan.nextDouble();

    System.out.println("体重は" + weight + "です");
    System.out.println("身長は" + height + "です");

    double bmi = weight/height/height;
    System.out.println("BMIは" + bmi + "です");

    String condition = "";

    if (bmi >= 25) {
      condition = "肥満";
    } else if (bmi >= 18.5) {
      condition = "標準";
    } else {
      condition = "低体重";
    }
    System.out.println("あなたは" + condition + "です");
  }
}
