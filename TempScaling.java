public class TempScaling {
	public static void main(String[] args) {

	double T = Double.parseDouble (args[0]);

	char c, f, k;
	if(args[1]=="c") {
	double	C = T;
	double	F = (9/5)*T + 32;
	double	K = T + 273; 
	}
	else if(args[1]=="f") {
	double	F = T;
	double	C = (5*(T - 32)/9);
	double	K = (5*(T - 32)/9 + 273);
	}
	else if( args[1]=="k") {
	double	K = T;
	double	C = (T - 273);
	double	F = (9*(T - 273)/5 + 32);
	}

System.out.println();
	System.out.println("Welcome to our daily temperature report.");
System.out.println();

	if(C < 26){
	System.out.println("It's fairly cold today.");
	
	}else if(C > 26 && C < 34 ){
	System.out.println("Temperature is moderate today.");
	
	}else if(C > 33){
	System.out.println("It is sunny and hot today.");
}

	System.out.println();
	System.out.println("According to your input, Temperature has been defined to be " + "'" + C + "'" + " degrees on celcius scale.");
	System.out.println();

	System.out.println("Temperature in terms of Farenheit is " + "'"  + F + "F'" + " degrees.");
	System.out.println();

	System.out.println("Temperature recorded on Kelvin scale is " + "'" + K + "'" +" Kelvin.");
	}
}
