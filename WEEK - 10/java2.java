package week_10;

class ObjectOriented {
    void abstraction() {
        System.out.println("Abstraction: Hiding internal details and showing only essential features.");
    }

    void polymorphism() {
        System.out.println("Polymorphism: One name, many forms (method overloading and overriding).");
    }

    void inheritance() {
        System.out.println("Inheritance: Acquiring properties and methods from another class.");
    }
}

class JavaLanguage extends ObjectOriented {
    void persistence() {
        System.out.println("Persistence: Storing data for long-term use, like saving objects in databases.");
    }

    void interfaces() {
        System.out.println("Interfaces: A way to achieve abstraction and multiple inheritance in Java.");
    }
}

class CPlusPlus extends ObjectOriented {
    void templateMethod() {
        System.out.println("Template: Enables generic programming in C++.");
    }

    void friendFunction() {
        System.out.println("Friend Function: Allows access to private members of a class.");
    }
}

public class java2 {
    public static void main(String[] args) {
        System.out.println("JavaLanguage Object");
        JavaLanguage java = new JavaLanguage();
        java.abstraction();
        java.polymorphism();
        java.inheritance();
        java.persistence();
        java.interfaces();

        System.out.println("\nCPlusPlus Object");
        CPlusPlus cpp = new CPlusPlus();
        cpp.abstraction();
        cpp.polymorphism();
        cpp.inheritance();
        cpp.templateMethod();
        cpp.friendFunction();
    }
}
