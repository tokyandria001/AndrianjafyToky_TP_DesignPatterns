package Factory_Method;

public class PassengerRocket implements Rocket {
    @Override
    public void launch() {
        System.out.println("Lancement de la fusée Passagers pour transporter des astronautes !");
    }
}
