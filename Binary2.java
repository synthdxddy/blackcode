public class Binary2{
  public static void main(String[] args){
  
    int i= Integer.parseInt(args[0]);
    String f ="";
    long n = i;
    long v;
    
    while(n>0) {
      if (n%2==0)
        f = "0" + f;
        else f = "1" + f;
        n= n/2;
    }
    System.out.print(f);
          
  
  }
}
        
        
    
       
      
   