package homework;

import PublicClasses.ConsoleColors;

public class HW5 {

    public static void taskNumber(int task){
        System.out.println("Task # " + task);
    }

    public static void printTestResult(int testCaseNumber, String result){
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


    public static void main(String[] args) {

        taskNumber(1);

        taskNumber(2);
//TC_1

    int dayNum = 1;
    String expectedResult = "Monday";
    String actualResult = dayOfWeek(dayNum);

    verifyEquals(expectedResult, actualResult);

    printTestResult(1, verifyEquals(expectedResult, actualResult));//TC_1

//TC_2

    dayNum = 0;
    expectedResult = "Error";
    actualResult = dayOfWeek(dayNum);

    verifyEquals(expectedResult, actualResult);

    printTestResult(2, verifyEquals(expectedResult, actualResult));

    taskNumber(3);




    }
}
