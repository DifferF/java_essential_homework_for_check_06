package homework_06.task_04_enum;

import java.util.Arrays;

        /*
        Задание 4
        Создайте проект, используя IntelliJ IDEA.
        Создайте перечислительный тип (enum) Vehicles,
        содержащий конструктор,
        который должен принимать целочисленное значение (стоимость автомобиля),
        содержать метод getColor(), который возвращает строку с цветом автомобиля,
        и содержать перегруженный метод toString(),
        который должен возвращать строку с названием экземпляра, цветом и стоимостью автомобиля
         */
enum Vehicles {

    AUDI(17000) {
        @Override
        String getColor() {
            return "Цвет Черный";
        }

        @Override
        String modelAvto() {
            return "A3";
        }

    }, BMW(23000) {
        @Override
        String getColor() {
            return "Цвет Белый";
        }

        @Override
        String modelAvto() {
            return "X3";
        }

    }, SUBARU(15000) {
        @Override
        String getColor() {
            return "Цвет Красный";
        }
        @Override
        String modelAvto() {
            return "Forester";
        }
        @Override
        void priceUSA(){
            int priceUA = priceAvto;
            this.priceAvto = 10000;
            System.out.println("Цена в USA = " + priceAvto);
            this.priceAvto = priceUA;
            System.out.println("Цена в Украине " + priceAvto);
        }

    };

    protected int priceAvto;

    // Конструктор может быть только private.
    Vehicles(int priceInt) {
        this.priceAvto = priceInt;
    }

    @Override
    public String toString() {
        String instanceName = name(); // название экземпляра
        // ordinal() - индекс в enum
        return "Название экземпляра " + name() + " Цена " + priceAvto + " " + getColor() + " Index in enum-Class " + ordinal() + "\n";
    }

    public String toString(String input) {
        String instanceName = name(); // название экземпляра
        // ordinal() - индекс в enum
        System.out.println(input);
        return  name() + " " + modelAvto() + " Цена " + priceAvto + " " + getColor() + "\n";
    }


    String getColor() {
        return null;
    }

    void priceUSA(){
        System.out.println("priceUSA() не предусмотрено для " + name());
    }
    abstract String modelAvto();


}

public class Main {
    public static void main(String[] args) {

        // Объект со ссылкой на экземпляр перечисляемого типа Animal.
        Vehicles myCar = Vehicles.SUBARU;
        System.out.println(myCar);  // или
       // System.out.println(myCar.toString());
        System.out.println(myCar.toString("Какая модель?"));
        // метод priceUSA() реализован только для экземпляра SUBARU
        myCar.priceUSA();
        System.out.println("_______________________");

        // Метод values() - позволяет получить массив всех значений Enum
        Vehicles[] avtoAll = Vehicles.values();
        System.out.println(Arrays.toString(avtoAll));
        System.out.println("_______________________");

        Vehicles[] avtoAll2 = Vehicles.values();
        for (Vehicles avtoEach : avtoAll2) {
            avtoEach.priceUSA();
            System.out.println(avtoEach.toString() );
        }
    }
}

