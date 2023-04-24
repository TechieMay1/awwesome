import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This program can do multiple conversions");

        System.out.println("To start, enter y");
        
        Scanner scanner = new Scanner(System.in);
            String userContinue = scanner.nextLine();
        
            while (true) {
                System.out.println("1 for Fahrenheit to Celsius, 2 for pounds to ounces, 3 for feet to miles, 4 for centimeters to kilometers, a5 for kilograms to stones. stop program, enter -1");
                int i = scanner.nextInt();
                float num;
                float numCon; 
               
                if (i == 1) {
                    System.out.println("Fahrenheit value you would like to convert to Celsius.");
                    num = scanner.nextInt();
                    numCon = (num - 32) * 5/9;
                    System.out.println(num + " degrees Fahrenheit in Celsius is " + numCon);
                }
                else if (i == 2) {
                    System.out.println("Pound value you would like to convert to ounces.");
                    num = scanner.nextInt();
                    numCon = num * 16;
                    System.out.println(num + " pounds in ounces is " + numCon);
                }
                else if (i == 3) {
                    System.out.println("Feet value you would like to convert to miles.");
                    num = scanner.nextInt();
                    numCon = num / 5280;
                    System.out.println(num + " feet in miles is " + numCon);
                }
                else if (i == 4) {
                    System.out.println("Centimeter value you would like to convert to kilometers.");
                    num = scanner.nextInt();
                    numCon = num / 100000;
                    System.out.println(num + " centimeters in kilometers is " + numCon);
                }
                else if (i == 5) {
                    System.out.println("Kilogram value you would like to convert to stones.");
                    num = scanner.nextInt();
                    numCon = num / (float)6.35;
                    System.out.println(num + " kilograms in stones is " + numCon);
                }
                else if (i == -1) {
                    break;
                }
                else {
                    System.out.println("Enter in the proper range.");
                }
                System.out.println("Enter y to convert another value, enter -1 to quit.");
                userContinue = scanner.next();
                if (userContinue.equals("-1")) {
                    break;
                }
                
            }
            
        
           
        }
    }

