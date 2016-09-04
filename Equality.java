public class Equality {
  public static void main(String[] args) { 

    int A = Integer.parseInt (args[0]);
    int B = Integer.parseInt (args[1]);
    int C = Integer.parseInt (args[2]);
     
    if((A == B) && (B == C)){
       System.out.println("All three values are equal.");
    }else{
         System.out.println("Values are not equal");
  }
}
}
