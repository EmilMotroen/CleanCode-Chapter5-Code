import java.io.File;

public class Main {
    public static void main(String[] args) {
        CodeAnalyzer codeAnalyzer = new CodeAnalyzer();
        codeAnalyzer.findJavaFiles(new File("../"));

    }
}