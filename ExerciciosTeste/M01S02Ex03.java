public class M01S02Ex03 {
    public static void main(String[] args) {
        int[] extrato = {100,-35,-15,-5,55,-20};
        int saldo = 0;

        for (int i = 0;i< extrato.length;i++ ){
            System.out.print(extrato[i] + " , ");
            saldo += extrato[i];
        }
        System.out.println(" ");
        for (int i = (extrato.length -1);i>= 0;i-- ){
            System.out.print(extrato[i]+" , ");
        }
        System.out.println(" ");
        System.out.println(String.format("o valor na conta é: %d Reais", saldo));
        if (saldo >= 0){
            System.out.println("Saldo positivo");
        }else System.out.println("saldo negativo");
    }
}
