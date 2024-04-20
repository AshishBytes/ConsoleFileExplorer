package com.ashish.fileexplorer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
    private static String currentDirectory = System.getProperty("user.dir");

    public static String getCurrentDirectory() {
        return currentDirectory;
    }

    public static void listFilesAndDirectories(String currentDirectory) {
        File directory = new File(currentDirectory);
        File[] files = directory.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("[DIR] " + file.getName());
                } else {
                    System.out.println("[FILE] " + file.getName());
                }
            }
        } else {
            System.out.println("No files or directories found.");
        }
    }

public static String navigateToDirectory(String currentDirectory, String directoryName) {
    if (directoryName.equals("..")) {
        File parentDir = new File(currentDirectory).getParentFile();
        if (parentDir != null) {
            currentDirectory = parentDir.getAbsolutePath();
            System.out.println("Navigated to parent directory: " + currentDirectory);
            listFilesAndDirectories(currentDirectory);
        } else {
            System.out.println("Already at root directory.");
        }
    } else {
        File newDir = new File(currentDirectory + File.separator + directoryName);

        if (newDir.exists() && newDir.isDirectory()) {
            currentDirectory = newDir.getAbsolutePath();
            System.out.println("Navigated to: " + currentDirectory);
            listFilesAndDirectories(currentDirectory);
        } else {
            System.out.println("Directory not found.");
            return currentDirectory;
        }
    }

    return currentDirectory;
}

public static void listAndDisplayFilesAndDirectories(String currentDirectory) {
    File directory = new File(currentDirectory);
    File[] files = directory.listFiles();

    if (files != null) {
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("[DIR] " + file.getName());
            } else {
                System.out.println("[FILE] " + file.getName());
            }
        }
    } else {
        System.out.println("No files or directories found.");
    }
}

    public static void viewFile(String currentDirectory, String fileName) {
        File file = new File(currentDirectory + File.separator + fileName);

        if (file.isFile() && file.exists()) {
            System.out.println("Contents of " + fileName + ":");
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("File not found.");
        }
    }
}
