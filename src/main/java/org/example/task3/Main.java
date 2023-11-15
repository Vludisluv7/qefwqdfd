package org.example.task3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить учителя");
            System.out.println("2. Отредактировать учителя");
            System.out.println("3. Показать список учителей");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ новой строки после ввода числа

            switch (choice) {
                case 1:
                    System.out.println("Введите имя учителя:");
                    String name = scanner.nextLine();
                    System.out.println("Введите предмет учителя:");
                    String subject = scanner.nextLine();
                    Teacher teacher = new Teacher(name, subject);
                    teacherController.addTeacher(teacher);
                    break;
                case 2:
                    System.out.println("Введите ID учителя для редактирования:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Считываем символ новой строки после ввода числа

                    System.out.println("Введите новое имя учителя:");
                    String newName = scanner.nextLine();
                    System.out.println("Введите новый предмет учителя:");
                    String newSubject = scanner.nextLine();
                    Teacher newTeacher = new Teacher(newName, newSubject);
                    teacherController.editTeacher(id, newTeacher);
                    break;
                case 3:
                    teacherController.displayTeachers();
                    break;
                case 4:
                    System.exit(0);
            }
            System.out.println();
        }
    }
}
