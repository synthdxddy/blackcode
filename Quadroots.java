public class Quadroots{
  public static void main(String[] args){
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    
    double disc = b*b - 4*a*c;
      double sq = Math.sqrt(disc);
      double root1 = (-b + disc)/2*a;
    double root2 = (-b - disc)/2*a;
    
    if(disc<0 ){
      System.err.println("The roots of this equation are complex."); 
    }else if(disc>0){
      System.out.println("The roots of this quation are real.");
    }
    
    if(a == 0){
    System.err.println("The roots of this equation are undefined as Denominator is zero.");
    }else if(a != 0) {                                         
    System.out.println("The roots for quadratic equation " + a + "x^2 + " + b +"x + " + c + " are {" + root1 + "," + root2 + "}");
  }
}
}