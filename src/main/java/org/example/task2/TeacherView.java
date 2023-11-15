package org.example.task2;

public class TeacherView {
    public static void main(String[] args) {
        Main1<String, Integer> pair1 = new Main1<>("Математика", 63);
        System.out.println("Предмет: " + pair1.getob() + ", Кабинет: " + pair1.getoby());
    }
}
