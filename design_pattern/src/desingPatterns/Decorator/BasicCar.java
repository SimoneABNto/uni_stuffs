package desingPatterns.Decorator;


public class BasicCar implements Car{

    @Override
    public void assemble() {
        System.out.println("BasicCar");
    }
}
