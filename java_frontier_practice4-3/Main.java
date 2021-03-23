public class Main {
  public static void main(String[] args) {

    for (int i = 1; i<10; i++) {
      int[] result = new int[9];
      for (int k = 1; k<10; k++) {
        result[k-1] = i * k;
      }
      for (int number : result) {
        System.out.print(number);
      }
      System.out.println("");
    }
  }
}
