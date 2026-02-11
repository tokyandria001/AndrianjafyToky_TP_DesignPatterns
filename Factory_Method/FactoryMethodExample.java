package Factory_Method;

public class FactoryMethodExample {
    public static void main(String[] args) {
        RocketFactory cargoFactory = new CargoRocketFactory();
        Rocket cargo = cargoFactory.createRocket();
        cargo.launch();

        RocketFactory passengerFactory = new PassengerRocketFactory();
        Rocket passenger = passengerFactory.createRocket();
        passenger.launch();

        RocketFactory explorationFactory = new ExplorationRocketFactory();
        Rocket exploration = explorationFactory.createRocket();
        exploration.launch();
    }
}
