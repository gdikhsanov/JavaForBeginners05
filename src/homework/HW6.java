package homework;

import PublicClasses.ConsoleColors;

import java.util.Locale;

public class HW6 {

    public static void taskNumber(int task) {
        System.out.println("\n*********************\nTask # " + task + "\n");
    }

    //10
    public static void seqenceNum(int start, int end, int step) {

        for (int i = start; i <= end; i += step) {
            System.out.print(i + " ");
            if (i == end) {
                System.out.println();
                return;
            }
        }
    }

    //11
    public static void seqenceChar(char n, char m) {

        for (int i = n; i <= m; i++) {
            System.out.print((char) i + " ");
        }
    }

    //12
    public static void vowels(int l) {
//
//        for(int i = 0; l < 0; i += 2, l--){ // ааааааааааааа круто - несколько условий через запятую.
//            System.out.println(i);
//        }

        if (l > 0) {
            for (int i = 0; i <= (l * 2) - 1; i++) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
            }
        } else {
            for (int i = 0; i >= (l * 2) + 1; i--) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
            }
        }
    }

//13

    public static void power(int l) {

        for (int i = 1; i <= l; i++) {
            System.out.print(Math.round(Math.pow(2, i)) + " ");
        }
    }

//14 //0123456789 00 11 22 33 44 55 66 77 88 99 000

    public static void seqence() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(String.valueOf(j).repeat(i) + " ");
            }
            System.out.println();
        }
    }

//15

    public static void seqence0To5() {

        System.out.print("0,");
        for (int i = 1; i < 6; i++) {
            System.out.print(i + "," + -i + ",");
        }
    }

//17

    public static void NMLOdd(int n, int m, int l) { //если l > 0 а шаг = 0 выводить l раз n, если оно нечетное?

        int counter = 0;

        if (l > 0 && m > 0) {
            for (int i = n; i <= n + l * m + 2 * m; i += m) { // <= верх. граница итераций = нижн. граница + шаг * длину последовательности
                if (Math.abs(i) % 2 == 1 && counter < l) {   // + что-то по условию, если надо, ПОКА счетчик < длины последовательности
                    System.out.print(i + " ");
                    counter++;
                }
            }
        }
    }

//18

    public static void NMLRandom(int n, int m, int l) {     //////////////// доделать условие для  -3  -10

        if (l > 0) {
            for (int i = 1; i <= l; i++) {
                System.out.print(n + (int) (Math.random() * (m - n + 1)) + ", ");
            }
        }
    }
    // ниж граница + (инт)(рандом * разницу верх и ниж границы + 1)

//19

    public static void yN(int n) {

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.printf(Locale.ENGLISH, "%.2f  ", (Math.pow(i, 2) + 1) / (2 * i - 1));
            }
        } else {
            System.out.println(0);
        }
    }

//20

    public static void y1Y2(int n) {

        int nMin2 = 1;
        int nMin1 = 2;
        int nCurrent;


        if (n >= 3) {
            System.out.print(nMin2 + ", " + nMin1 + ", ");

            for (int i = 3; i <= n; i++) {
                nCurrent = (2 * nMin1 + nMin2);
                System.out.printf("%d, ", nCurrent);

                nMin2 = nMin1;
                nMin1 = nCurrent;
            }
        }
        else {
            System.out.println("n should be > 2");
        }
    }

//21

    public static void twoDigits() {

        for (int i = 10; i < 99; i++) {
            if (Math.abs((i / 10) - (i % 10)) <= 3) {
                System.out.print(i + " ");
            }
        }

    }

//22

    public static double peaceEquation(double x) {

        if (x > 1.5) {

            return (2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30);
        } else if (x >= 0 && x <= 1.5) {

            return x + 1;
        } else {

            return x;
        }
    }

//23

    public static void simpleNumbers(int limit) {

        for (int i = 2; i < limit; i++) {

            int counter = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(i + " ");
            }
        }
    }

    //24
    public static void calendar(String day, int month, int date) {



    }


//----------------------------------------------------------------------------------------

    public static void main(String[] args) {

        taskNumber(1);

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        taskNumber(2);

        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        taskNumber(3);

        for (int i = 50; i <= 55; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        taskNumber(4);

        for (int i = 301; i < 327; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        taskNumber(5);

        for (double i = 12; i <= 13; i += 0.1) {
            System.out.format(Locale.ENGLISH, "%.1f ", i);
        }
        System.out.println();

        taskNumber(6);

        for (int i = 215; i < 237; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        taskNumber(7);

        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        taskNumber(8);

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        taskNumber(9);

        for (short i = -10; i <= 34; i++) {
            if (i % 11 == 0 && i != 0) {
                System.out.print(ConsoleColors.BLUE + i + ConsoleColors.RESET + " ");
            } else if (i % 12 == 0 && i != 0) {
                System.out.print(ConsoleColors.RED + i + ConsoleColors.RESET + " ");
            } else if (i == 0) {
                System.out.print("ZERO ");
            }
        }
        System.out.println();

        taskNumber(10);

        seqenceNum(-5, 19, 3);

        taskNumber(11);

        seqenceChar('A', 'y');

        taskNumber(12);

        vowels(-5);

        taskNumber(13);

        power(3);

        taskNumber(14);

        seqence();

        taskNumber(15);

        seqence0To5();

        taskNumber(16); // уточнить

        for (int i = 0; i <= 25; i++) {
            if (i == 25)
                System.out.print(i);
            else if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        taskNumber(17);

        NMLOdd(-5, -2, 2); //щаг отрицательный - в сторону уменьшения

        taskNumber(18);

        NMLRandom(-3, 10, 100);

        taskNumber(19);

        yN(5);

        taskNumber(20);

        y1Y2(12);

        taskNumber(21);

        twoDigits();

        taskNumber(21);

        System.out.println(peaceEquation(1.5));

        taskNumber(22);

        simpleNumbers(200);
    }
}
