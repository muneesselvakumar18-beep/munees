public class eletriccity {
public static void main(String[] args) {
    int units=100;
    double billAmount=0.0;

    if (units <= 50) {
        billAmount = units * 0.5;
    } else if (units <= 150) {
        billAmount = 25 + (units - 50) * 0.75;
    } else if (units <= 250) {
        billAmount = 100 + (units - 150) * 1.20;
    } else {
        billAmount = 220 + (units - 250) * 1.50;
    }

    System.out.println("Electricity Bill Amount: " + billAmount);


    
    
}
