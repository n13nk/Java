public class Cell {
    private static int [] mass = new int[3];
    public Cell(String firstDit, String secondDit, String thirdDit) {
        if (firstDit.isEmpty()) {
            mass[0] = 0;
        } else {
            int first = Integer.parseInt(firstDit);
            mass[0] = first;
        }

        if (secondDit.isEmpty()) {
            mass[1] = 0;
        } else {
            int second = Integer.parseInt(secondDit);
            mass[1] = second;
        }

        if (thirdDit.isEmpty()) {
            mass[2] = 0;
        } else {
            int third = Integer.parseInt(thirdDit);
            mass[2] = third;
        }
    }
    public static boolean checkForEmptyCell() {
        int check = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                check += i + 1;
            }
        }
        if (mass[0] == 0) {
            if (mass[1] == 0) {
                mass[0] = mass[2];
                mass[1] = mass[2];
            } else {
                mass[0] = mass[2];
            }
        }
        if (mass[1] == 0) {
            if (mass[2] == 0) {
                mass[1] = mass[0];
                mass[2] = mass[0];
            } else {
                mass[1] = mass[0];
            }
        }
        if (mass[2] == 0) {
            if (mass[0] == 0) {
                mass[0] = mass[1];
                mass[2] = mass[1];
            } else {
                mass[2] = mass[0];
            }
        }

        return (check > 0);

    }

    public static void smallestNumber() {
        int dit1 = mass[0];
        int dit2 = mass[1];
        int dit3 = mass[2];
        int lesserNumber = Math.min(dit1, dit2);
        int dit5 = Math.min(lesserNumber, dit3);
        mass[0] = dit5;
        mass[1] = dit5;
        mass[2] = dit5;
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < mass.length; i++) {
            result += mass[i] + " ";
        }
        return result;
    }
}