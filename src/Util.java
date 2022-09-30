public class Util{
    public static final double DOLARES = 6.96;
    public static final double EUROS=6.73;
    public static final double ARGENTINO=21.33;
    public static double bolivianoPesos(double bolivianos){
        return bolivianos*ARGENTINO;
    }
   public static double dolaresBolivianos(double Bolivianos){
        return Bolivianos*DOLARES;
   }
   public static double eurosBoLivianos(double boLivianos){
        return boLivianos*EUROS;
   }
}
