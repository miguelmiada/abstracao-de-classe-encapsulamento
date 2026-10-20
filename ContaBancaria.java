public class ContaBancaria {

    private double saldo;
    private final double chequeEspecial; 
    private double qntUsadaDoCheque = 0;

    public ContaBancaria(double depositoInicial){


         if (depositoInicial < 0) {
      throw new IllegalArgumentException("Depósito inicial inválido");
  }

        this.saldo = depositoInicial; 

        if (depositoInicial <= 500){
            chequeEspecial = 50;
         }
             else {
                chequeEspecial = depositoInicial * 0.5;
             
         }
    }
    
    public double consultarSaldo(){
        return saldo;
    }

    public double consultarChequeEspecial(){
        return chequeEspecial;
    }

    public boolean estaUsandoChequeEspecial(){
        return saldo < 0;
    }

    public void depositar (double valor){
        if (valor <= 0){
            System.out.println("Deposite valor maior que 0");
            return;
        } else {
            saldo += valor; 
        }
    }

    private boolean debitar (double valor){


        var limiteTotal = saldo + chequeEspecial;
        if (valor <= 0 ){
             System.out.println("Valor invalido");
             return false;
        }
        if(valor > limiteTotal) {
             System.out.println("Valor maior que o limite total");
             return false; 
        }  
            saldo -= valor;
            return true; 
    
    }

    public void sacar(double valor){
        if (debitar(valor)){
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saque NÃO realizado");
        }
    }


    public void pagarBoleto(double valor){
        if (debitar(valor)){
            System.out.println("Boleto pago");
        } else {
            System.out.println("Boleto NÃO pago");
        }
    }




}

