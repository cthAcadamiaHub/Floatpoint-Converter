
package floatpointconverter;

public class FloatAssignment {

    public static void main(String[] args) {
        
        
        FloatPointConverter FloatConverter = new FloatPointConverter();
        String d;
       
        
         System.out.println("Single:");
         d =  FloatConverter.DecToBinSingle("1");
         System.out.println(d);
         d =  FloatConverter.DecToBinSingle("0.5");
         System.out.println(d);
         d =  FloatConverter.DecToBinSingle("19.5");
         System.out.println(d);
         d =  FloatConverter.DecToBinSingle("-3.75");
         System.out.println(d);
         d =  FloatConverter.DecToBinSingle("0");
         System.out.println(d);
         
         
       
         
         System.out.println("Double:");
         d =  FloatConverter.DecToBinDouble("1");
         System.out.println(d);
         d =  FloatConverter.DecToBinDouble("0.5");
         System.out.println(d);
         d =  FloatConverter.DecToBinDouble("19.5");
         System.out.println(d);
         d =  FloatConverter.DecToBinDouble("-3.75");
         System.out.println(d);
         d =  FloatConverter.DecToBinDouble("0");
         System.out.println(d);
      
        
        
        
         System.out.println("\n\n\n\n dec converter");
         
        System.out.println("Single conversions to dec");
        d = FloatConverter.BinToDecConvertSingle(
                 "00111111100000000000000000000000");
         System.out.println(d);
        d = FloatConverter.BinToDecConvertSingle(
                "00111111000000000000000000000000");
         System.out.println(d);
          d = FloatConverter.BinToDecConvertSingle(
                  "01000001100111000000000000000000");
         System.out.println(d);
        d = FloatConverter.BinToDecConvertSingle(
                "11000000011100000000000000000000");
        System.out.println(d);
        
        //d = FloatConverter.BinToDecConvertSingle(
        //        "00000000000000000000000000000000");
        //System.out.println(d);
        
        
         
        System.out.println("Double Converts");
         
         d = FloatConverter.BinToDecConvertDouble("0011111111110"
                 + "000000000000000000000000000000000000000000000000000");
         System.out.println(d);
         
         d = FloatConverter.BinToDecConvertDouble("001111111110"
                 +"0000000000000000000000000000000000000000000000000000");
         System.out.println(d);
         
         d = FloatConverter.BinToDecConvertDouble("0100000000110"
                 + "011100000000000000000000000000000000000000000000000");
         System.out.println(d);
         d = FloatConverter.BinToDecConvertDouble("1100000000001"
                 + "110000000000000000000000000000000000000000000000000");
         System.out.println(d);
         
        //d = FloatConverter.BinToDecConvertDouble("00000000000000"
        //        + "00000000000000000000000000000000000000000000000000");
        // System.out.println(d);
         
        
         
         
        
         
        
    }
    
}
