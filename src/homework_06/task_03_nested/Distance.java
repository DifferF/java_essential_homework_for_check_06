package homework_06.task_03_nested;

        /*
        Задание 3+
        Создайте проект, используя IntelliJ IDEA.
        Требуется:
        Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
        статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
        измерения (к примеру, из метров в километры, из километров в мили, и так далее).
         */

public class Distance {

    private static double distance;

    Distance(double d) {
        distance = d;
    }

    public void print() {
        System.out.println("В " + distance + " м / " + Converter.met1() + " км ");
        Converter.met2();
        Converter.met3();
        Converter.met4();
        Converter.met5();
        Converter.met6();
        Converter.met7();
        Converter.met8();
    }


    public static class Converter {
        public static double met1() {
            return distance / 1000;
        }

        public static void met2() {
            System.out.println("В " + distance + " м / " + (distance / 1609) + " миль ");
        }

        public static void met3() {
            System.out.println("В " + distance + " м / " + (distance * 1.094) + " ярд ");
        }

        public static void met4() {
            System.out.println("В " + distance + " м / " + (distance * 3.281) + " фут ");
        }

        public static void met5() {
            System.out.println("В " + distance + " м / " + (distance * 39.37) + " дюйм ");
        }

        public static void met6() {
            System.out.println("В " + distance + " м / " + (distance / 1852) + " морская миля ");
        }

        public static void met7() {
            System.out.println("В " + distance + " м / " + (distance * 100) + " см ");
        }

        public static void met8() {
            System.out.println("В " + distance + " м / " + (distance * 1000) + " мм ");
        }
    }


}


class Main {

    public static void main(String[] args) {

        double distance = 100.00; // в м
        Distance distanceIn = new Distance(distance);
        distanceIn.print();
        System.out.println("____________________");
        Distance.Converter.met2();
        Distance.Converter.met3();
        Distance.Converter.met8();
    }

}
