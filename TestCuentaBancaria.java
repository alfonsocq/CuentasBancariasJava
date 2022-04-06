public class TestCuentaBancaria{

    public static void main(String[] args) {

        CuentaBancaria Usuario1;
        Usuario1 = new CuentaBancaria("Juana", 100.00, 200.00);
        CuentaBancaria Usuario2;
        Usuario2 = new CuentaBancaria("Yahaira", 40.00, 160.00);

        double deposito1= 100.00;
        double deposito2= 300.00;
        Usuario1.setahorros(deposito1);
        Usuario1.setcorriente(deposito2);

        double retiro1= 160.00;
        double retiro2= 540.00;
        Usuario1.retirarcorriente(retiro1);
        Usuario1.retirarahorros(retiro2);

        String ImpUsuario1 = Usuario1.getUser();
        Double ImpSaldoC1 = Usuario1.getcorriente();
        Double ImpSaldoA1 = Usuario1.getahorros();
        int nuestrosusuarios = CuentaBancaria.getnumerodecuentas();
        System.out.println( "Usuario: " + ImpUsuario1 + " Cuenta Corriente: " + ImpSaldoC1 + " Cuenta de Ahorros: " + ImpSaldoA1);
        System.out.println( "Actualmente contamos con mas de " + nuestrosusuarios + " usuarios que confian en nosotros. Gracias por su preferencia");


    
    }
}