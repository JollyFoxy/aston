package DZ3;

public class Main {
    public static void main(String[] args) {
        FileHelper file1 = new FileHelper("src/main/java/resources/file.txt");
        try {
            file1.writeLine("Привет");
            System.out.println(file1.readLine());
        } catch (FileException e) {
            e.printStackTrace();
        }

    }

}
