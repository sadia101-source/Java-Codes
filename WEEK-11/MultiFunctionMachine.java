package week_11;

public class MultiFunctionMachine implements Printer, Scanner{
  public void connect() {
        System.out.println("MultiFunctionMachine connected successfully via USB.");
    }

    @Override
    public void details() {
        System.out.println("Showing details from both Printer and Scanner:");
        Printer.super.details();  
        Scanner.super.details();  
    } 
}
