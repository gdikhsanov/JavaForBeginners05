package homework;

public class HW2 {
    public static void main(String[] args) {
        int number = 3;
        char subTask = 'a';
        int x = 12;
        int y = 22;
        int z = 32;

        System.out.println(
                "============================== \n"
                + "Task "
                + ++number
        );
        System.out.println(
                "------------------------ \n"
                        + "subtask "
                        + subTask
        );
        System.out.println(
                        x
                        + "\n"
                        + y
                        + "\n"
                        + z
        );

        System.out.println(
                "------------------------ \n"
                + "subtask "
                + ++subTask
        );

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

        System.out.println(
                "------------------------ \n"
                        + "subtask "
                        + ++subTask
        );
        System.out.println(
                "* \n "
                        + "x = "
                        + x
                        + "\n"
                        + "y = "
                        + y
                        + "\n"
                        + "z = "
                        + z
        );
        System.out.println(
                "** \n "
                        + "x = "
                        + x
                        + ", y = "
                        + y
                        + ", z = "
                        + z
                        + "\n"
        );

    }
}
