import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount = inputAmount();

        String unit = inputUnit();

        double downloadSpeed = inputSpeed();

        Data dataObject = new Data(amount, unit, downloadSpeed);

        String outputString = dataObject.toString();

        System.out.println(outputString);
    }

    public static double inputAmount() {
        //Build a scanner
        Scanner scanner = new Scanner(System.in);
        //Prompt and store double amount
        System.out.println("Enter the amount of data in number form: ");
        double amount = scanner.nextDouble();

        return amount;
    }

    public static String inputUnit() {
        Scanner scanner = new Scanner(System.in);
        //Prompt and store String unit
        System.out.println("Enter the unit of data (bytes, kilobytes, megabytes, gigabytes): ");
        String unit = scanner.nextLine();

        return unit;
    }

    public static double inputSpeed() {
        Scanner scanner = new Scanner(System.in);
        //Prompt and store download speed (in megabits
        System.out.println("Enter download speed (in megabits): ");
        double downloadSpeed = scanner.nextDouble();

        return downloadSpeed;
    }
}
