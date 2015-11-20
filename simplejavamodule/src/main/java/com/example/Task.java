package com.example;

/**
 * Created by Artem on 18.11.2015.
 */
public class Task {
  static String name = new String();
   static boolean isFinished = false;
    static int id;
}
      /*  taskCollection.add("Test task number one");
        taskCollection.add("Test task number two");*//*
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Select number in the list or exit");
            System.out.println("1. Show task's list\n" +
                    "2. Add new task\n" +
                    "3. Delete task\n" +
                    "4. Change name of task\n" +
                    "5. Change the status of the task");


            //прочитай про особенность сравнения простых объектов и ссылочных объектов
            //строка - это ссылочный объект
            // == - проверка на равенство простых объектов и ссылок указывающих на один объект
            // 1 == 1 (true)
            // "Hello" == "Hello" (false)
            // "Hello".equals("Hello") - true
            String currentLine = in.nextLine();
            if ("exit".equals(currentLine)) {
                System.out.println("Goodbye");
                return;
            } else if (currentLine.equals("1")) {
                ShowTask();
            } else if (currentLine.equals("2")) {
                AddTask();
            } else if (currentLine == "3") {

            } else if (currentLine == "4") {

            } else if (currentLine == "5") {

            }

        }*/
