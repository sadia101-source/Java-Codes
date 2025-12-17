class Operations{
    void minMaxAdd(int a, int b, int c){
        int min, max, sum;
        min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        
        sum = a + b + c;
        System.out.println("Integers:");
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Sum = " + sum);
        System.out.println();
    }
    
    void minMaxAdd(double a, double b, double c){
        double min, max, sum;

        min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        sum = a + b + c;

        System.out.println("Real Numbers:");
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Sum = " + sum);
        System.out.println();
    }
    
    void minMaxAdd(char a, char b, char c){
        char min, max;
        int sum;
        
        min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        
        max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        
        sum = a + b + c;

        System.out.println("Characters:");
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Sum (ASCII values) = " + sum);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Operations op = new Operations();
        op.minMaxAdd(10, 5, 20);
        op.minMaxAdd(2.5, 5.5, 1.5);
        op.minMaxAdd('A', 'C', 'B');
    }
}


