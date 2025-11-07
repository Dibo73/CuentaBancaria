public class Cuenta1 extends CuentaBancaria {
    public Cuenta1(int saldo, String titular) {
        super(saldo, titular);
    }
    @Override
public void informacion(){
        System.out.println("Saldo del titular "+getTitular()+": "+getSaldo());
    }
    @Override
    public void retirar(int dinero){
        if(getSaldo()>=dinero){
            saldo=getSaldo()-dinero;
            System.out.println("Saldo retirado");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void meter(int dinero){
        saldo=getSaldo()+dinero;
        System.out.println("Saldo depositado");
    }
}

