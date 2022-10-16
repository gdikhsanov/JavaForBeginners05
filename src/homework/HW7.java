package homework;

import java.time.Year;
import java.util.Arrays;

public class HW7 {

    public static void taskNumber(int task) {
        System.out.println("\n*********************\nTask # " + task + "\n");
    }

    public static String returnMonth(int number) {
        if (number > 0 && number < 13) {
            switch (number) {
                case 1:
                    return "Jan";
                case 2:
                    return "Feb";
                case 3:
                    return "Mar";
                case 4:
                    return "Apr";
                case 5:
                    return "May";
                case 6:
                    return "Jun";
                case 7:
                    return "Jul";
                case 8:
                    return "Aug";
                case 9:
                    return "Sep";
                case 10:
                    return "Oct";
                case 11:
                    return "Nov";
                case 12:
                    return "Dec";
            }
        }
        return "Error";
    }

    public static String returnDayOfTheWeek(int number) {
        if (number > 0 && number < 8) {

            switch (number) {
                case 1:
                    return "Mon";
                case 2:
                    return "Tue";
                case 3:
                    return "Wed";
                case 4:
                    return "Thu";
                case 5:
                    return "Fri";
                case 6:
                    return "Sat";
                case 7:
                    return "Sun";
            }
        }
        return "Error";
    }

    public static int returnDayOfTheWeek(String day) {

        switch (day) {
            case "Mon":
                return 1;
            case "Tue":
                return 2;
            case "Wed":
                return 3;
            case "Thu":
                return 4;
            case "Fri":
                return 5;
            case "Sat":
                return 6;
            case "Sun":
                return 7;
        }

        return 0;
    }

    public static String returnDate(int date) {
        if (date < 10) {

            return "0" + String.valueOf(date); //добавляем ноль для 1-9
        } else {
            return String.valueOf(date);
        }
    }

    public static int daysInMonth(int month, int year) {

        int numDays;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:

                return -1;
        }

        return numDays;
    }

    public static void printEightDaysFromDate(String day, int month, int date, int year) {

        int currentYear = year; //использовал для метода без агумета year. Для текущего года.

        if (returnDayOfTheWeek(day) == 0 ||
                returnMonth(month).equals("Error") ||
                month <= 0 || // лишнее т.к. уже проверяется в returnMonth
                date <= 0 ||
                date > (daysInMonth(month, year))) {

            System.out.println("Please enter correct data.");

        } else {
            int currentDay = returnDayOfTheWeek(day);
            int currentMonth = month;
            int currentDate = date;
// print day
            for (int i = 0; i <= 7; i++) {
                if (currentDay != 7) {
                    System.out.print(returnDayOfTheWeek(currentDay) + ", ");
                    currentDay++;
                } else {
                    System.out.print(returnDayOfTheWeek(currentDay) + ", ");
                    currentDay = 1;
                }
// prinnt month + date
                if (currentDate <= daysInMonth(currentMonth, currentYear)) {
                    System.out.println(returnMonth(currentMonth) + " " + returnDate(currentDate));
//                    System.out.println(" " + currentYear); //проверка года - закоментить
                    currentDate++;
                } else {
                    if (currentMonth != 12) {
                        currentMonth++;
                    } else {
                        currentMonth = 1;
                        currentYear = year + 1;
                    }
                    currentDate = 1;
                    System.out.println(returnMonth(currentMonth) + " " + returnDate(currentDate));
//                    System.out.println(" " + currentYear); //проверка года - закоментить
                    currentDate++;
                }
            }
        }
    }

    //2
    public static void siqenceFromToStep(int from, int to, int step) {
        if (step != 0 && from <= to) {
            for (int i = from; i <= to; i++) {
                if (i % Math.abs(step) == 0) {
                    System.out.print(i + " ");
                }
            }

        } else if (step != 0 && from > to) {
            for (int i = from; i >= to; i--) {
                if (i % Math.abs(step) == 0) {
                    System.out.print(i + " ");
                }
            }

        } else {
            System.out.println("Error: step is zero exception");
        }
    }


    //21
    public static void printEven(int l) {

        int[] numbers = new int[Math.abs(l)];

        for (int i = 0; i < Math.abs(l); i++) {

            int number;

            do {
                number = (int) Math.abs(Math.random() * 7);
                if (number % 2 == 0) {
                    numbers[i] = number;
                }
            }
            while (number % 2 == 0);
        }
        System.out.print(Arrays.toString(numbers));
    }

    //22
    public static void printAerage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(/*Math.round*/(sum / (double) arr.length));
    }

    //25
    public static void checkArr(int[] arr, int number) {

        int maybe = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number + 1 || arr[i] == number - 1) {
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

        taskNumber(1);

        // выполняю в последней задаче

        taskNumber(2);

        siqenceFromToStep(-11, -61, 15);

        taskNumber(3);

        String[] catsNames = {"q", "w", "e", "r", "t", "y", "u"};

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

        for (String c : catsColors
        ) {
            if (c.equalsIgnoreCase("grey")) {
                System.out.println("Накорми кота!");
            }
        }

        taskNumber(10);

        for (boolean c : isCatRed
        ) {
            if (c == true) {
                System.out.println("Дай коту воды!");
            }
        }

        taskNumber(11);

        for (int c : catsAges
        ) {
            if (c < 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }

        taskNumber(12);

        System.out.printf("%s %s %d",
                catsNames[catsNames.length - 1],
                catsNames[catsColors.length - 1],
                catsAges[catsNames.length - 1]);

        taskNumber(13);

        System.out.printf("%s %s %d \n%s %s %d",
                catsNames[catsNames.length / 2],
                catsColors[catsColors.length / 2],
                catsAges[catsAges.length / 2],

                catsNames[catsNames.length / 2 + 1],
                catsColors[catsColors.length / 2 + 1],
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
        System.out.println(/*Math.round*/(sumAge / (double) catsAges.length));

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
            if (i % 2 != 0 && catsAges[i] < 2) {
                System.out.println(catsNames[i]);
            }
        }

        taskNumber(21);

        printEven(9);

        taskNumber(22);

        printAerage(catsAges);

        taskNumber(23);

        int[] odd = new int[50]; // вычислить длинну массива первым for со счетчиком
        int o = 0;

        for (int i = -1000; i < -900; ) { //ТАК МОЖНО

            odd[o] = i;
            i += 2;
            o++;
        }
        System.out.println(Arrays.toString(odd));

        taskNumber(24);

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 101) + 100;
        }

        System.out.print(Arrays.toString(numbers));

        taskNumber(25);

        checkArr(new int[]{1, 2, 1, 4, 5, 2, 6, 4, 1, 2, 1, 4, 3, 5, 3, 2, 8, 4}, 3);

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
            } else {
                oddNumbers[oddIndex] = numbers[i];
                oddIndex += 1;
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));

        taskNumber(27);
                /* Временное помешательство - неоднородные массивы
                {{"Мурзик", 2, "Grey"}, {"Черныш", 3, "Black"}, {"Мурка", 4, "Grey"},
                {"Васька", 1, "Brown"}, {"Рыжик", 5, "Red"}, {"Дымка", 6, "Grey"}, {"Патрик", 9, "Red"},
                {"Зорро", 10, "Grey"}};
                */

        Object[][] cats =
                {{"Мурзик", "Черныш", "Мурка", "Васька", "Рыжик", "Дымка", "Патрик", "Зорро"},
                        {2, 3, 4, 1, 5, 6, 9, 10},
                        {"Grey", "Black", "Grey", "Brown", "Red", "Grey", "Red", "Grey"}};

        for (int i = 0; i < cats[1].length; i++) {
            if (i % 2 == 0) {
                System.out.println(cats[0][i] + " " + cats[1][i] + " " + cats[2][i]);
            }
        }

        taskNumber(28);

        int[][] randomArr = new int[4][8];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                randomArr[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        System.out.println(Arrays.deepToString(randomArr));

        taskNumber(29);

        for (int i = 0; i < randomArr.length; i++) {
            for (int j = 0; j < randomArr[i].length; j++) {
                if (randomArr[i][j] % 2 == 0) {
                    System.out.print(randomArr[i][j] + " ");
                }
            }
        }

        taskNumber(30);

        printEightDaysFromDate("Fri", 12, 27, 2020);
    }
}
