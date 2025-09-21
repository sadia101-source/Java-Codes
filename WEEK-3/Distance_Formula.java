package week_3;

public class Distance_Formula {
    public static void main (String [] args){
        int x1 = 5;
        int x2 = 7;
        int y1 = 4;
        int y2 = 9; //sqrt((x1-x2)^2 + (y1-y2)^2)
        
        double distance = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        System.out.println(distance);
    }
    
}