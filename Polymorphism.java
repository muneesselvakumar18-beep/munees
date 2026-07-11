class Calculator{ 
    int add(int num1,int num2){
        return num1+num2;
    }
    int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    double add(double num1,double num2){
        return num1+num2;
    }
}
    public class Polymorphism {
      public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(10.5,20.5));  
    
}
    }