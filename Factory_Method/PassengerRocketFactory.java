package Factory_Method;

public class PassengerRocketFactory extends RocketFactory {
    @Override
    public Rocket createRocket() {
        return new PassengerRocket();
    }
}
