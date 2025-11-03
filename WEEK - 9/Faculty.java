package week_9;

public class Faculty extends Uni {
    String facName;
    
    Faculty(String name, int rank, String a){
        super(name, rank);
        this.facName = a;
    }
    
    void details(){
        System.out.println("University name: " + super.name);
        System.out.println("University ranking: " + super.rank);
        System.out.println("Faculty name: " + facName);
    }
}
