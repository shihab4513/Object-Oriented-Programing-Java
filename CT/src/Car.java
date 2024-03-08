public class Car {
    double distance;
    double fuel;
    public Car(double d,double f){
        distance=d;
        fuel =f;

    }
    void getMilage(){
        System.out.println("Milage of the car is:");
        System.out.println(distance/fuel);
    }
    void getCost(){
        System.out.println("Cost of fuel is:");
        System.out.println(fuel*4);
    }
}

