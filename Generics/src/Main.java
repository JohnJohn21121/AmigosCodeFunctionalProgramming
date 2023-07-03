public class Main {
    public static void main(String[] args) {

        Printer<Integer> printer = new Printer(23);
        printer.print();

        int[] myArray ={1,2,4,5,7,9,11};
        System.out.println( binarySearch(myArray,9));
    }

    private static int binarySearch(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int middleposition = (low + high) / 2;
            int middleNumber = numbers[middleposition];

            if (numberToFind == middleNumber) {
                return middleposition;
            }
            if (numberToFind < middleNumber) {
                high = middleposition - 1;
                //Aqui como ya se asume que el numero a encontrar es mayor que
                //el presente, no es necesario escribir el otro if ya que es un caso Binario
            }else {
                low = middleposition+1;
            }
        }
        return -1;
    }

    private static <T> void shout(T thingsToshout) {
        System.out.println(thingsToshout + "!!!!!");

    }
}