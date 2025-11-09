package week8;

class FRUIT1{
    private String color;
    private String taste;
    private int price;
    
    
     public FRUIT1(int price){
       this("orange","sour",price); 
    }

    
    public FRUIT1(String color,String taste,int price){
        this.color=color;
        this.taste=taste;
        this.price=price;
    }

    public FRUIT1(String color) {
        this.color = color;
    }
    
   
    public FRUIT1(String taste, int price) {
        this.taste = taste;
        this.price = price;
    }
    
    void setDetails(String color,String taste,int price){
        this.color=color;
        this.taste=taste;
        this.price=price;
    }
    
    void display(){
        System.out.println("Color = " + color);
        System.out.println("Taste = " + taste);
        System.out.println("Price = " + price);
    }
    
}