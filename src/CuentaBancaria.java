import java.util.Scanner;

public class CuentaBancaria {
    int saldo;
    String titular;

    public CuentaBancaria(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
//get y set de salfo
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
//get y set de titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
//metodo que muestra la informacio, es cambiado por la clase Cuenta 1
    public void informacion(){
        System.out.println("No hay datos");
    }
    //metodo que retira dinero de la cuenta, es cambiado por la clase Cuenta 1
    public void retirar(int dinero){
        System.out.println("No hay dinero");
    }
    //metodo que deposita dinero el na cuenta, es cambiado por la clase Cuenta 1
    public void meter(int dinero){
        System.out.println("No hay cuenta");
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1=new Cuenta1(0, "Hugo");
        Scanner sc=new Scanner(System.in);
        int l=0;
        //este bucle permite hacer los metodos mas de 1 vez
        do {
            cuenta1.informacion();
            int decision;
            System.out.println("¿Que quiere hacer? (1=Sacar dinero, 2=Meter dinero, 3=apagar");
            decision = sc.nextInt();
            if (decision == 1) {
                System.out.println("¿Cuanto desea retirar?");
                int dinero=sc.nextInt();
                cuenta1.retirar(dinero);

            }
            if (decision == 2) {
                System.out.println("¿Cuanto desea depositar?");
                int dinero=sc.nextInt();
                cuenta1.meter(dinero);
            }
            if (decision == 3) {
                l=1;
                System.out.println("Cuenta cerrada, ¡hasta la próxima!");
            }else{
                System.out.println("No es una acción posible");
            }
        }while (l==0);
    }
}