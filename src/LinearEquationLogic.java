import java.util.Scanner;
public class LinearEquationLogic {
    private String p1;
    private String p2;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! \nPlease enter a coordinate point: ");
        LinearEquation point = new LinearEquation();
        String pointA = scan.nextLine();
        System.out.println("Please enter another coordinate point: ");
        String pointB = scan.nextLine();
        getCoordinates(pointA, pointB);

    }

    public void getCoordinates(String pointA, String pointB) {
        p1 = pointA;
        p2 = pointB;
    }
    public void point1() {
        int letter = 0;
        while (!p1.substring(letter, letter + 1).contains(",")) {
            letter ++;
        }
        x1 = Integer.parseInt(p1.substring(1,letter - 1));
        y1 = Integer.parseInt(p1.substring(letter + 2, p1.length() - 1));
    }
    public void point2() {
        int letters = 0;
        while (!p2.substring(letters, letters + 1).contains(",")) {
            letters ++;
        }
        x2 = Integer.parseInt(p2.substring(1,letters - 1));
        y2 = Integer.parseInt(p2.substring(letters + 2, p2.length() - 1));
    }
    public double calcSlope() {
        if ((y2 - y1) % (x2 - x1) == 0) {
            return (y2 - y1) / (x2 - x1);
        }
        return 0;
        /*
        return (y2 - y1) + "/" + (x2 - x1);
         */
    }

}
