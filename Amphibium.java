public class Amphibium extends Auto implements MotorFahrzeug, IstSchwimmfaehig{

    public Amphibium(int p, String f) {
        super(p, f);
    }


    @Override
    public void fahre() {
        System.out.println("Amphi fährt");

    }

    @Override
    public void schwimme() {
        System.out.println("Amphi schwimmt");
    }
}
