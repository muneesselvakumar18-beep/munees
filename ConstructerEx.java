class Constructor{
//properties
    String name;//instance variable
    int rollNo;
    //constructer
    Student(){
        name="default name";
        rollNo=12;
    }
    //parameterized constructer
    Student(String name,int rollNo){//local variable
        this.name=name;
        this.rollNo=rollNo;
    }
    //behaviour
    void sleep(){
        System.out.print(name+"sleeping");
    }

}
public class ConstructerEx {
    public static void main(String[] args) {
        Student student1=new Student("thiru",roll:47);
        Student student2=new Student();
        student1 sleep();
        System.out.print(sleep);

        
    }
    
}