package homework_06.task_02_nested;

    /*
    Задание 2+
    Создайте проект, используя IntelliJ IDEA.
    Требуется:
    Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door,
    которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
     */

class Vehicle {

 public void print(){
    System.out.println(" Метод print() класс Vehicle ");
 }
    public class Wheel {
        public void print(){
            System.out.println(" Метод print() класс Wheel ");
        }

        public class Door {
            public void print(){
                System.out.println(" Метод print() класс Door класса Wheel");
            }
        }

    }

    public class Door {
        public void print(){
            System.out.println(" Метод print() класс Door ");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle instance = new Vehicle();
        instance.print();

        Vehicle.Wheel instance2 = new Vehicle().new Wheel();
        instance2.print();

        Vehicle.Wheel.Door instance3 = new Vehicle().new Wheel().new Door();
        instance3.print();

        Vehicle.Door instance4 = new Vehicle().new Door();
        instance4.print();
    }
}