public class Main {
  public static void main(String[]args) {
      System.out.println(Util.DOLARES);
      System.out.println(Util.EUROS);
      System.out.println(Util.ARGENTINO);
      double pesos;
      pesos = Util.bolivianoPesos(1000);
      System.out.println(pesos);
      double DOLARES;
      DOLARES = Util.dolaresBolivianos(1000);
      System. out.println(DOLARES);
      double EUROS;
      EUROS=Util.eurosBoLivianos(1000);
      System.out.println(EUROS);


  }

}