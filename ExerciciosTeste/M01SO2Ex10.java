import java.util.Scanner;

public class M01SO2Ex10 {
    public static void main(String[] args) {

        Scanner palav = new Scanner(System.in);

        System.out.println("Digite uma palavra:");

        String palavra = palav.nextLine();
        String palindromo = "";

        for(int i = palavra.length() -1; i >= 0; i--){

            palindromo += palavra.charAt(i);

        }

        if(palindromo.equals(palavra)) {
        System.out.print("A palavra" +palavra+ "é um palíndromo!"  + palindromo);
        }
        else {
            System.out.print("A palavra" + palavra + "não é um palíndromo!"  + palindromo);

        }
    }
}

