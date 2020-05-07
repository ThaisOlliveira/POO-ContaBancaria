package Aplicativo;
import java.util.Scanner;
public class Aplicativo {

    public static void main(String[] args){
        
        Conta cc = new Conta(123, "Thais", 3500); //Cadastrando uma Conta no nome de Thais e o Saldo dela

        // Mostra o Deposito realizado
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do deposito? ");
        float v = sc.nextFloat();
        cc.deposito(v);
        */
        
        // Saque - Retorna o Saldo atualizado
        cc.status(); // Retorna Número da Conta, Nome e o Saldo
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor do saque? ");
        float v = sc.nextFloat();
        cc.saque(v);
           
        // Mostra o saldo pelo Número da conta
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o Número da Conta? ");
        int v = sc.nextInt();
        System.out.println("Conta da: "+cc.getNome());
        cc.numconta(v);
        */
    }
    
}

   

