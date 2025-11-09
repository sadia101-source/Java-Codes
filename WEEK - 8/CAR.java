package week8;

public class CAR {
    private String model;
    private String color;
    private double price;
    
    public CAR(String model,String color,double price){
        this(model,color);
        this.price=price;
    }
    
    
    public CAR(String model){
        this.model=model;
    }

    public CAR(String model, String color) {
        this(model);
        this.color = color;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    public void display(){
        System.out.println("Model = " + model);
        System.out.println("Color = " + color);
        System.out.println("Price = " + price);
    }  
}