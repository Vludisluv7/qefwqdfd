package org.example.task1;

public class Teacherservice {
    public static void main(String[] args) {
        // Создаем объект типа Gen<Integer>
        Main<String> iOb = new Main<>("Учитель математики");

        // Отображаем тип данных, используемый в объекте iOb
        iOb.showType();

        // Получаем значение из объекта iOb
        String v = iOb.getob();
        System.out.println("Значение: " + v);

        System.out.println();

        // Создаем объект типа Gen<String>
        Main<String> strOb = new Main<>("Тестирование");

        // Отображаем тип данных, используемый в объекте strOb
        strOb.showType();

        // Получаем значение из объекта strOb
        String str = strOb.getob();
        System.out.println("Значение: " + str);
    }
}
