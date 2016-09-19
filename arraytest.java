public class arraytest{
  public static void main(String[] args){
    
    int N = args.length;
    int[] a = new int[N];
    for(int i=0; i<N; i++){
      a[i] = Integer.parseInt(args[i]);
      if(a[i]%2==0){
        System.out.println(a[i]);
      }
    
    }
  }
}
    
    