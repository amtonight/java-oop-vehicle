public class Cabrio extends Auto{

    
    public Cabrio(int p, String f) {
        super(p, f);
    }

    @Override
    public void fahre(){
        System.out.println("Cabrio fährt langsam");

    }
    public void oeffneDach(){
        System.out.println("Kurbelt Dach auf");
    }
}
