import Transport.Car;

public class Main {
    public static void main(String[] args) {

        //Задание 1, 2
        System.out.println("\nЗадание 1, 2\n");

        Car car8 = new Car("BMW", "Z8", "черный", 3.0f, 2021, "Германия",
                "автомат", "родстер", 123456, 2, true,
                true, true);

        System.out.println(car8);

        car8.changeTyres(6); //Метод «сменить шины на сезонные»
        System.out.println(car8);

    }
}