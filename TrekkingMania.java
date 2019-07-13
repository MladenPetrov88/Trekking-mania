import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double groups = Double.parseDouble(scanner.nextLine());

        double people = 0;
        double countA = 0;
        double countB = 0;
        double countC = 0;
        double countD = 0;
        double countE = 0;
        for (int i = 1; i <= groups ; i++) {
            double totalPeople = Double.parseDouble(scanner.nextLine());
            people += totalPeople;
            if (totalPeople <= 5) {
                countA += totalPeople;
            } else if (totalPeople > 5 && totalPeople <= 12) {
                countB += totalPeople;
            } else if (totalPeople > 12 && totalPeople <= 25) {
                countC += totalPeople;
            } else if (totalPeople > 25 && totalPeople <= 40) {
                countD += totalPeople;
            } else if (totalPeople > 40) {
                countE += totalPeople;
            }
        }

        System.out.printf("%.2f%%%n", countA / people * 100);
        System.out.printf("%.2f%%%n", countB / people * 100);
        System.out.printf("%.2f%%%n", countC / people * 100);
        System.out.printf("%.2f%%%n", countD / people * 100);
        System.out.printf("%.2f%%", countE / people * 100);
    }
}
