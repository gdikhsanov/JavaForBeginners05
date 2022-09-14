package homework;

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




    }
}
