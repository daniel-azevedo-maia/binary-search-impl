public class Main {
    public static void main(String[] args) {
        int[] array = {6, 7, 8, 9, 10, 11, 14, 15, 16, 17, 19, 22, 23, 25, 28, 30};

        int numeroProcurado = 19;
        int resultado = binarySearch(array, numeroProcurado, 0, array.length - 1);

        if (resultado != -1) {
            System.out.println("Número encontrado no índice: " + resultado);
        } else {
            System.out.println("Número não encontrado.");
        }
    }

    private static int binarySearch(int[] array, int numeroProcurado, int start, int end) {
        if (start > end) {
            return -1;
        }

        int indiceMeio = (start + end) / 2;

        if (array[indiceMeio] == numeroProcurado) {
            return indiceMeio;
        }

        if (numeroProcurado < array[indiceMeio]) {
            return binarySearch(array, numeroProcurado, start, indiceMeio - 1);
        }

        return binarySearch(array, numeroProcurado, indiceMeio + 1, end);
    }
}
