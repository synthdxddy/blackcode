/* This program has been made after learning:
 * how to take keyboard inputs in java, 
 * how to use a while loop for taking multiple continuous inputs. 
 * how to use a swtich case */
 import java.util.Scanner; 
  public class Temp {
    public static void main(String[] args) {
      
      System.out.println("Welcome to our daily temperature report.");
 
 Scanner in=new Scanner (System.in);
 
 char choice = 'y';
      while(choice != 'n'){

 System.out.print("\n" + "Please enter the Temperature: ");
 double T = in.nextDouble();
 System.out.print("Enter 'f' for Fahrenheit, 'f' for Celsius or 'k' for Kelvin.");
 char Temperature_Scale = in.next().charAt(0);
 
 switch (Temperature_Scale){
 case 'f':
double F1, C1, K1;
  F1 = T;
  C1 = (5*(T - 32)/9);
  K1 = (5*(T - 32)/9 + 273.15);
 if(C1 < 26){
 System.out.println("It's fairly cold today.");
 
 }else if(C1 > 26 && C1 < 34 ){
 System.out.println("Temperature is moderate today.");
 
 }else if(C1 > 33){
 System.out.println("It is sunny and hot today.");
 }
 System.out.println("\n" + "According to your input, Temperature is " + "'" + C1 + "'" + " degrees on celsius scale. " );
 System.out.println( "Temperature in terms of Farhenheit is " + "'"  + F1 + "F'" + " degrees.");
 System.out.println("Temperature recorded on Kelvin scale is " + "'" + K1 + "'" +" Kelvin." + "\n");

 break;
 
 case 'c':

  C1 = T;
  F1 = (9/5)*T + 32;
  K1 = T + 273.15;
  if(C1 < 26){
 System.out.println("It's fairly cold today.");
 
 }else if(C1 > 26 && C1 < 34 ){
 System.out.println("Temperature is moderate today.");
 
 }else if(C1 > 33){
 System.out.println("It is sunny and hot today.");

 }                  
 System.out.println( "\n" + "According to your input, Temperature is " + "'" + C1 + "'" + " degrees on celsius scale." );
 System.out.println( "Temperature in terms of Farhenheit is " + "'"  + F1 + "F'" + " degrees.");
 System.out.println( "Temperature recorded on Kelvin scale is " + "'" + K1 + "'" +" Kelvin." + "\n");
 break;
 
 case 'k':
  K1 = T;
  C1 = (T - 273.15);
  F1 = (9*(T - 273.15)/5 + 32); 
  
  if(C1 < 26){
 System.out.println("It's fairly cold today.");
 
 }else if(C1 > 26 && C1 < 34 ){
 System.out.println("Temperature is moderate today.");
 
 }else if(C1 > 33){
 System.out.println("It is sunny and hot today." + "\n" );
 }
 
 System.out.println("\n" +  "According to your input, Temperature is " + "'" + C1 + "'" + " degrees on celsius scale. ");
 System.out.println("Temperature in terms of Farhenheit is " + "'"  + F1 + "F'" + " degrees.");
 System.out.println("Temperature recorded on Kelvin scale is " + "'" + K1 + "'" +" Kelvin." + "\n");
 break;
 
}
 System.out.println("Do you want to continue 'y/n'");
          choice=in.next().charAt(0);
      }
 }
}
