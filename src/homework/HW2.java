package homework;

public class HW2 {
    public static void main(String[] args) {

        int number = 3;
        char subTask = 'a';
        int x = 12;
        int y = 22;
        int z = 32;

        System.out.println("============================== \n"
                + "Task "
                + ++number);

        char sub1 = subTask;
        System.out.println("------------------------ \n"
                        + "subtask "
                        + sub1);

        System.out.println(x
                        + "\n"
                        + y
                        + "\n"
                        + z);

        System.out.println("------------------------ \n"
                + "subtask "
                + ++sub1);

//        System.out.print(
//                x
//                +""
//                + y
//                +""
//                + z
//        );
        System.out.println(
                x + x + x
        );

        System.out.println("------------------------ \n"
                        + "subtask "
                        + ++sub1);

        System.out.printf("x=%s, y=%s, z=%s %n", x , y , z);

        System.out.println("============================== \n"
                        + "Task "
                        + ++number);
        System.out.printf("%s, %s, %s %n", x , y , z);

        System.out.println("============================== \n"
                        + "Task "
                        + ++number);
        System.out.printf("Sum of x and y = %d%n "
                + "y * z = %d%n"
                + "Разность переменных y и z = %s%n", (x + y) , y * z , y - z);

        System.out.println("============================== \n"
                        + "Task "
                        + ++number);

        int apple = 40;
        int student = 6;

        System.out.printf("Если %d яблок поделить на %d учеников, то каждый ученик %n" +
                        "получит по %d яблок(a), и %d яблок(а) останется учителю.%n",
                        apple, student, apple / student, apple % student);

        System.out.println("============================== \n"
                        + "Task "
                        + ++number);

        apple = 100;
        student = 21;

        System.out.printf("Если %d яблок поделить на %d учеников, то каждый ученик %n" +
                        "получит по %d яблок(a), и %d яблок(а) останется учителю.%n",
                        apple, student, apple / student, apple % student);

        System.out.println("============================== \n"
                        + "Task "
                        + ++number);

        int lime = 6;
        int apple2 = lime + 24;
        int pear = apple2 - 12;

        System.out.printf("В столовую привезли %dкг. фруктов %n", lime + apple2 + pear);

        System.out.println("============================== \n"
                        + "Task "
                        + ++number);

        int pain1 = 8;
        int pain2 = 5;
        int pain3 = 7;
        int pain4 = 2;
        int total = 40;

        System.out.printf("У сороконожки заболели ножки:%n"
                + "%d ноют, %d гудят,%n"
                + "%d хромают, %d болят.%n"
                + "Помоги сороконожке%n"
                + "Посчитать здоровые ножки.%n"
                + "Ответ: %d%n", pain1, pain2, pain3, pain4, total - pain1 - pain2 - pain3 - pain4);

        System.out.println("============================== \n"
                        + "Task "
                        + ++number);

        System.out.printf("Во сколько раз 35 больше, чем 7? Ответ: в %d раз(а)%n", 35 / 7);
        System.out.printf("Во сколько раз 8 меньше, чем 48? Ответ: в %d раз(а)%n", 48 / 8);
        System.out.printf("На сколько 54 больше, чем 6? Ответ: на %d%n", 54 - 6);

        System.out.println("============================== \n"
                        + "Task "
                        + ++number);

        char sub2 = subTask;

        System.out.println("------------------------ \n"
                + "subtask "
                + sub2);


        int x1 = 48;
        int y1 = 8;
        int x2 = 47;
        int y2 = 49;
        int delitel = 7;

       System.out.println("48 кратно 8, т.к. остаток от деления первого на второе = " + x1 % y1);

        System.out.println("------------------------ \n"
                + "subtask "
                + ++sub2);

        System.out.println("Оба эти числа четные, т.к. остаток от деления на 2 и у 48 = " + x1 % 2
        + ", и у 8 = " + y1 % 2);

        System.out.println("------------------------ \n"
                + "subtask "
                + ++sub2);

        System.out.println("Числа 47 и 49 нечетные, т.к. остаток от деления на 2 и у 47 = " + x2 % 2
        + ", и у 49 = " + y2 % 2);

        System.out.println("------------------------ \n"
                + "subtask "
                + ++sub2);

        System.out.printf("Только одно из всех этих чисел кратно 7, т.к. остаток от деления на 7, который "
                        + "должен быть равен 0, для \n%d, %d, %d, %d равен \n%d, %d, %d, %d, соответственно.\n",
                        x1, y1, x2, y2, x1 % delitel, y1 % delitel, x2 % delitel, y2 % delitel);

        System.out.println("============================== \n"
                + "Task "
                + ++number);

        double k = 5;
        double l = 10;
        double m = 15;
        String line = "-------------------------------------------------------------------------------------"
        + "--";

        System.out.println(line);
        System.out.printf("|%5s%-8.2s|%-8.2s|%-8.2s|%-8.2s|%-8.2s|%-8.2s|%-8.2s|%-8.2s|%-8.2s|\n",
                "", "", "+10", "-5" , "*100" , "/2" , "%2" , "^2" , "++" , "--");
        System.out.println(line);
        System.out.printf("|%5s%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|\n",
                "k=", k, k+10, k-5, k*100, k/2, k%2, Math.pow(k, 2), k+1, k-1);
        System.out.println(line);
        System.out.printf("|%5s%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|\n",
                "l=", l, l+10, l-5, l*100, l/2, l%2, Math.pow(l, 2), l+1, l-1);
        System.out.println(line);
        System.out.printf("|%5s%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|%-8.2f|\n",
                "m=", m, m+10, m-5, m*100, m/2, m%2, Math.pow(m, 2), m+1, m-1);
        System.out.println(line);


        System.out.println("============================== \n"
                + "Task "
                + ++number);

        double x5 = 5;
        double y5 = 18;
        int n5 = 3;

        System.out.println(Math.pow(x5, n5));
        System.out.printf("%.50f", ((5*x5 + 7*y5) / (8*x5 + 10*y5)) / ((3*x5 - y5)/(x5 + y5)));

    }
}
