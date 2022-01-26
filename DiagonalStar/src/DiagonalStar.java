public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {

                for (int col = 1; col <= number; col++) {

                    if ((col == 1) || (col == number) || (row == 1) || (row == number) ||
                            (row == col) || (((row + col) - 1) == number)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }

        }
    }
    }

