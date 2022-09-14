package homework;

public class HW3 {

    public static void main(String [] args) {

        int number = 1;

//      #2

        System.out.println("############################## \n"
                + "Task "
                + ++number);

        byte a = -128;
        byte b = 127;

//      #3

        System.out.println("############################## \n"
                + "Task "
                + ++number);

        short s = -30_000;
        short t = 30_000;

//      #4

        System.out.println("############################## \n"
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

        System.out.println("############################## \n"
                + "Task "
                + ++number);
       
        

    }
}
