import java.lang.Math;
public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private String p1;
    private String p2;
    public LinearEquation(String p3, String p4, int x3, int y3, int x4, int y4) {
        this.p1 = p3;
        this.p2 = p4;
        this.x1 = x3;
        this.y1 = y3;
        this.x2 = x4;
        this.y2 = y4;
    }

    public double distance() {
        return roundToHundredth(Math.pow(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2), 0.5));
    }

    public double yIntercept() {
        return roundToHundredth(((((y2 - y1) / (x2 - x1)) * x1) - y1));
    }

    public double slope() {
        if (y2 - y1 == 0) {
            return 0;
        }
        if (x2 - x1 == 0) {
            return 0.123456789;
        }
        if ((y2 - y1) % (x2 - x1) == 0) {
            return (y2 - y1) / (x2 - x1);
        }
        return Integer.parseInt(((y2 - y1) + "/" + (x2 - x1)));
    }

    public String equation() {
        if (slope() == 0) {
            return "y = " + yIntercept();
        } else if (slope() == 0.123456789) {
            return "x = " + x1;
        }
        if (yIntercept() > 0) {
            return "y = " + slope() + "x + " + yIntercept();
        } else if (yIntercept() == 0) {
            return "y = " + slope() + "x";
        } else if (yIntercept() < 0) {
            return "y = " + slope() + "x - " + Math.abs(yIntercept());
        }
        return "Line does not exist";
    }

    public String coordinateForX(double x) {
        return "(" + x + ", " + roundToHundredth(slope() * x + yIntercept()) + ")";
    }

    public String lineInfo() {
        return "The two points are: " + p1 + " and " + p2 + "\nThe equation of the line between these points is : " + equation() + "\nThe slope of this line is: " + (y2 - y1) / (x2 - x1) + "\nThe y-intercept of this line is: " + yIntercept() + "\nThe distance between these points is " + distance();
    }

    private double roundToHundredth(double toRound) {
        return ((int)((toRound + 0.005) * 100.0) / 100.0);
    }
}
