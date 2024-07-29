package org.example;

public class Main {

    /*
    Урок 2. Семинар: Принципы ООП: Инкапсуляция, наследование, полиморфизм
Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную
в программе. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
Формат сдачи: Ссылка на гитхаб-проект Подписать фамилию и номер группы
     */

    public static void main(String[] args) {
        Coffe cappuscino = new Coffe("Cappuscino", 250, 250);
        Coffe blackCoffe = new Coffe("Black Coffee", 250, 150);
        Coffe kakao = new Coffe("kakao", 350, 200);
        HotDrinksMachine hotDrinksMachine1 = new HotDrinksMachine(kakao);
        HotDrinksMachine hotDrinksMachine2 = new HotDrinksMachine(cappuscino);
        hotDrinksMachine1.addCoffee(blackCoffe);
        System.out.println(hotDrinksMachine1);
        HotDrink coffe = hotDrinksMachine1.getProduct("kakao", 350, 200);
        System.out.println("Поиск имеющегося напитка");
        System.out.println(coffe);
        System.out.println("Поиск несуществующего напитка: ");
        HotDrink coffe2 = hotDrinksMachine1.getProduct("kakao", 350, 2000);
        System.out.println(coffe2);

        HotDrink coffe3 = hotDrinksMachine2.getProduct("Cappuscino", 250, 250);
        System.out.println("Поиск имеющегося напитка");
        System.out.println(coffe3);

    }
}