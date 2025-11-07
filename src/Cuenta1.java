public class Cuenta1 extends CuentaBancaria {
    public Cuenta1(int saldo, String titular) {
        super(saldo, titular);
    }
    //superpone este metodo al de la clase main
    @Override
public void informacion(){
        System.out.println("Saldo del titular "+getTitular()+": "+getSaldo());
    }
    //en este metodo si que se interactua con el saldo de la cuenta
    @Override
    public void retirar(int dinero){
        if(getSaldo()>=dinero){
            saldo=getSaldo()-dinero;
            System.out.println("Saldo retirado");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    //en este metodo si que se interactua con el saldo de la cuenta
    @Override
    public void meter(int dinero){
        saldo=getSaldo()+dinero;
        System.out.println("Saldo depositado");
    }
}

