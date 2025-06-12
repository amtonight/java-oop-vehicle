public abstract class Auto implements MotorFahrzeug{

   private int ps;
   private String farbe;


   public Auto(int p, String f){
       ps=p;
       farbe = f;


   }

   abstract public void fahre();

   public void starte(){
       System.out.println("Auto startet");
   }

   public void stoppe(){
       System.out.println("Auto stoppt!");
   }

}
