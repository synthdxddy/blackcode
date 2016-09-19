public class reverseorder{
  public static void main(String[] args){
    double[] a = {0.5,1.2,6.0,5.4};
    int N = a.length;
    for(int i=0; i<(N/2); i++){
      double x = a[i];
      a[i]= a[N-i-1];
      a[N -i-1] = x;
    }
    for( int i=0; i<N; i++){
      System.out.println(a[i]);
    }
  }
}
    
    