import java.util.Scanner;
public class tempconvert {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char choice;
        do{
            System.out.println("Enter the temperature in degree celsius:");
            float celsius = scanner.nextFloat();
            float fahrenheit = (celsius*1.8f)+32;
            System.out.println("Temperature(Celsius)="+celsius+"\t\t\t"+"Temperature(Fahrenheit)="+fahrenheit); 
            System.out.println("Do you wish to continue(y/n)?");
            choice = scanner.next().charAt(0);
        }while(choice =='y'|| choice == 'Y');     
    }
}