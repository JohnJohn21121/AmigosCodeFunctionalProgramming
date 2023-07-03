public class Printer <T>{

    T integerToPrint;

    public Printer(T integerToPrint) {
        this.integerToPrint = integerToPrint;
    }

    public void print(){
        System.out.println(integerToPrint);
    }

}
