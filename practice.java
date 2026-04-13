import java.util.Scanner;
class practice {
    void display() {
        System.out.println("Testing...");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Validity:");
        boolean validity = scanner.nextInt() == 1;
        System.out.println("Enter Status Code:");
        int statusCode = scanner.nextInt();
        anotherone obj = new anotherone(validity, statusCode);
        System.out.println("Is Valid: " + obj.getValid());
        System.out.println("Status Code: " + obj.getStatuscode());
        System.out.println("Message: " + obj.getMessage());
        
        arithmeticunit ALU = new arithmeticunit(6, 7);
    }
}