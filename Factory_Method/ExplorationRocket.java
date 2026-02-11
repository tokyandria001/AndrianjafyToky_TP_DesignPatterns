package Factory_Method;

public class ExplorationRocket implements Rocket {
    @Override
    public void launch() {
        System.out.println("Lancement de la fusée Exploration pour une mission scientifique !");
    }
}
