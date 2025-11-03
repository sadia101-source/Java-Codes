package week_9;

public class Department extends Faculty{
    String deptName;
    
    Department(String name, int rank, String facName, String b){
        super(name, rank, facName);
        this.deptName = b;
    }
    
    void display(){
        System.out.println("Dept. Name: " + deptName);
    }
    
    void Details(){
        super.details();
        this.display();
    }
}