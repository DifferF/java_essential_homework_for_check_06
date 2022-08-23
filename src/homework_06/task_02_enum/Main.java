package homework_06.task_02_enum;

import java.util.Arrays;

/*
Задание 2
Создайте проект, используя IntelliJ IDEA.
Создайте перечислительный тип (enum) Animals, содержащий конструктор,
который должен принимать целочисленное значение (возраст животного),
и содержать перегруженный метод toString(),
который должен возвращать название экземпляра и возраст животного.
 */
enum Animals {

    STRAUS(7, "Саша") {
        @Override
        String genusAnimal() {
            return "Род Птицы";
        }

    }, LION(10, "King") {
        @Override
        String genusAnimal() {
            return "Род Кошачьи";
        }

    }, PENGUIN(4, "Bin") {
        @Override
        String genusAnimal() {
            return "Род Птицы";
        }

    }, SNAKE(12, "Марина") {
        @Override
        String genusAnimal() {
            return "Пресмыкающиеся";
        }
    };

    private int ageAnimal;
    protected String animalName;


    // Конструктор может быть только private.
    Animals(int age, String name) {
        this.ageAnimal = age;
        this.animalName = name;

    }

    public String toString() {
        String instanceName = name(); // название экземпляра
        // ordinal() - индекс в enum
        return "Название экземпляра " + name() + " Возраст " + ageAnimal + " Кличка " + animalName + " Index в enum Class " + ordinal() + "\n";
    }

    public String toString(String stringInput) {
        String instanceName = name(); // название экземпляра
        return stringInput + " " + name() + " " + genusAnimal() + "\n";
    }

    public String proMet() {
        return "Просто метод 1+1= " + (1 + 1) + " и поле animalName = " + animalName;
    }

    abstract String genusAnimal();

}

public class Main {
    public static void main(String[] args) {

        // Метод values() - позволяет получить массив всех значений Enum
        Animals[] animalAll = Animals.values();
        System.out.println(Arrays.toString(animalAll));
        System.out.println("_______________________");
        // Объект со ссылкой на экземпляр перечисляемого типа Animal.
        Animals myAnimal = Animals.LION;
        System.out.println(myAnimal.toString());
        System.out.println(myAnimal);
        System.out.println(myAnimal.genusAnimal());
        System.out.println("_______________________");
        System.out.println(myAnimal.toString("Мне нравятся"));
        System.out.println("_______________________");
        System.out.println(myAnimal.proMet());


    }
}

