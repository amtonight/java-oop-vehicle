public class Coupe extends Auto{
    public Coupe(int p, String f) {
        super(p, f);
    }

    @Override
    public void fahre() {
        System.out.println("Coupe rast...");
    }
}
