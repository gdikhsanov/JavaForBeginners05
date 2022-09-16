package homework;

import org.json.JSONObject;

import java.awt.*;

public class HW3 {

    public static void main(String [] args) {

        int number = 1;

        //      #2

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        byte a = -128;
        byte b = 127;

        //      #3

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        short s = -30_000;
        short t = 30_000;

        //      #4

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);
        System.out.println("****************************** \noption 1");

        int i = -2_147_483_648;
        i = 2147483647;
        String line = "-------------------------------------------";

        System.out.printf("%s\n|%-20s|%-20s|\n", line, "Int min value", "Int max value");
        System.out.printf("%s\n|%-20d|%-20d|\n%s\n", line, Integer.MIN_VALUE, Integer.MAX_VALUE, line);

        System.out.println("****************************** \noption 2");

        i = -2_147_483_648;

        System.out.printf("%s\n|%-20s|%-20d|\n", line, "Int min value", i);

        i = 2_147_483_647;

        System.out.printf("%s\n|%-20s|%-20d|\n%s\n", line, "Int max value", i, line);

        //      #5

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        long phoneNumber = 18009998877L;

        //      #6

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        float f =  100.101101F;
        double d = 100.101101;
        line = "---------------------------------------------------------------";

        System.out.printf("%s\n|%-30s|%-30f|\n", line, "float f = 100.101101", f);
        System.out.printf("%s\n|%-30s|%-30f|\n%s\n", line, "double d = 100.101101", d, line);


        //      #7
        {
        System.out.println("\n############################## \n"
                + "Task "
                + ++number);
        System.out.println("++++++++++++++++++++++++++++++ \nsubtask a)");

        Double dd = 10.09999 + 20.099999;

        System.out.println("++++++++++++++++++++++++++++++ \nsubtask b)");

        Float ff = new Float(10.09999F + 20.099999F);

        System.out.println("Sum of Double = " + dd);
        System.out.println("Sum of Float = " + ff);
        }

        //      #8

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        float ff = 1F / 3;
        double dd = 1.0 / (double) 3;

        System.out.println("Division result in float = " + ff);
        System.out.println("Division result in double = " + dd);

        //      #9

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        Float floatSum = f + ff;
        Float floatSub = f - ff;
        Float floatProduct = f * ff;
        Float floatQuotient = f / ff;
        Float floatRemainder = f % ff;

        System.out.println(floatSum);
        System.out.println(floatSub);
        System.out.println(floatProduct);
        System.out.println(floatQuotient);
        System.out.println(floatRemainder);

        //      #10

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        double doubleSum = d + dd;
        double doubleSub = d - dd;
        double doubleProduct = d * dd;
        double doubleQuotient = d / dd;
        double doubleRemainder = d % dd;

        //      #11

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        String line126 = "---------------------------------------------------------------------------------------" +
                "------------------";

        System.out.println(line126);
        System.out.printf("|%5s%-20f|%5s%-20f|%5s%-20f|%5s%-20f|\n", "f=", f, "ff=", ff, "d=", d, "dd=", dd);
        System.out.println(line126);
        System.out.println("|floatSum = "
                + floatSum
                + "\t\t\t\t\t\t\t\t|doubleSum = "
                + doubleSum + "\t\t\t\t\t\t|");
        System.out.println("|floatSub = "
                + floatSub
                + "\t\t\t\t\t\t\t\t|doubleSub = "
                + doubleSub + "\t\t\t\t\t\t|");
        System.out.println("|floatProduct = "
                + floatProduct
                + "\t\t\t\t\t\t\t|doubleProduct = "
                + doubleProduct
                + "\t\t\t\t\t|");
        System.out.println("|floatQuotient = "
                + floatQuotient
                + "\t\t\t\t\t\t\t|doubleQuotient = "
                + doubleQuotient
                + "\t\t\t\t\t\t|");
        System.out.println("|floatRemainder = "
                + floatRemainder
                + "\t\t\t\t\t\t|doubleRemainder = "
                + doubleRemainder
                + "\t\t\t\t|");
        System.out.println(line126);

        //      #12

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        System.out.println("" +
                ".   . ..... .     .     .....           .  ...  .   .  ...\n" +
                ".   . .     .     .     .   .           . .   . .   . .   .\n" +
                ".   . .     .     .     .   .           . .   . .   . .   .\n" +
                "..... ..... .     .     .   .           . ..... .   . .....\n" +
                ".   . .     .     .     .   .           . .   .  . .  .   .\n" +
                ".   . .     .     .     .   .       .   . .   .  . .  .   .\n" +
                ".   . ..... ..... ..... .....        .... .   .   .   .   .");

        //      #13

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = -1000000.001;
        Short t9 = 1010;


        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);
        System.out.println("t5 = " + t5);
        System.out.println("t6 = " + t6);
        System.out.println("t7 = " + t7);
        System.out.println("t8 = " + t8);
        System.out.println("t9 = " + t9);

        //      #14

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);


              String line14 = "---------------------------------------------------------------------------------" +
                "------------------------";

        System.out.println(line14);
        System.out.printf("|%-25s|%-25s|%-25s|%-25s|\n", "Type", "Size in bits", "min", "max");
        System.out.println(line14);
        System.out.printf("|%-25s|%-25s|%-25s|%-25s|\n", "byte", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println(line14);
        System.out.printf("|%-25s|%-25s|%-25s|%-25s|\n", "short", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println(line14);
        System.out.printf("|%-25s|%-25s|%-25s|%-25s|\n", "integer", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(line14);
        System.out.printf("|%-25s|%-25s|%-25s|%-25s|\n", "long", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(line14);
        System.out.printf("|%-25s|%-25s|%-25e|%-25f|\n", "float", Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.println(line14);
        System.out.printf("|%-25s|%-25s|%-25e|%-25e|\n", "double", Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println(line14);

        //      #15

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        Integer num1 = 12;
        Integer num2 = 12;
        System.out.println("Если num1 равно num2, то результат сравнения методом .equals() = "
                +  num1.equals(num2));

        num1 = 2;
        num2 = 22;
        System.out.println("Если num1 не равно num2, то результат сравнения методом .equals() = "
                + num1.equals(num2));

        //      #16

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);
        System.out.println("****************************** \noption 1");

        Integer number1 = 12;
        Integer number2 = 12;
        System.out.println("Если number1 = number2, то результат сравнения методом .compare() = "
                +  Integer.compare(number1, number2));

        number1 = 22;
        number2 = 12;
        System.out.println("Если number1 > number2, то результат сравнения методом .compare() = "
                +  Integer.compare(number1, number2));

        number1 = 1022;
        number2 = 4500;
        System.out.println("Если number1 < number2, то результат сравнения методом .compare() = "
                +  Integer.compare(number1, number2));

        System.out.println("****************************** \noption 2");

        number1 = 12;
        number2 = 12;
        System.out.println("Если number1 > number2, то результат сравнения методом .compareTo() = "
                +  number1.compareTo(number2));

        number1 = 22;
        number2 = 12;
        System.out.println("Если number1 > number2, то результат сравнения методом .compareTo() = "
                +  number1.compareTo(number2));

        number1 = 12;
        number2 = 22;
        System.out.println("Если number1 < number2, то результат сравнения методом .compareTo() = "
                +  number1.compareTo(number2));

        //      #17

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        Float x = 234.9999F;
        System.out.println(x.intValue());

        //      #18

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        double a18 = 10.0010;
        double b18 = 10.0010;
        System.out.println(Double.sum(a18, b18));

        //      #19

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        Float a19 = 10.0010F;
        Float b19 = 10.0010F;
        System.out.println(Integer.sum((int)a18, (int)b18));

        //      #20

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);
        System.out.println("****************************** \noption 1");

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println("12000 - 12300 = " + Short.compare(short1, short2));

        System.out.println("****************************** \noption 2");

        short1 = 12500;

        System.out.println("12500 - 12300 = " + Short.compare(short1, short2));

        //      #21

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        Double res1 = doub1-doub2;
        Double res2 = Double.sum(Double.parseDouble(str1), -Double.parseDouble(str2));

        System.out.println(doub1-doub2);
        System.out.println(Double.sum(Double.parseDouble(str1), -Double.parseDouble(str2))); // sum double
        //System.out.println(Double.compare(Double.parseDouble(str1), Double.parseDouble(str2))); // compare int -1,0,1

        System.out.println("****************************** \noption 1");

                System.out.println(Double.compare((doub1-doub2),
                Double.sum(Double.parseDouble(str1), -Double.parseDouble(str2))));

        System.out.println("****************************** \noption 2");

        System.out.println(res1.equals(res2));

        //      #22

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        System.out.println("****************************** \ncrazy option");

        float cat = Float.MAX_VALUE;
        cat = Float.MIN_VALUE;
        System.out.println((Float.MAX_VALUE + cat)/2);

        System.out.println("****************************** \nlogic option");

        float catMin = 37.5F;
        float catMax = 39.1F;

        System.out.println("Средняя температура кота = " + ((catMax + catMin) / 2) + "\u00B0C");

        //      #23

        System.out.println("\n############################## \n"
                + "Task "
                + ++number);

        Number n = Long.MAX_VALUE;
        n = 10;
        n = 10.999999999;

        //        System.out.println(n.getClass());
        System.out.println("Переменная n может принимать значения:\n"
                + "n = " + Long.MAX_VALUE
                + "\nn = 10"
                + "\nn = " + n);
    }
}
