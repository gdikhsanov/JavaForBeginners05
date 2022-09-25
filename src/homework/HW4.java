package homework;

public class HW4 {

    //2
    public static void taskNumbers(int number) {
        System.out.println("Task # "
                + number
                + "\n================================================\n" );
    }

    //12
    public static void tempF(int tempC){

        System.out.printf( "%d°C = %d°F \n", tempC, Math.round((tempC * 9 / 5) + 32));

    }

    //13 // забыл сделать 2ю часть
    public static void numDiv3_5Compare(int first, int second) {

        if ((first % 3 == 0) && (second % 3 == 0) && (first % 5 == 0) && (second % 5 == 0)) {

            System.out.println(
                    "a + b = "
                    + (first + second)
                    + "\n"
                    + "a - b = "
                    + (first - second));
        }
        else if ((first % 3 == 0) && (second % 3 == 0)){

            System.out.println("a + b = "
                    + (first + second));
        }
        else if ((first % 5 == 0) && (second % 5 == 0)) {

            System.out.println("a + b = "
                    + (first - second));
        }
        else
            System.out.println("Невозможно произвести действия");
    }

    //14

    public static void mathKLM(int k, int l, int m) {

        if (k!= 0 && l!= 0 && m!= 0) { // переделать на ноль для только в знаменателе!!!

            System.out.printf(//"%d %d %d ", k, l, m%k);
            "Результат деления %d на %d = %.2f, а остаток от деления  = %d\n"
                    + "Результат деления %d на %d = %.2f, а остаток от деления  = %d\n"
                    + "Результат деления %d на %d = %.2f, а остаток от деления  = %d\n"
                    + "Результат деления %d на %d = %.2f, а остаток от деления  = %d\n",
            +k, l, ((double) k / (double) l), (k % l),
            +k, m, ((double) k / (double) m), (k % m),
            +l, m, ((double) l / (double) m), (l % m),
            +m, k, ((double) m / (double) k), (m % k));
        }
    }

    //16

    static double speed;
    public static void speedAverage(int distance, int timeMinuts) {

        speed = (((double)distance / (double)timeMinuts) * 60);

        System.out.printf("Если тело преодолело %d км. за %d мин., то его средняя скорость была равна %.2f км/ч.\n",
                distance, timeMinuts, speed);

    }



    public static void animals(int q) {

    }

    public static void main(String[] args) {

        taskNumbers(2);

        taskNumbers(3);

        String pine = "\"Сосна\"";
        String oak = "\"Дуб\"";
        String maple = "\"Клен\"";
        String cherry = "\"Вишня\"";

        System.out.println("(2 == 2) && (7 == 7)\n"
                + "!(15 < 3)"
                + "(Сосна.equals(Дуб)) || (Вишня.equals(Клён))\n"
                + "!(\"Сосна\" == \"Дуб\");\n"
                + "!(15 < 3)) && (10 > 20);\n"
                + "(\"Глаза даны, чтобы видеть\") && (\"Под третьим этажом находится второй этаж\");\n"
                + "(6/2 == 3) || (7*5 == 20)\n");

        System.out.println((2 == 2) && (7 == 7));
        System.out.println(!(15 < 3));
        System.out.println((pine.equals(oak)) || (cherry.equals(maple)));
        System.out.println(!(pine.equals(oak)));
        System.out.println((!(15 < 3)) && (10 > 20));
        System.out.println("(\"Глаза даны, чтобы видеть\") && (\"Под третьим этажом находится второй этаж\")");
        System.out.println((6/2 == 3) || (7*5 == 20));


        taskNumbers(4);

        System.out.println("а) (Света < Андрея) && (Света < Наташи)\n"
                + "б) На полке стоят учебники && на столе лежат справочники\n"
                + "в) (БОльшая часть детей == девочки) && (Остальные == мальчики)\n");

        taskNumbers(5);

        System.out.println("Водительские права можно получить, только если возраст >= 16 лет.");

        taskNumbers(6);

        System.out.println("!(Петя едет в автобусе) &&  (читает книгу || !(смотрит в окно))");

        taskNumbers(7);

        System.out.println(
        "if ((с другом) == true){\n"
            + "\t\tХорошо\n"
        + "\t}\n"
            + "\telse{\n"
                + "\t\tПлохо\n"
            + "\t}\n");

        taskNumbers(8);

        // x может принимать значения 10, 12, -3, 5 и 0

        int x = 10;

        if (x > 10){
            System.out.println("х больше 10");
        }
        else if (x < 0){
            System.out.println("х - отрицательное число");
        }
        else if (x == 5){
            System.out.println("Разность x и 5 равна 0");
        }
        else{
            System.out.println("Число x меньше 11, больше или равно 0, но не равно 5");
        }

        System.out.println((x < 11) && (x >= 0) && (x != 5));

        taskNumbers(9);

        int y = 11;

        if (y % 2 == 0){
            System.out.println( y * 2);
        }
        else {
            System.out.println(y * y);
        }

        taskNumbers(10);

        int age = 7;
        String intro = "Если вам ";
        String yes = "можно";
        String no = "нельзя";
        String vote = "Голосовать Вам ";
        String drive = "Водить машину Вам ";
        String goToSchool = "Идти в школу Вам ";


        System.out.println(intro + age);

        if (age >= 18) {
            System.out.println(vote
                    + yes);
        }
        else {
            System.out.println(vote
                    + no);
        }

        if (age >= 16) {
            System.out.println(drive
                    + yes);
        }
        else {
            System.out.println(drive
                    + no);
        }

        if (age >= 5) {
            System.out.println(goToSchool
                    + yes);
        }
        else {
            System.out.println(goToSchool
                    + no);
        }

        taskNumbers(11);

        int score = 3;

        if (score == 5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс\n");
        }
        else if (score == 4) {
            System.out.println("перевести в следующий класс\n");
        }
        else if (score == 3) {
            System.out.println("дать задание на лето и перевести в следующий класс\n");
        }
        else if (score == 2) {
                    System.out.println("вызвать родителей и оставить в текущем классе на второй год\n");
        }

        taskNumbers(12); // Math.round((c1 * 9 / 5) + 32)

        tempF(32);

        taskNumbers(13); // забыл сделать 2ю часть

        numDiv3_5Compare(45, 15);

        taskNumbers(14); // добавил проверку на ноль. Надо переделать на проверку на ноль только в знаменателе.

        mathKLM(10, 12,20);

        taskNumbers(15);

        int r;
        int f;
        int heads = 35;
        int legs = 94;


        f = 2 * heads - legs / 2;
        r = heads - f;

        System.out.printf("Если в клетке находятся фазаны и кролики. И известно, что у них\n"
                + "35 голов и 94 ноги. То из них %d кроликов и %d фазанов.\n", r, f);

        //Test
        int expectedResultR = 12;
        int expectedResultF = 23;
        int actualResultR = r;
        int actualResultF = f;

        if (expectedResultF == actualResultF && expectedResultR == actualResultR) {

            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        taskNumbers(16);

//        Тестовые данные:
//        distance		time
//        12			20 min
//        150		2,5 hours
//        300		1¾ hours

        int distanceInput = 300;
        int timeInput = 100;

        speedAverage(distanceInput, timeInput);

        // Test

        int expectedResult1 = 36;
        int expectedResult2 = 60;
        int expectedResult3 = 180;
        int distance1 = 12;
        int distance2 = 150;
        int distance3 = 300;
        int time1 = 20;
        int time2 = 150;
        int time3 = 100;
        double actualResult1 = speed;

        if (!(timeInput == time1 && distanceInput == distance1)
                && !(timeInput == time2 && distanceInput == distance2)
                && !(timeInput == time3 && distanceInput == distance3))
        {
            System.out.println("Test data out of range");
        } else if ((timeInput == time1 && distanceInput == distance1 && expectedResult1 == actualResult1)
                || (timeInput == time2 && distanceInput == distance2 && expectedResult2 == actualResult1)
                || (timeInput == time3 && distanceInput == distance3 && expectedResult3 == actualResult1))
        {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        taskNumbers(17);
//1 ко, 5-20 к, /2-4 ка, /5-9 к, 0 k
//1-4 а 5-20 ов 21-24 а 25-30 ов
        int apple = 40;
        int student = 6;
        String endingApple;
        String endingStudent;

        if ((apple % 10) == 1){

            endingApple = "ко";
        }
        else if ((5 <= apple) && (apple <= 20))  {

            endingApple = "к";
        }
        else if ((2 <= (apple % 10)) && ((apple % 10)) <= 4) {

            endingApple = "ка";
        }
        else if (((5 <= (apple % 10)) && ((apple % 10) <= 9)) ||  ((apple % 10) == 0)){

            endingApple = "к";
        }
        else {

            endingApple = "CHECK!!!";
        }

        System.out.printf("Если %d ябло%s поделить на %d учеников, то каждый ученик %n" +
                        "получит по %d ябло%s, и %d ябло%s останется учителю.%n",
                apple, endingApple, student, apple / student, endingApple, apple % student, endingApple);



    }

}
