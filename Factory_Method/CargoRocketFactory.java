package Factory_Method;

public class CargoRocketFactory extends RocketFactory {
    @Override
    public Rocket createRocket() {
        return new CargoRocket();
    }
}
