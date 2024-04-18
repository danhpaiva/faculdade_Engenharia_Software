import java.util.Scanner;
import java.util.ArrayList;

public class Ex1_Temperaturas{
    public static class TemperaturaMensal
    {
        String mes;
        float temperatura;

        public TemperaturaMensal (String mes, float temperatura)
        {
            this.mes = mes;
            this.temperatura = temperatura;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<TemperaturaMensal> temperaturas = new ArrayList<>();
        ArrayList<String> meses = new ArrayList<>();
        meses.add("1 - Janeiro");
        meses.add("2 - Fevereiro");
        meses.add("3 - Marco");
        meses.add("4 - Abril");
        meses.add("5 - Maio");
        meses.add("6 - Junho");
        meses.add("7 - Julho");
        meses.add("8 - Agosto");
        meses.add("9 - Setembro");
        meses.add("10 - Outubro");
        meses.add("11 - Novembro");
        meses.add("12 - Dezembro");

        Float somaTemperaturas = 0.0f;
        Float mediaTemperaturas = 0.0f;

        System.out.println("Informe as temperaturas medias dos meses do ano: ");
        for (int i = 0; i < 12; i++) {
            temperaturas.add(new TemperaturaMensal(meses.get(i), input.nextFloat()));
        }

        for (int i = 0; i < 12; i++) {
            somaTemperaturas += temperaturas.get(i).temperatura;
        }

        mediaTemperaturas = somaTemperaturas / temperaturas.size();

        for (int i = 0; i < temperaturas.size(); i++) 
        {
            if(temperaturas.get(i).temperatura >= mediaTemperaturas)
            {
                System.out.println(temperaturas.get(i).mes + ": " +  temperaturas.get(i).temperatura + "Cº");
            }
        }

        input.close();
    }

}