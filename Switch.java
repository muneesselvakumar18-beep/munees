
import java.util.Scanner;
public class Switch {
    public static void main(String[] agrs){
         Scanner input = new Scanner(System.in);
         int a= input.nextInt();
         int b= input.nextInt();
         char cal = input.next().charAt(0);
         switch(cal){
            case '+':
            int  add = a+b;
            System.out.println("addition:"+add);
            break;
        case '-':
            int sub =a-b;
            System.out.println("subraction:"+sub);
            break;
        case '*':
           int mul=a*b;
           System.out.println("multiplication:"+mul);
           break;
         case '/':
            int div=a/b;
            System.out.println("division:"+div);
            break;
         default: 
            System.out.println("Wrong values");
            break;  


         }




   
    }

    
}
