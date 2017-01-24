
package project1;

/**
 *
 * @author Fidel
 */
public class DecimalConverter {

   // Take a binary value, return its decimal value
   public static String binToDec(String binaryValue) {
      int result = 0;

      for (int i = 0; i < binaryValue.length(); i++) {
         char ch = binaryValue.charAt(i);
         result += (ch - '0') * Math.pow(2, binaryValue.length() - 1 - i);
      }  

      return ""+result;
   }

   // Take a hex value, return its decimal value
   public static String hexToDec(String hexValue) {
      int result = 0;

      for (int i = 0; i < hexValue.length(); i++) {
         char ch = Character.toUpperCase(hexValue.charAt(i));
         if (ch > 64)
            result += (ch - '0' - 7) * Math.pow(16, hexValue.length() - 1 - i);
         else
            result += (ch - '0') * Math.pow(16, hexValue.length() - 1 - i); 
      }  

      return ""+result;
   }

   // Take a decimal value, return its binary value
   public static String decToBin(String decimalValue) {
      int valueAsNum = Integer.parseInt(decimalValue);
 
      int quotient, remainder;
      String result = "";

      do {
            quotient = valueAsNum / 2;
            remainder = valueAsNum % 2;
            valueAsNum = quotient;
            result = Integer.toString(remainder) + result;
      } while (quotient != 0);
 
      return result;
   }

   // Take a decimal value, return its hex value
   public static String decToHex(String hexValue) {
      int valueAsNum = Integer.parseInt(hexValue);
 
      int quotient, remainder;
      String result = "";

      do {
            quotient = valueAsNum / 16;
            remainder = valueAsNum % 16;
            valueAsNum = quotient;
            if (remainder > 9)
            {
                result = (char)(remainder + '0' + 7) + result; 
            }
            else
                result = Integer.toString(remainder) + result;  
            
      } while (quotient != 0);
      
     return result;
   }
}
