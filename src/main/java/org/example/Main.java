// Определение класса Main
package org.example;

// Объявление класса Main
public class Main {
    // Основной метод программы
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Наполеон", 200, 0),
                new Dog("Черненко"),
                new Dog("Путин"),
                new Tiger("Хрущев", 200, 0),
                new losh("Сталин", 150, 0),
                new zayac("Брежнев", 400, 0),
                new Bobr("Ленин", 50, 150)

        };
        int allanimals = animals.length; // Общий счетчик животных
        // Цикл для каждого животного в массиве
        for (Animal a : animals) {
            // Вызов метода run для каждого животного с параметром 400
            a.run(400);
            // Вызов метода swim для каждого животного с параметром 5
            a.swim(5);
        }
        // Вывод количества животных
        System.out.println("Количество котов " + Cat.count);
        System.out.println("Количество собак " + Dog.count);
        System.out.println("Количество тигров " + Tiger.count);
        System.out.println("Количество лося " + losh.count);
        System.out.println("Количество зайца " + zayac.count);
        System.out.println("Количество бобра " + Bobr.count);


        System.out.println("Общее количество животных: " + Animal.getCount());
        ((Danggerus) animals[6]).dangerus();
        ((Danggerus) animals[5]).dangerus();
        ((Danggerus) animals[4]).dangerus();
    }
}