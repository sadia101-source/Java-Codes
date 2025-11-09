package week_11;

public interface Scanner {
    void connect();

    default void details() {
        System.out.println("Scanner: Can scan documents and convert them to digital format.");
    }
}
