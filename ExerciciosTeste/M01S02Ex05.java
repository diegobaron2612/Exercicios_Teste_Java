public class M01S02Ex05 {

    public static void main(String[] args) {
        Integer maior = null;
        Integer menor = null;
        Integer numero[][] = {
                {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47},
                {1},
                {1, -1},
                {null},
                {-2,-2,-2,-2},
                {20,10, 30},
        };
        for (int i = 0; i< numero.length;i++) {
            menor= numero[i][0];
            maior= numero[i][0];
            for (int j =0; j<numero[i].length;j++) {
                if (numero[i][j] == null)
                {
                    System.out.println("não e possivel calcular");
                    continue;
                };
                if ( maior < numero[i][j]) {
                    maior =numero[i][j];
                }
                if(menor > numero[i][j]){
                    menor = numero[i][j];
                }
            }
            System.out.println(String.format("o maior nuemro é:%d e o menor numero é %d",maior,menor));

        }

    }

}
