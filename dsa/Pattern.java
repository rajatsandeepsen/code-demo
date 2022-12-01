public class Pattern {
    public static void main(String[] args) {
        // invertedRightAngleTriangle();
    }

    static void rightAnglePyramid() {
        for (int i = 1; i <= 9; i++) {
            int totalCols = i > 9 / 2 ? 9 - i + 1 : i;
            for (int j = 1; j <= totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightAngleTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedRightAngleTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
