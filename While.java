import java.util.scanner;
public class while{
    public static void main(string[]args){
        scanner sc= new scanner(system.in);
        int num= sc.nextint();
int count=0;
while(num>0){
    count++;
    num/=10;
}
System.out.println("Number of digits: " + count);

    }

} 