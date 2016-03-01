/*
 * Purpose: Java application that can convert decimals into a floating point 
 * representation
 * Collin Hargest
 * 2/16/2016
 * csc 205
 */
package floatpointconverter;



public class FloatPointConverter {
   final int BIT = 23;
   final int DBIT =52;
   int exponent = 0;
   
   String binExponent;
   protected String signBit;
   protected String[] decHold;
   protected String mantissa = "";
   protected String bin = "";
   
   
    public FloatPointConverter(){}
    
   
    
    //-------------------------------------------------------------------------
    public String DecToBinSingle(String num){
    String decString = num;
    String binString;
    int binaryNum;
    float deciNum; 
    
    if(decString.indexOf("-") == 0){
           signBit = "1";
           decString = decString.substring (1,decString.length());
                   }
       else{
           signBit = "0";
           
       }
    
      deciNum = Float.parseFloat(decString);
      binaryNum = Float.floatToIntBits(deciNum);
      
       if (deciNum < 2){
        binString = signBit + "0" + Integer.toBinaryString(binaryNum);
          
          
      }
      else{
      binString = signBit +  Integer.toBinaryString(binaryNum);
       }
      
      
   
      if(binString.length()== 2){
      binString = "00000000000000000000000000000000";
      }
     
      while (binString.length() < 32){
          binString = binString + "0";
          }
          
      return(binString);
    }
    
    
    public String DecToBinDouble(String num){
    String decString = num;
    String binString;
    long binaryNum;
    double deciNum; 
    
    if(decString.indexOf("-") == 0){
           signBit = "1";
           decString = decString.substring (1,decString.length());
                   }
       else{
           signBit = "0";
       }
    
      deciNum = Double.parseDouble(decString);
      binaryNum = Double.doubleToLongBits(deciNum);
      if (deciNum < 2){
        binString = signBit + "0" + Long.toBinaryString(binaryNum);
          
          
      }
      else{
      binString = signBit +  Long.toBinaryString(binaryNum);
       }
      
     
      
       if(binString.length()== 2){
      binString = "00000000000000000000000000000000";
      }
     
      while (binString.length() < 64){
          binString = binString + "0";
          }
          
      return(binString.substring(0,64));
    }
    
    //--------------------------------------------------------------------------
   
    
     
    
    public String BinToDecConvertDouble( String num){
           double whole = 0;
           double part = 0;
           
           
           String decimal;
           bin = num;
           String[] mantissaHold = new String[DBIT];
           decHold = new String [3];
           decHold[0] = bin.substring(0,1);
           decHold[1] = bin.substring(1,12);
          
           
           decHold[2] = "1" + bin.substring(12,64);
           
           
           
           exponent = Integer.parseInt(decHold[1], 2) - 1023;
           
           
           
            
              
           
           
           
           
           
           decHold[1] = decHold[2].substring(0,exponent+1);
           
           decHold[2] = decHold[2].substring(exponent+1, 52);
           
          if(decHold[1].contains("1") == false){
              whole = 0;
              part = 0.00;
          }
         
           
           
           else{
               
              whole = Integer.parseInt(decHold[1], 2);
              
              
           }
           
           
           
           mantissaHold = decHold[2].split("");
           
           
           for(int i = 0; i < decHold[2].length()-1; i++){
              if( mantissaHold[i].contains("1") == true){
                  part =part + Math.pow(2,(-(i+1)));
              }
           }
           
           if((Integer.parseInt(decHold[0])== 1)){ 
           whole = -(Integer.parseInt(decHold[0]))*(whole + part);
           }
           else{
                  whole = whole + part; 
                   }
          
            decimal = Double.toString(whole);
           
           
           
           return(decimal);
           
       }
    
       public String BinToDecConvertSingle(String num){
          
           double whole = 0;
           double part = 0;
           
           
           String decimal;
           bin = num;
           String[] mantissaHold = new String[BIT];
           decHold = new String [3];
           decHold[0] = bin.substring(0,1);
           
           decHold[1] = bin.substring(1,9);
          
           decHold[2] = "1" + bin.substring(9,32);
           
           exponent = Integer.parseInt(decHold[1], 2)- 127 ;
           
           
           
           
           decHold[1] = decHold[2].substring(0,exponent+1);
           
           decHold[2] = decHold[2].substring(exponent+1, 23);
           
          if(decHold[1].contains("1") == false){
              whole = 0;
          }
           
           
           else{
               
              whole = Integer.parseInt(decHold[1], 2);
              
              
           }
           
           
           
           mantissaHold = decHold[2].split("");
           
           
           for(int i = 0; i < decHold[2].length()-1; i++){
              if( mantissaHold[i].contains("1") == true){
                  part =part + Math.pow(2,(-(i+1)));
              }
           }
           
           if((Integer.parseInt(decHold[0])== 1)){ 
           whole = -(Integer.parseInt(decHold[0]))*(whole + part);
           }
           else{
                  whole = whole + part; 
                   }
          
            decimal = Double.toString(whole);
           
          
           return(decimal);
           
       }
    

       
    }
    

