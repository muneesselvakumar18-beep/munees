import java.util.Scanner;
public class StudentDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        double percentage = sc.nextDouble();
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("percentage:" + percentage);
    }
}
