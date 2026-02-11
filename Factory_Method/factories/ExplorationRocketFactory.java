package Factory_Method.factories;

import Factory_Method.rockets.ExplorationRocket;
import Factory_Method.rockets.Rocket;

public class ExplorationRocketFactory extends RocketFactory {
    @Override
    public Rocket createRocket() {
        return new ExplorationRocket();
    }
}
