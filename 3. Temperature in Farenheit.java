import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Temperature in Degree : ");
        int d = sc.nextInt();
        double f = (d * 9/5) + 32;
        System.out.print("Temperature in Farenheit : " + f);
    }
}