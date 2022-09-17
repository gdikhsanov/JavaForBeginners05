package homework;

public class Test {

    public static void main(String[] args){

        byte a;
        a = 14;
        int b = 256;
        double c = 35.5;
        double d = 100; //Ирина "надо приписать .0" Intellij "не обязательно"
        String s1 = "Привет";
        int sum = a + b;
        double sub = d - c;
        b = 0;
        double product = b * d;
        Byte bb;
        //Byte bb = new Byte();
        //11

        s1 = Double.toString(c);
        //s1 = String.valueOf(c);
        sum = (int)c + (int)d;
    }

}
