# ConsoleFileExplorer Showcase

This repository contains a Java project organized as follows:

```ruby
ConsoleFileExplorer
│   └── run_project.sh
│   └── README.md
│   ├── com
│   │   ├── ashish
│   │   │   ├── fileexplorer
│   │   │   │   └── FileExplorer.class
│   │   │   │   └── FileManager.class
│   └── FolderContentFetcher.java
│   └── test.txt
│   └── .gitignore
│   ├── src
│   │   ├── com
│   │   │   ├── ashish
│   │   │   │   ├── fileexplorer
│   │   │   │   │   └── FileManager.java
│   │   │   │   │   └── FileExplorer.java
│   └── FolderContentFetcher.class
```


## Project Structure

- **run_project.sh**: Shell script to execute the Java project.
- **com/ashish/fileexplorer**: Directory containing compiled Java class files for the FileExplorer and FileManager classes.
- **FolderContentFetcher.java**: Java source code file for the FolderContentFetcher class.
- **test.txt**: Test text file.
- **.gitignore**: Git ignore file.
- **src/com/ashish/fileexplorer**: Directory containing Java source code files for the FileExplorer and FileManager classes.
- **FolderContentFetcher.class**: Compiled Java class file for the FolderContentFetcher class.

## Running the Project

To run the project, you can execute the `run_project.sh` script. Ensure that the script has executable permissions:

```bash
cd java_project
chmod +x run_project.sh
./run_project.sh
```