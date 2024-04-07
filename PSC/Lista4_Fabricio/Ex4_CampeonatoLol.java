package Lista4_Fabricio;

/*
Em um campeonato de LOL, enquanto não há a tomada de território, o contador implementado deve contar (que é contabilizado pelo jogo), o número de kills, deaths e 
assists. Se o número de kills for menor ou igual a 5, ele mostra a mensagem “noob”, se chegar a 20 ou mais “master”. Se o número de deaths chegar a 20 ou mais,  
ele mostra a mensagem “Houston, we have a problem”. Se o número de assists chegar a 20 ou mais, é mostrada a mensagem: “team work”. Lembre-se, é uma rotina que 
continua enquanto não houver um vencedor.
*/


import java.util.Random;

public class Ex4_CampeonatoLol {
    public static void main(String[] args) {
        Random pontos = new Random();

        int kills = 0;
        int deaths = 0;
        int assists = 0;

        int deathsTotal = 0;
        int assistsTotal = 0;

        int rodada = 0;

        boolean temVencedor = false;

        System.out.println("CAMPEONATO ");

        
        while (!temVencedor) {
            rodada++;

            kills = pontos.nextInt(1,20);
            deaths = pontos.nextInt(1,20);
            assists = pontos.nextInt(1,20);

            deathsTotal += deaths;
            assistsTotal += assists;

            System.out.println("\nRodada: " + rodada);
            System.out.println("kills\tDeaths\tAssists\tDeaths Total\tAssists Total");
            System.out.println(kills + "\t"+ deaths + "\t" + assists + "\t" + deathsTotal + "\t\t" + assistsTotal);

            if (kills <= 5 && assistsTotal <= 20)
                System.out.println("Noob");
            else if (kills >= 20 && assistsTotal <= 20)
                System.out.println("Master");

            if (deathsTotal >= 20 && assistsTotal <= 20)
                System.out.println("Houston, we have a problem");

            if(assistsTotal >= 20)
            {
                System.out.println("Team work!");
                temVencedor = true;
            } 
        }

    }
}
