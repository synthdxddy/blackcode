public class FivePerLine {
  public static void main(String[] args) {
    int Start = 1000;
    int Finish = 2000;
    int Each_Line = 5;
    for (int i = Start; i <= Finish; i++) {
      System.out.print(i + "-->");
       if ((i + 1) % Each_Line == 0) System.out.println();
    }
    System.out.println();
  }
}