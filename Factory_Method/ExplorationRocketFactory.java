package Factory_Method;

public class ExplorationRocketFactory extends RocketFactory {
    @Override
    public Rocket createRocket() {
        return new ExplorationRocket();
    }
}
