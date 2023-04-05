/* (5) a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.*/
class Boolean_casting{
    public static void main(String[]args){
    boolean flag=false;
    String str=Boolean.toString(flag);
    System.out.println( str);
    System.out.println("boolean value into Boolean instance :" + Boolean.valueOf(flag));

     String str2="true";
     boolean b= Boolean.parseBoolean(str2);
     System.out.println(b);
      System.out.println("String value into boolean instance :" +Boolean.valueOf(str2));
    }
}
/* ite a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.*/


class Byte_casting{
   public static void main(String[]args){
    byte a=124;
    String str=Byte.toString(a);
    System.out.println( "byte value into String :" +str);
    System.out.println("byte value into Byte instance :" +Byte.valueOf(a));
  
  String str1="123";
  byte b=Byte.parseByte(str1);
  System.out.println(b);
  System.out.println(" String instance into Byte instance :" +Byte.valueOf(str1));
   
   }
}
/*Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance */


class Short_casting{
  public static void main (String[]args){
    short a=2;
    String str=Short.toString(a);
    System.out.println( "short value into String :" +str);
    System.out.println("short value into Short instance:" +Short.valueOf(a));

     String str1="123";
     System.out.println("String instance into Short instance :"+Short.valueOf(str1));
    
    
  }
}
/*a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string */

class int_casting{
  public static void main (String[]args){
  int a=12;
  String str=Integer.toString(a);
  System.out.println(" int value into String:" +str);
  System.out.println("int value into Integer instance :" +Integer.valueOf(a));


  String str1="123";
   System.out.println(" String instance into Integer instance :" +Integer.valueOf(str1));
   System.out.println(" int value into binary :"+Integer.toBinaryString(a));
   System.out.println("int value into hexadecimal :"+Integer.toHexString(a));
   System.out.println("int value into octal :"+Integer.toOctalString(a));
}
}

/*a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.
 */

class long_casting{
  public static void main(String[]args){
    long a=12345L;
    String str=Long.toString(a);
     System.out.println("long value into String :" +str);
     System.out.println("String instance into Long instance :"+Long.valueOf(a));
     System.out.println("long value into binary " +Long.toBinaryString(a));
     System.out.println("long value into octal :" +Long.toOctalString(a));
     System.out.println("long value into hexadecimal :" +Long.toHexdecimalString(a));

    

  }
}
/*Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string. */
  

  class float_casting{
    public static void main(String[]args){
    float a=20.0f;
    String str= Float.toString(a);
    System.out.println("float value into String :" +str);
    System.out.println("float value into Float instance" +Float.valueOf(a));

    String str1= "231.0";
   
    System.out.println( "String instance into Float instance :" +Float.valueOf(str1));
    System.out.println("float value into hexadecimal string :" +Float.toHexdecimalString(a));
  }

  }

  /*a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal  */

class double_casting{
  public static void main(String[]args){
  float a=112.0923f;
  String str= Float.toString(a);
  System.out.println("double value into String" +str);
  System.out.println("double value into Double instance" +Float.valueOf(a));
 System.out.println("  double value into binary :" +Double.toBinaryString(a));
 System.out.println(" double value into octal :"+Double.toOctalString(a));
 System.out.println(" double value into hexadecimal :"+Double.toHexString(a));
}
}
