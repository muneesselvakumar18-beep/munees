abstract class shape{
     abstract double area();
}
    class value extends shape{
        int radius;
        value(int r){
            this.radius=r;
    }
    double area(){
        return 3.14*radius;
    }
    }
    class rect extends shape{
        int n;
        int m;
        rect(int l,int b){
            this.n=l;
            this.m=b;

        }
        double area(){
            return n*m;
        }
        
    }
public class Abstract {
    public static void main(String[]args) {
        value c=new value(6);
        rect v=new rect(5,9);
        System.out.println(c.area());
        System.out.println(v.area());
    }
    
}
