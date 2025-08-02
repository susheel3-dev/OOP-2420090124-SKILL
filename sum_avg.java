import java.util.Scanner;

public class sum_avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        double average = (double) sum / parts.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
