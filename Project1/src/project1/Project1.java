
package project1;

import java.util.Scanner;

/**
 *
 * @author Fidel
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String binaryValue, decimalValue, hexValue;
        String userValue = "";
 
      Scanner scan = new Scanner(System.in);
      
      while (!userValue.equals('q'))
      {
            // Get a string from the user
            System.out.print("Enter an integer in either binary, decimal or hex.\n" +
                             "Press q to quit the program: ");
            userValue = scan.nextLine();
          
            // Check first character
            char first = userValue.charAt(0);
            
            if (first == 'q') {
                break;
            }

            // Binary
            else if (first == '%') {
               binaryValue = userValue.substring(1, userValue.length());
               decimalValue = DecimalConverter.binToDec(binaryValue);
               hexValue = DecimalConverter.decToHex(decimalValue);
            }
            // Hex 
            else if (first == '$') {
               hexValue = userValue.substring(1, userValue.length());
               decimalValue = DecimalConverter.hexToDec(hexValue);
               binaryValue = DecimalConverter.decToBin(decimalValue);
            }
            // Decimal
            else {
               decimalValue = userValue;
               binaryValue = DecimalConverter.decToBin(decimalValue);
               hexValue = DecimalConverter.decToHex(decimalValue);
            }
            
            System.out.println("%"+binaryValue+" = "+decimalValue+" = "+"$"+hexValue);
      }
   }
    
}
