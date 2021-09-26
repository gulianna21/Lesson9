public class Main {
    public static void checkMassLength(String[][] mass) throws MyArraySizeException {
        if (mass.length != 4 || mass[0].length != 4) {
            throw new MyArraySizeException("Неверная длина массива");
        }
        System.out.println("Длина массива правильная");
    }

    public static int findSummElementInMass(String[][] mass) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < mass.length ; i++) {
            for (int j = 0; j < mass[i].length ; j++) {
                try {
                    sum += Integer.parseInt(mass[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("нельзя преобразовать ячейку " + i + " " + j);
                }
            }
        }
        return sum;
    }

    public static String[][] newMass(String[][] mass){
        for (int i = 0; i < mass.length ; i++) {
            for (int j = 0; j <mass[i].length ; j++) {
                mass[i][j] = String.valueOf(i + j);
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
        return mass;
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] mass = new String[4][4];

        checkMassLength(mass);
        int summ = findSummElementInMass(newMass(mass));
        System.out.println(summ);
    }
}
