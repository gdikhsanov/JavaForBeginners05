package homework;

import PublicClasses.ConsoleColors;

public class HW5 {

    public static void taskNumber(int task){
        System.out.println("*********************\nTask # " + task);
    }
    public static void subTaskNumber(int subTask){
        System.out.println("*   * subtask " + subTask + " *   *");
    }

    public static void printTestResult(String testCaseNumber, String result){
        if (result.equals("Pass")){
            System.out.println("TC_" + testCaseNumber+ "   --   "
                    + ConsoleColors.GREEN + result + ConsoleColors.RESET);
        }
        else if (result.equals("Fail")){
            System.out.println("TC_" + testCaseNumber+ "   --   "
                    + ConsoleColors.RED + result + ConsoleColors.RESET);
        }
        else {
            System.out.println("TC_" + testCaseNumber+ "   --   " + ConsoleColors.YELLOW
                    + "Result error - not Pass/True" + ConsoleColors.RESET);
        }
    }

    //1

    public static String verifyEquals(Object expectedResult, Object actualResult){
        if (expectedResult.equals(actualResult)){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }

    //2

    public static String dayOfWeek(int dayNumber){
        if (dayNumber == 1){
            return "Monday";
        }
        else if (dayNumber == 2) {
            return "Tuesday";
        }
        else if (dayNumber == 3) {
            return "Wednesday";
        }
        else if (dayNumber == 4) {
            return "Thursday";
        }
        else if (dayNumber == 5) {
            return "Friday";
        }
        else if (dayNumber == 6) {
            return "Saturday";
        }
        else if (dayNumber == 7) {
            return "Sunday";
        }
        return "Error";
    }

    //3

    public static int avrageAgeOf3 (int age1, int age2, int age3){

        if (age1 < 0 || age2 < 0 || age3 < 0 || age1 > 150 || age2 > 150 || age3 > 150){
            return Integer.MIN_VALUE;
        }
        else {
            return ((age1 + age2 + age3) / 3);
        }
    }

    //4

    public static double avrageTempCat (double t1, double t2, double t3, double t4, double t5){

        return (t1 <= 25 || t2 <= 25 || t3 <= 25 || t4 <= 25 || t5 <= 25 || 
                t1 >= 45 || t2 >= 45 || t3 >= 45 || t4 >= 45 || t5 >= 45)?
                -1: ((t1 + t2 + t3 + t4 + t5) / 5);
    }

    //6

    public static int salaryPerMonth(int workHoursPerDay, double costOfOneHour){

        double averageDaysPerMonth = 20.55;

        if (costOfOneHour < 12 || workHoursPerDay < 0 || workHoursPerDay > 24){
            return -1;
        }
        return (int)Math.round(workHoursPerDay * costOfOneHour * averageDaysPerMonth);
    }

    //7

    public static double expectedTotal(double priceFor1, int amount){

        if (priceFor1 <= 0 || amount <= 0){
            return -1;
        }
        return (priceFor1 * amount);
    }


    public static void main(String[] args) {

        taskNumber(1);

        taskNumber(2);
//TC_2_1

    int dayNum = 1;
    Object expectedResult = "Monday";
    Object actualResult = dayOfWeek(dayNum);

    verifyEquals(expectedResult, actualResult);

    printTestResult("2_1", verifyEquals(expectedResult, actualResult));//TC_1

//TC_2_2

    dayNum = 0;
    expectedResult = "Error";
    actualResult = dayOfWeek(dayNum);

    verifyEquals(expectedResult, actualResult);

    printTestResult("2_2", verifyEquals(expectedResult, actualResult));

    taskNumber(3);
                //#3 Заказчик - человек далекий от программирования. Но он говорит, что когда предыдущая
                // команда писала его программу, то он потерял много покупателей, потому что программа постоянно
                // падала (app crashes). Так что ориентируемся на принятые в программировании стандарты
                // валидации и на житейскую логику.

//TC_3_1 pos

    int age3_1 = 0;
    int age3_2 = 20;
    int age3_3 = 40;
    expectedResult = 20;
    actualResult = avrageAgeOf3(age3_1, age3_2, age3_3);

    verifyEquals(expectedResult, actualResult);

    printTestResult("3_1", verifyEquals(expectedResult, actualResult));

//TC_3_2 neg

    age3_1 = 160;
    age3_2 = 20;
    age3_3 = 40;
    expectedResult = Integer.MIN_VALUE;
    actualResult = avrageAgeOf3(age3_1, age3_2, age3_3);

    verifyEquals(expectedResult, actualResult);

    printTestResult("3_2", verifyEquals(expectedResult, actualResult));

    taskNumber(4);
                // в четвертом задании не написано проверять на негативные сценарии, и негативных сценариев там нет
                // с точки зрения автоматизированного тестирования ).
    subTaskNumber(1);

//TC_4_1 pos

    int k = 3;
    int l = 30;

    expectedResult = 3;
    actualResult = Math.min(k, l);

    verifyEquals(expectedResult, actualResult);

    printTestResult("4_1", verifyEquals(expectedResult, actualResult));

//TC_4_2 pos

        subTaskNumber(2);


    k = 3;
    l = 30;
    int m = 300;

    expectedResult = 3;
    actualResult = Math.min(k, Math.min(l, m));

    verifyEquals(expectedResult, actualResult);

    printTestResult("4_2", verifyEquals(expectedResult, actualResult));

//TC_4_3 pos

        subTaskNumber(3);

    k = 3;
    l = 30;
    m = 300;
    int n = 3000;

    expectedResult = 3;
    actualResult = Math.min(k, Math.min(l, Math.min(m, n)));

    verifyEquals(expectedResult, actualResult);

    printTestResult("4_3", verifyEquals(expectedResult, actualResult));

        taskNumber(5);

//TC_5_1 pos

        double t1 = 39;
        double t2 = 39;
        double t3 = 39;
        double t4 = 39;
        double t5 = 39;

        expectedResult = (double)39;
        actualResult = avrageTempCat(t1, t2, t3, t4, t5);

        verifyEquals(expectedResult, actualResult);

        printTestResult("5_1", verifyEquals(expectedResult, actualResult));

        //TC_5_2 pos

        t1 = 30;
        t2 = 40;
        t3 = 40;
        t4 = 40;
        t5 = 30;

        expectedResult = (double)36;
        actualResult = avrageTempCat(t1, t2, t3, t4, t5);

        verifyEquals(expectedResult, actualResult);

        printTestResult("5_2", verifyEquals(expectedResult, actualResult));

//TC_5_3 neg

        t1 = 150;
        t2 = 39;
        t3 = 39;
        t4 = 39;
        t5 = 39;

        expectedResult = (double)-1;
        actualResult = avrageTempCat(t1, t2, t3, t4, t5);

        verifyEquals(expectedResult, actualResult);

        printTestResult("5_3", verifyEquals(expectedResult, actualResult));

        taskNumber(6);

    //TC_6_1 pos

        int workHoursPerDay = 8;
        double costOfOneHour = 12.5;

        expectedResult = 2055;
        actualResult = salaryPerMonth(workHoursPerDay, costOfOneHour);

        verifyEquals(expectedResult, actualResult);

        printTestResult("6_1", verifyEquals(expectedResult, actualResult));

        //TC_6_2 neg

        workHoursPerDay = 8;
        costOfOneHour = 11;

        expectedResult = -1;
        actualResult = salaryPerMonth(workHoursPerDay, costOfOneHour);

        verifyEquals(expectedResult, actualResult);

        printTestResult("6_2", verifyEquals(expectedResult, actualResult));


        taskNumber(7);

//TC_7_1 pos

        double priceFor1 = 120.5;
        int amount = 2;

        expectedResult = (double)241;
        actualResult = expectedTotal(priceFor1, amount);

        verifyEquals(expectedResult, actualResult);

        printTestResult("7_1", verifyEquals(expectedResult, actualResult));

//TC_7_2 pos

        priceFor1 = 0;
        amount = 2;

        expectedResult = (double)-1;
        actualResult = expectedTotal(priceFor1, amount);

        verifyEquals(expectedResult, actualResult);

        printTestResult("7_2", verifyEquals(expectedResult, actualResult));

    taskNumber(8);




    }
}
