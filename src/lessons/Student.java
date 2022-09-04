package lessons;

public class Student {
    public static void main(String [] args) {
        int sex;
        int klass;
        int age;
        String name;
        String lName;

        System.out.println("-------------------------------------------------------------------");
        sex=1;
        klass=5;
        name="Вова";
        lName="Сидоров";
        age=10;

        System.out.println(
                "Учени"
                + ((sex==1) ? "к \t" :"ца \t")
                + klass + "-го класса "
                + name + " "
                + lName + ", "
                + age
                + " "
                + "лет");
        sex=0;
        klass=9;
        name="Маша";
        lName="Семенова";
        age=14;
               System.out.println("Учени" + ((sex==1) ? "к " :"ца ") + klass + "-го класса " + name + " " + lName + ", " + age +
                " " + "лет");
        System.out.println("-------------------------------------------------------------------");

    }
}
