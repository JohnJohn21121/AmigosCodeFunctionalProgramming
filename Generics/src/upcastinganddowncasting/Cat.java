package upcastinganddowncasting;

public class Cat extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Miau");
    }

    public void ronronear(){
        System.out.println(":3 purrr ");
    }
}
