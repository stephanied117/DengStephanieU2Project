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

    public LinearEquation(int x3, int y3, int x4, int y4) {
        this.x1 = x3;
        this.y1 = y3;
        this.x2 = x4;
        this.y2 = y4;
    }

    public double distance() {
        return roundToHundredth(Math.pow(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2), 0.5));
    }

    public double yIntercept() {
        if (x2 - x1 == 0) {
            yInterceptOrganizer();
        } else {
            return y1 - (((y2 - y1) / (x2 - x1)) * x1);
        }
        return 000000;
    }

    private String yInterceptOrganizer() {
        String dne = "Does not exist.";
        return (dne);
    }

    public String slope() {
        if (y2 - y1 == 0) {
            return "0";
        }
        if (x2 - x1 == 0) {
            return "undefined";
        }
        if ((y2 - y1) / (x2 - x1) == -1) {
            return "-";
        }
        if ((y2 - y1) % (x2 - x1) == 0) {
            if ((y2 - y1) / (x2 - x1) == 1) {
                return "";
            }
            return Integer.toString((y2 - y1) / (x2 - x1));
        }
        return slopeOrganizer(y2-y1, x2-x1, "/");
    }

    private String slopeOrganizer(int yDif, int xDif, String slash) {
        if (yDif > 0 && xDif > 0) {
            return yDif + slash + xDif;
        } else if (yDif < 0 && xDif < 0) {
            return Math.abs(yDif) + slash + Math.abs(xDif);
        } else if (yDif > 0 && xDif < 0) {
            return -1 * (yDif) + slash + Math.abs(xDif);
        }
        return yDif + slash + xDif;
    }

    public String equation() {
        if (slope().equals("0")) {
            return "y = " + yIntercept();
        } else if (slope().equals("undefined")) {
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
        if (x2 - x1 ==0) {
            if (x > x1 || x < x1) {
                CoordOrganizer();
            }
        } else {
            return "(" + x + ", " + roundToHundredth((double) (y2 - y1) / (x2 - x1) * x + yIntercept()) + ")";
        }
        return CoordOrganizer();
    }

    private String CoordOrganizer() {
        String xx = "The point does not exist on the line!";
        return xx;
    }

    public String lineInfo() {
        if (x2 - x1 == 0) {
            return "The two points are: " + p1 + " and " + p2 + "\nThe equation of the line between these points is : " + equation() + "\nThe slope of this line is: undefined\nThe y-intercept of this line is: " + yIntercept() + "\nThe distance between these points is " + distance() + "\"";
        }
        return "The two points are: " + p1 + " and " + p2 + "\nThe equation of the line between these points is : " + equation() + "\nThe slope of this line is: " + roundToHundredth((double)(y2 - y1) / (x2 - x1)) + "\nThe y-intercept of this line is: " + yIntercept() + "\nThe distance between these points is " + distance() + "\"";
    }

    private double roundToHundredth(double toRound) {
        return ((int)((toRound + 0.005) * 100.0) / 100.0);
    }
}
