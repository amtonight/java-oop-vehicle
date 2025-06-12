public class Schiff implements IstSchwimmfaehig, MotorFahrzeug{

    @Override
    public void schwimme() {
        System.out.println("Schiff schwimmt");
    }

    @Override
    public void starte() {
        System.out.println("Schiff startet");
    }

    @Override
    public void stoppe() {
        System.out.println("Schiff stoppt");
    }
}
