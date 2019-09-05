import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chose = -1;
        StopWatch stopWatch = new StopWatch();
        while (chose != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("StopWatch");
            System.out.println("1: Start Time: ");
            System.out.println("2: End Time: ");
            System.out.println("0: Exits.");
            System.out.println("Chose:");
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("Start Time: " + stopWatch.start());
                    break;
                case 2:
                    System.out.println("Stop Time: " + stopWatch.stop());
                    System.out.println("Elapsed Time: " + stopWatch.getElapsedTime());
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
