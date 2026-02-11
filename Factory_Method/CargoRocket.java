package Factory_Method;

public class CargoRocket implements Rocket {
    @Override
    public void launch() {
        System.out.println("Lancement de la fusée Cargo pour transporter du matériel !");
    }
}
