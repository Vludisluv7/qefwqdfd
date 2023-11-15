package org.example.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherController {
    private List<Teacher> teachers;

    public TeacherController() {
        teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Учитель успешно добавлен");
    }

    public void editTeacher(int teacherId, Teacher newTeacher) {
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == teacherId) {
                teachers.set(i, newTeacher);
                System.out.println("Учитель успешно отредактирован");
                return;
            }
        }
        System.out.println("Учитель с указанным ID не найден");
    }

    public void displayTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}

class Teacher {
    private static int nextId = 1;
    private int id;
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.id = nextId++;
        this.name = name;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Учитель: " + name + ", предмет: " + subject;
    }
}