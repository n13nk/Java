public class Square {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    public Square(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public boolean checkForSquare() {
        return ((sideA < sideB + sideC) || (sideB < sideA + sideC) || (sideC < sideA + sideB));
    }
    public double areaOfASquare() {
        int halfPerimeter = (sideA + sideB + sideC) / 2;
        double formula =  Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        if (String.valueOf(formula).equals("NaN")) {
            return 0;
        }else {
            return  formula;
        }
    }

}
