public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    public Triangle(int sideA, int sideB, int sideC ) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public boolean checkForTriangle() {
        return ((sideA < sideB + sideC) || (sideB < sideA + sideC) || (sideC < sideA + sideB));
    }

    public int largestAngle() {
        double alfa = ((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC));
        double betta = ((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB));
        double gamma = ((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideC * sideB));

        double angleA = 180 - (Math.acos(alfa) * (180 / Math.PI));
        double angleB = 180 - (Math.acos(betta) * (180 / Math.PI));
        double angleC = 180 - (Math.acos(gamma) * (180 / Math.PI));

        int maxDitForTwo = Math.max((int) angleA, (int) angleB);
        return Math.max(maxDitForTwo, (int) angleC);

    }
}
