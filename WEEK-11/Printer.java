package week_11;

public interface Printer {
   void connect();

    default void details() {
        System.out.println("Printer: Can print documents and images in high quality.");
    }  
}
