package ilkProje;

public class Ucgen extends Sekil{

   @Override
    public int ucgenCevre(int a, int b, int c) {

        System.out.println("Ucgen Cevre : " + (a + b + c));

        return a + b + c;
    }

    @Override
    public void ucgenAlan(double a, double b, double c) {

      System.out.println("Ucgen alan : " + Math.sqrt((Runner.ucgenCevre / 2)*(Runner.ucgenCevre / 2-a)*(Runner.ucgenCevre / 2-b
      )*(Runner.ucgenCevre / 2-c)));
    }
}
