import java.util.Scanner;
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
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        System.out.println("(.//c//.) <(Welcome!)");
        point1();
        point2();
        getCoordinates1();
        getCoordinates2();
        LinearEquation more = new LinearEquation(p1, p2, x1, y1, x2, y2);
        more.distance();
        more.slope();
        more.yIntercept();
        more.equation();
        System.out.println(more.lineInfo());
        System.out.println("(*//o//*) <(Enter an x value!)");
        double xVal = scan.nextFloat();
        scan.nextLine();
        System.out.println("(o//w//o) <(" + more.coordinateForX(xVal) + ")");
        System.out.println("(.//c//.) <(Wanna go for another round? Answer with yay or nay!)");
        String answer = scan.nextLine();
        while (end = false) {
            while (!(answer.equals("nay")) || !(answer.equals("nay"))) {
                if (answer.equals("nay")) {
                    end = true;
                } else if (answer.equals("yay")) {
                    end = false;
                    start();
                } else if (!(answer.equals("nay")) || !(answer.equals("nay"))) {
                    System.out.println("(!//C//!) <(Your answer sucks. Answer with yay or nay!)");
                    answer = scan.nextLine();
                }
            }
        }

        }

    private boolean coordinateFormat(String coord) {
        if (!(coord.substring(0,1).equals("("))) {
            return false;
        }
        if (!(coord.substring(coord.length() - 1, coord.length()).equals(")"))) {
            return false;
        }
        if (!(coord.contains(", "))) {
            return false;
        }
        return true;
    }


    private void point1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("(u//c//u) <(Please enter a coordinate point!) ");
        String pointA = scan.nextLine();
        p1 = pointA;
        while (!coordinateFormat(p1)) {
            System.out.println("(Q//C//Q) <(You are using an INCORRECT format. Please follow the (int1, int2) format! Ex: (1, 2).)");
            pointA = scan.nextLine();
            p1 = pointA;
        }
    }
    private void point2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("(u//c//u) <(Please enter another coordinate point!) ");
        String pointB = scan.nextLine();
        p2 = pointB;
        while (!coordinateFormat(p2)) {
            System.out.println("(Q//C//Q) <(You are using an INCORRECT format. Please follow the (int1, int2) format! Ex: (1, 2).)");
            pointB = scan.nextLine();
            p2 = pointB;
        }
    }

    private void getCoordinates1() {
        String temp1 = p1.substring(1, p1.indexOf(", "));
        String temp2 = p1.substring(p1.indexOf(", ") + 2, p1.indexOf(")"));
        x1 = Integer.parseInt(temp1);
        y1 = Integer.parseInt(temp2);
    }

    private void getCoordinates2() {
        String temp3 = p2.substring(1, p2.indexOf(", "));
        String temp4 = p2.substring(p2.indexOf(", ") + 2, p2.indexOf(")"));
        x2 = Integer.parseInt(temp3);
        y2 = Integer.parseInt(temp4);
    }

}