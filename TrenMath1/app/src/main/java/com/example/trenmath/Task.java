package com.example.trenmath;

// класс для описания задачи
public class Task {
    // поля класса
    public String id, n,description, wrongAns1, wrongAns2,wrongAns3,correctAns;

    // конструктор без параметров
    public Task(Task task) {
    }

    // конструктор с параметрами


    public Task(String id, String n, String description, String wrongAns1, String wrongAns2, String wrongAns3, String correctAns) {
        this.id = id;
        this.n = n;
        this.description = description;
        this.wrongAns1 = wrongAns1;
        this.wrongAns2 = wrongAns2;
        this.wrongAns3 = wrongAns3;
        this.correctAns = correctAns;
    }
}
