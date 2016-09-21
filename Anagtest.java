public class Anagtest{
  public static void main(String[] args){
    String s = args[0].toLowerCase();
    char[] a = s.toCharArray();
    int n = a.length;
    int x = 0;
    int y = 0;
      int[] f = new int[256];
   for(int i=0; i<n; i++) {
        char c = a[i];
        f[c]++;
        x=f[c];
   }


    String t = args[1].toLowerCase();
    char[] b = t.toCharArray();
    int m = b.length;
      int[] g = new int[256];
   for(int i=0; i<m; i++) {
        char d = b[i];
        g[d]++;
        y=g[d];
   }
   /*for(int i=0;i<=256;i++){
     if(f[i]==g[i]) System.out.println("Input is an anagram.");
     else System.out.println("Input not an anagram.");
   }*/
   if(x==y) System.out.println("Input is an anagram.");
   else System.out.println("Input is not an anagram.");
  }
}
     

    
