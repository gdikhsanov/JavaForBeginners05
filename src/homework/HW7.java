package homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class HW7 {

    public static void taskNumber(int task) {
        System.out.println("\n*********************\nTask # " + task + "\n");
    }

    //21
     public static void printEven(int l) {

        int[] numbers = new int[l];


        for (int i = 0; i < l; i++) {
             numbers[i] = (int)(Math.random() * 7);
         }

         System.out.print(Arrays.toString(numbers));

     }

     //22
    public static void printAerage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(/*Math.round*/(sum / (double)arr.length));
    }

     //25
    public static void checkArr(int[] arr, int number) {

        int maybe = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number + 1 || arr[i] == number - 1 ) {
                System.out.println("maybe");
                maybe += 1;
            }
            if (arr[i] == number) {
                System.out.println("yes");
                return;
            }
            if (i == arr.length - 1 && maybe == 0) {
                System.out.println("no");
            }
        }
    }

    public static void main(String[] args) {

        taskNumber(3);

        String[] catsNames = {"q" ,"w" ,"e" ,"r" ,"t" ,"y", "u"};

        taskNumber(4);

        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";

        taskNumber(5);

        String[] catsColors = {"red", "black", "white", "grey", "brown", "grey", "white"};

        taskNumber(6);

        int[] catsAges = {2, 1, 3, 15, 8, 3, 18};

        taskNumber(7);

        boolean[] isCatRed = {true, false, false, false, false, false, false};

        taskNumber(8);

        System.out.println(catsNames[6]);
        System.out.println(catsNames[0] + catsNames[2] + catsNames[4] + catsNames[6]);
        System.out.println(catsNames[4]);
        System.out.println(catsColors[1] + catsColors[3] + catsColors[5]);
        System.out.println(catsColors[3] + catsColors[5]);

        taskNumber(9);

        for (String c: catsColors
             ) {
            if (c.equalsIgnoreCase("grey")) {
                System.out.println("Накорми кота!");
            }
        }

        taskNumber(10);

        for (boolean c: isCatRed
        ) {
            if (c == true) {
                System.out.println("Дай коту воды!");
            }
        }
        
        taskNumber(11);

        for (int c: catsAges
             ) {
            if (c < 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }

        taskNumber(12);

        System.out.printf("%s %s %d",
                catsNames[catsNames.length -1],
                catsNames[catsColors.length -1],
                catsAges[catsNames.length -1]);

        taskNumber(13);

        System.out.printf("%s %s %d \n%s %s %d",
                catsNames[catsNames.length / 2],
                catsColors[catsColors.length / 2],
                catsAges[catsAges.length / 2],

                catsNames[catsNames.length / 2 + 1],
                catsColors[catsColors.length / 2 +1],
                catsAges[catsAges.length / 2 + 1]);

        taskNumber(14);

        for (int i = 0; i < catsNames.length; i++) {
            if (catsAges[i] > 2) {
                System.out.print(catsNames[i] + " ");
            }
        }

        taskNumber(15);

        for (int i = 0; i < catsNames.length; i++) {
            if (isCatRed[i] == true) {
                System.out.print("Накорми " + catsNames[i] + "! ");
            }
        }

        taskNumber(16);

        int sumAge = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sumAge += catsAges[i];
        }
        System.out.println(/*Math.round*/(sumAge / (double)catsAges.length));

        taskNumber(17);

        int min = catsAges[0];
        for (int i = 1; i < catsAges.length; i++) {
            if (catsAges[i] < min) {
                min = catsAges[i];
            }
        }
        System.out.println(min);

        taskNumber(18);

        int max = catsAges[0];
        for (int i = 1; i < catsAges.length; i++) {
            if (catsAges[i] > max) {
                max = catsAges[i];
            }
        }
        System.out.println(max);

        taskNumber(19);

        int grey = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equalsIgnoreCase("grey")) {
                grey += 1;
            }
        }
        System.out.println("Серых" + grey);


        int red = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equalsIgnoreCase("red")) {
                red += 1;
            }
        }
        System.out.println("Рыжих " + red);

        taskNumber(20);

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 !=0 && catsAges[i] < 2) {
                System.out.println(catsNames[i]);
            }
        }

        taskNumber(21);

        printEven(9);

        taskNumber(22);

        printAerage(catsAges);

        taskNumber(23);

        int[] odd = new int[50];
        int j = 0;

        for (int i = -1000; i < -900; i++) {
            if (i % 2 != 0) {
                odd[j] = i;
                j += 1;
            }
        }
        System.out.println(Arrays.toString(odd));

        taskNumber(24);

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = (int)(Math.random() * 101)  + 100;
        }

        System.out.print(Arrays.toString(numbers));

        taskNumber(25);

        checkArr(new int[]{1,2,1,4,5,2,6,4,1,2,1,4,3,5,3,2,8,4}, 3);

        taskNumber(26);
        //numbers array from task 24

        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount += 1;
            }
        }

        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[numbers.length - evenCount];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[evenIndex] = numbers[i];
                evenIndex += 1;
            }
            else {
                oddNumbers[oddIndex] = numbers[i];
                oddIndex += 1;
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));

        taskNumber(27);

        Object[][] cats = new Object[][]{{"Мурзик", 2, "Grey"}, {"Черныш", 3, "Black"}, {"Мурка", 4, "Grey"},
                {"Васька", 1, "Brown"}};


    }
}
