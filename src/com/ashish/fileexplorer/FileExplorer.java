package com.ashish.fileexplorer;

import java.util.Scanner;

public class FileExplorer {
    private static Scanner scanner = new Scanner(System.in);
    private static String currentDirectory = System.getProperty("user.dir");

    public static void main(String[] args) {
        showOptions();
    }

private static void showOptions() {
    while (true) {
        System.out.println("\nCurrent Directory: " + currentDirectory);
        System.out.println("Options:");
        System.out.println("1. List files and directories");
        System.out.println("2. Navigate to a directory");
        System.out.println("3. View a file");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        String choiceStr = scanner.nextLine();

        if (!choiceStr.matches("\\d")) {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
            continue;
        }

        int choice = Integer.parseInt(choiceStr);
        switch (choice) {
            case 1:
                FileManager.listFilesAndDirectories(currentDirectory);
                break;
            case 2:
                navigateToDirectory();
                break;
            case 3:
                viewFile();
                break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    }
}
    private static void navigateToDirectory() {
        System.out.print("Enter directory name: ");
        String directoryName = scanner.nextLine();
        FileManager.navigateToDirectory(currentDirectory, directoryName);
        currentDirectory = FileManager.getCurrentDirectory();
    }

    private static void viewFile() {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        FileManager.viewFile(currentDirectory, fileName);
    }
}

