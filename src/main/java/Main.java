import io.beams.libjava.Library;

public class Main {

    public static void main(String... args) {
        Library lib = new Library("libname");
        System.out.println("Hello, World! " + lib);
    }
}
