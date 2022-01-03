import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersSum = 0;
        int numbersCount = 0;
        while (true) {
            int nextNumber = scanner.nextInt();
            if (nextNumber == 0) {
                break;
            }
            numbersSum += nextNumber;
            numbersCount++;
        }
        int average = numbersSum / numbersCount;
        System.out.println(average);
    }
}
