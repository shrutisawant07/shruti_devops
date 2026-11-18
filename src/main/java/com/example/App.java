package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                students.add(name);
                System.out.println("Student added successfully!");
            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    System.out.println("Student List:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println((i + 1) + ". " + students.get(i));
                    }
                }
            } else if (choice == 0) {
                System.out.println("Thank you!");
            } else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }

    public static String welcomeMessage() {
        return "Welcome to Student Management System";
    }
}
