import java.util.Scanner;
import java.lang.Math;
public class LinearEquationLogic {
    private String p1;
    private String p2;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private boolean correct;

    public LinearEquationLogic() {
    }

    public void start() {
        /*
        System.out.println("(.//c//.) <(Welcome!)");
        point1();
        point2();
        getCoordinates1();
        getCoordinates2();
        LinearEquation more = new LinearEquation(x1, y1, x2, y2);
        System.out.println(lineInfo());
        System.out.println("(*////*) <(Enter an x value!)");

    }

    public boolean coordinateFormat1() {
        if (!(p1.substring(0,1).equals("("))) {
            return correct = false;
        }
        if (!(p1.substring(p1.length() - 1, p1.length()).equals(")"))) {
            return correct = false;
        }
        if (!(p1.contains(", "))) {
            return correct = false;
        }
        return correct = true;
    }

    public boolean coordinateFormat2() {
        if (!(p2.substring(0,1).equals("("))) {
            return correct = false;
        }
        if (!(p2.substring(p2.length() - 1, p2.length()).equals(")"))) {
            return correct = false;
        }
        if (!(p2.contains(", "))) {
            return correct = false;
        }
        return correct = true;
    }

    public void point1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("(u//c//u) <(Please enter a coordinate point!) ");
        String pointA = scan.nextLine();
        p1 = pointA;
        coordinateFormat1();
        while (correct = false) {
            System.out.println("(Q//C//Q) <(You are using an INCORRECT format. Please follow the (int1, int2) format! Ex: (1, 2).)");
            pointA = scan.nextLine();
            p1 = pointA;
        }
    }
    public void point2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("(u//c//u) <(Please enter another coordinate point!) ");
        String pointB = scan.nextLine();
        p2 = pointB;
        coordinateFormat2();
        while (correct = false) {
            System.out.println("(Q//C//Q) <(You are using an INCORRECT format. Please follow the (int1, int2) format! Ex: (1, 2).)");
            pointB = scan.nextLine();
            p2 = pointB;
        }
    }

    public void getCoordinates1() {
        int letter = 0;
        while (!p1.substring(letter, letter + 1).contains(",")) {
            letter ++;
        }
        x1 = Integer.parseInt(p1.substring(1, letter));
        y1 = Integer.parseInt(p1.substring(letter + 2, p1.length() - 1));
    }

    public void getCoordinates2() {
        int letter = 0;
        while (!p2.substring(letter, letter + 1).contains(",")) {
            letter ++;
        }
        x2 = Integer.parseInt(p2.substring(1,letter - 1));
        y2 = Integer.parseInt(p2.substring(letter + 2, p2.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println("(.//c//.) <(Welcome!)");

        LinearEquationLogic yay = new LinearEquationLogic(x1, y1, x2, y2);
        yay.point1();
        yay.point2();
        yay.getCoordinates1();
        yay.getCoordinates2();
        LinearEquation more = new LinearEquation(x1, y1, x2, y2);
        System.out.println(more.lineInfo());
        System.out.println("(*//o//*) <(Enter an x value!)");
    }
}
