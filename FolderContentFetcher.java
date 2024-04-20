import java.io.File;

public class FolderContentFetcher {
    public static void main(String[] args) {
        String folderPath = "../ConsoleFileExplorer"; // Replace this with the path to your folder
        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            System.out.println(folder.getName());
            printDirectoryStructure(folder, 1);
        } else {
            System.out.println("Folder not found or is not a directory.");
        }
    }

    private static void printDirectoryStructure(File folder, int indentLevel) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    printIndent(indentLevel);
                    System.out.println("├── " + file.getName());
                    printDirectoryStructure(file, indentLevel + 1);
                } else {
                    printIndent(indentLevel);
                    System.out.println("└── " + file.getName());
                }
            }
        }
    }

    private static void printIndent(int indentLevel) {
        for (int i = 0; i < indentLevel; i++) {
            System.out.print("│   ");
        }
    }
}