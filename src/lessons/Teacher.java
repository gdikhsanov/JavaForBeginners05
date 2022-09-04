package lessons;

public class Teacher {

    public static void main(String[] args) {
//
//        System.out.println("First name: Maria, " +
//                "Middle name: Ivanovna, " +
//                "Last name: Petrova");
//
//        System.out.println("First name: Maria, ");
//        System.out.println("Middle name: Ivanovna, ");
//        System.out.println("Last name: Petrova");

//        System.out.println("First name: Maria, \n" +
//                "Middle name: Ivanovna, \n" +
//                "Last name: Petrova\n" +
//                "Age: 35 y.o. \n" +
//                "Subject: Russian Literature"
//        );

        int age = 35;
        String subject = "Russian Literature";
        String firstName = "Maria";

        System.out.println("____________________________________________________________");
        System.out.println(
                "First name: " + firstName +", \n" +
                "Middle name: Ivanovna, \n" +
                "Last name: Petrova\n" +
                "Age: "+age+" y.o. \n" +
                "Subject: " + subject
        );
        System.out.println("____________________________________________________________");

        age = 55;
        subject = "Учитель математики";
        firstName = "Иван";
        String lastName = "Серебряков";
        String middleName = "Петрович";

        System.out.println("************************************************************");
        System.out.println(
                "First name: " + firstName +", \n" +
                "Middle name: " + middleName + ", \n" +
                "Last name: " + lastName + "\n" +
                "Age: "+ age +" y.o. \n" +
                "Subject: " + subject
        );
        System.out.println("************************************************************");


    }


}
