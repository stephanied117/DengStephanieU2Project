public class LinearEquationLogic {
    private String p1;
    private String p2;

    public void getCoordinates(String p1, String p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public int point1() {
        return Integer.parseInt(p1);
    }
    public int point2() {
        return Integer.parseInt(p2);
    }
    public double calcSlope() {
        if ((y2 - y1) % (x1 - x2) == 0) {
            return (double)(y2 - y1)/(x1 - x2);
        }
        if ((y2 - y1) % (x1 - x2) != 0) {
            return (y2 - y1) + "/" + (x1 - x2);
        }
    }

}
