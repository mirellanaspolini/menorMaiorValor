import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        int contador=0,menorNum=0, maiorNum=0;
        int[] listaNumeros = new int[10];
        Scanner leitor = new Scanner(System.in);
        
        for (int i=0; i<listaNumeros.length; i++){
            System.out.println("Digite um número:");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
        }
        for(int i=0; i<listaNumeros.length; i++){
            if (listaNumeros[i] > maiorNum){
                maiorNum = listaNumeros[i];
                if (contador == 0){
                    menorNum = listaNumeros[i];    
                }  
            }else {
                if (listaNumeros[i] < menorNum){
                    menorNum = listaNumeros[i];
                }
            }
            contador++;            
        }
        System.out.println("Menor número: "+menorNum);
        System.out.println("Maior número: "+maiorNum);

        leitor.close();
    }
}
