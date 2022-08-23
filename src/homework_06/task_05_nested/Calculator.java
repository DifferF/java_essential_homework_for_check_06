package homework_06.task_05_nested;

        /*
        Задание
        Используя IntelliJ IDEA, создайте проект.
        Требуется:
        Создать класс Calculator, с методами для выполнения основных арифметических операций.
        Написать программу, которая выводит на экран основные арифметические операции.
         */

public class Calculator {

    private static double number1;
    private static double number2;

    Calculator(double n1, double n2) {
        number1 = n1;
        number2 = n2;
    }

    public void print() {
        System.out.println(number1 + " * " + number2 + " = " + met1());
        System.out.println(number1 + " + " + number2 + " = " + met2());
        System.out.println(number1 + " - " + number2 + " = " + met3());
        System.out.println(number2 + " - " + number1 + " = " + met4());
        met5();
    }

    public static double met1() {
        return number1 * number2;
    }
    public static double met2() {
        return number1 + number2;
    }
    public static double met3() {
        return number1 - number2;
    }
    public static double met4() {
        return number2 - number1;
    }
    public static double met5() {
       if(number1 == 0){
           return delNul();
       } else if (number2 == 0){
           return delNul();
       } else{
           System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
           met6();
           return  (number1 / number2);
       }
    }
    public static double met6() {
        System.out.println(number2 + " / " + number1 + " = " + (number2 / number1));
        return  (number2 / number1);
    }
    public static double delNul(){
        System.out.println("Деление на ноль не возможно");
        return 0;
    }

    public static void main(String[] args) {
        Calculator dist = new Calculator(5,3);
        dist.print();
    }

}

class Main {
}


