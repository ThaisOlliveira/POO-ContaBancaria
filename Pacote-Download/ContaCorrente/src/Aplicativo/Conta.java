package Aplicativo;
public class Conta {
    //Atributos
    public int numconta;
    public String nome;
    public float saldo;
    public float saque;
    public float deposito;
       
    public void status(){
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        
    }
        
    // Métodos
    public void numconta(int v){
        System.out.println("Seu saldo Atual é de: " + this.getSaldo());
    }
    
   public void alterarNome(String nome){
      
   }
       public void saldo(float saldo){
        saldo += saldo;
      }
       
    public void deposito(float v){
           this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito realizado na conta de " + this.getNome()); 
        } 

    
    public void saque(float v){
             if (this.getSaldo () >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na Conta da " + this.getNome());
                System.out.println("Seu novo saldo é de: " + this.getSaldo());
            }else {
                System.out.println("Saldo insuficiente para saque");
                  }
        }       
    
    // Construtor
    public Conta (int numconta, String nome, float saldo) {
        this.numconta = numconta;
        this.nome = nome;
        this.saldo = saldo;
        
    }
    //sobrecarga
    public Conta(int numconta, String nome) {
        this.numconta = numconta;
        this.nome = nome;
        this.saldo = 0;
    }
     public void Conta(int numconta, String nome, float saldo) {
        this.numconta = numconta;
        this.nome = nome;
        this.saldo = saldo;    
    }
   
    public int getnumConta() {
        return numconta;
    }

    public void setnumConta(int numconta) {
        this.numconta = numconta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}


