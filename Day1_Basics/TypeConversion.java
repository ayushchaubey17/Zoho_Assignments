//Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short

public class TypeConversion {
    public static void main(String[] args) {

//      conversion of byte to other datatypes
        byte b = 23;
            short shortValueOfB = b;
            int intValueOfB = b;
            float floatValueOfB = b;
            long longValueOfB = b;
            double doubleValueOfB = b;


//       conversion of short to other datatypes
         short s = 68;
                byte byteValueOfS = (byte) s;
                int intValueOfS = s;
                float floatValueOfS = s;
                long longValueOfS = s;
                double doubleValueOfS = s;

//       conversion of int to other datatypes
        int i = 100;
                byte byteValueOfI = (byte) i;
                short shortValueOfI = (short) i;
                float floatValueOfI = i;
                double doubleValueOfI = i;
                long longValueOfI = i;

//       conversion of float to other datatypes
             float f = 23.45f;
                    short shortValueOfF =(short) f;
                    byte byteValueOfF = (byte) f;
                    int intValueOfF = (int) f;
                    double doubleValueOfF = f;
                    long longValueOfF =(long) f;

//       conversion of double to other datatypes
            double d = 23.45d;
                    short shortValueOfD = (short) d;
                    byte byteValueOfD = (byte) d;
                    int intValueOfD = (int) d;
                    float floatValueOfD = (float) d;
                    long longValueOfD =(long) d;


//       conversion of long to other datatypes
        long l = 233242;
                short shortValueOfL = (short) l;
                byte byteValueOfL = (byte) l;
                int intValueOfL = (int) l;
                float floatValueOfL = (float) l;
                double longValueOfL = d;


//        conversion of char to other datatypes
      char c ='a';
              byte byteValueOfChar =(byte) c;
              short shortValueOfChar = (short) c;
               int intValueOfChar = c;
               float floatValueOfChar = c;
            long longValueOfChar = c;
              double doubleValueOfChar = c;


        System.out.println(doubleValueOfChar);

    }
}
