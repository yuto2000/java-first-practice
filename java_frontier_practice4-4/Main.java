public class Main {
  public static void main(String[] args) {
    int baseNum = 5;
    int firstNum;
    int lastNum;

    for (int i = 0; i<9; i++) {

      if (i <= 4) {
        firstNum = baseNum - i;
        lastNum = baseNum + i;
      } else {
        firstNum = i - baseNum + 2;
        lastNum = 13 - i;
      }

      for (int k = 1; k<10; k++) {
        if (k >= firstNum && k <= lastNum) {
          System.out.print("■ ");
        } else {
          System.out.print("□ ");
        }
      }
      System.out.println("");
    }
  }
}
