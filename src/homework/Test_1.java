package homework;

public class Test_1 {

    public static String verifyEquals(Object expectedResult, Object actualResult){
        if (expectedResult.equals(actualResult)){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }

    public static double math(double a, double b, double c) {

        if((a * b - c) > 0) {

            return (a * b - c);
        }

        return 0;

    }

    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        if (a >= b){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

//TC_1

        a = 7;
        b = 2;
        double c = 4;

        double exRes = 10.0;

        double actRes = math(a, b, c);

        verifyEquals(exRes, actRes);


        System.out.println(verifyEquals(exRes, actRes));

//TC_2

        a = 7;
        b = 2;
        c = 100;

        exRes = 0.0;

        actRes = math(a, b, c);

        verifyEquals(exRes, actRes);


        System.out.println(verifyEquals(exRes, actRes));

    }
}


/*
1. System с маленькой буквы
2.  Одну ; не поставил
3. Негативного сценария для задачи не было - второй тест не был нужен
4. Во втором тесте забыл убрать объявление переменной, но он был и не нужен :)

5. Первое задание забыл переместить в main и изменить названия переменных a b c
    (не ошибка если предполагать исполнение в другом классе)

    Оригинальный код ниже
 */


//
//
//    int a = 1;
//    int b = 3;
//
//if (a >= b){
//        system.out.println("Pass");
//        }
//        else {
//        system.out.println("Fail");
//        }
//
//public static double math(double a, double b, double c) {
//
//        if((a * b - c) > 0) {
//
//        return (a * b - c)
//        }
//
//        return 0;
//
//        }
//
//public static void main(String[] args) {
//
////TC_1
//
//        int double a = 7;
//        int double b = 2;
//        int double c = 4;
//
//        double exRes = 10.0;
//
//        double actRes = math(a, b, c);
//
//        verufyEquals(exRes, actRes);
//
//
//        system.out.println(verufyEquals(exRes, actRes));
//
////TC_2
//
//        double a = 7;
//        double b = 2;
//        double c = 100;
//
//        double exRes = 0.0;
//
//        double actRes = math(a, b, c);
//
//        verufyEquals(exRes, actRes);
//
//
//        system.out.println(verufyEquals(exRes, actRes));
//
//        }