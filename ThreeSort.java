public class ThreeSort {
	public static void main(String[] args){
	
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
	
	int lowest = Math.min(a, Math.min(b,c));
	int largest = Math.max(a, Math.max(b,c));
	int middle = (a+b+c) - lowest - largest; 

	System.out.println("Arranging all values in ascending order:" + lowest + "," + middle +"," + largest +".");
	
	}
}