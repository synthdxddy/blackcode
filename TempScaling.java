public class TempScaling {
	public static void main(String[] args) {

	double T = Double.parseDouble (args[0]);
	
	double F = (9/5)*T + 32;
	double K = T + 273; 

System.out.println();
	System.out.println("Welcome to our daily temperature report.");
System.out.println();

	if(T < 26){
	System.out.println("It's fairly cold today.");
	
	}else if(T > 26 && T < 34 ){
	System.out.println("Temperature is moderate today.");
	
	}else if(T>33){
	System.out.println("It is sunny and hot today.");
}

	System.out.println();
	System.out.println("According to your input, Temperature has been defined to be " + "'" + T + "'" + " degrees on celcius scale.");
	System.out.println();

	System.out.println("Temperature in terms of Farenheit is " + "'"  + F + "F'" + " degrees.");
	System.out.println();

	System.out.println("Temperature recorded on Kelvin scale is " + "'" + K + "'" +" Kelvin.");
	}
}