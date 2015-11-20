package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Artem on 20.10.2015.
 */
public class Main {
    static List<String> taskCollection = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        while (true) {
            System.out.println("1. Show task's list\n" +
                    "2. Add new task\n" +
                    "3. Delete task\n" +
                    "4. Change name of task\n" +
                    "5. Change the status of the task");
            System.out.println("Select number in the list or exit");
            String currentLine = in.nextLine();
            if ("exit".equals(currentLine)) {
                System.out.println("Goodbye");
                return;
            } else if (currentLine.equals("1")) {
                showTask();
            } else if (currentLine.equals("2")) {
                addTask();
            } else if (currentLine.equals("3")) {
                deleteTask();
            } else if (currentLine.equals("4")) {
                changeName();
            } else if (currentLine == "5") {

            }
        }
    }

    public static void showTask() throws IOException {
        Scanner in = new Scanner(System.in);
        if (taskCollection.isEmpty()) {
            System.out.println("Your task list is empty");
            return;
        }
        for (int i = 0; i < taskCollection.size(); i++) {
            String name = taskCollection.get(i);
            System.out.println("Task #" + i + " - " + name);
        }
    }

    public static void addTask() throws IOException {
        System.out.println("Enter the name of the task");
        String currentLine = in.nextLine();
        Task.name = currentLine;
        Task.isFinished = false;
        Task.id = taskCollection.size();
        taskCollection.add(currentLine);
    }

    public static void deleteTask() throws IOException {
        showTask();
        System.out.println("Type number of the task");
        int deleteNumber = in.nextInt();
        taskCollection.remove(deleteNumber);
        System.out.println("Task removed");
    }

    public static void changeName() throws IOException {
        showTask();
        System.out.println("Enter number of the task");
        int changeNumber = in.nextInt();
        taskCollection.remove(changeNumber);
        System.out.println("Enter new task name");
        String taskName = in.nextLine();
        String newTaskName = in.nextLine();
        taskCollection.add(changeNumber, newTaskName);
        System.out.println("Name changed");
    }

    public static void changeStatus() {
        System.out.println("Hello");

    }
}
