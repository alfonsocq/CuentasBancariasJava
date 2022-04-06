class CuentaBancaria {

    private static int numerodecuentas = 0;
    private String user;
    private double ahorros;
    private double corriente;

    public CuentaBancaria(String user, double ahorros, double corriente) {
        this.user=user;
        this.ahorros=ahorros;
        this.corriente=corriente;
        numerodecuentas++;
    }

    public String getUser() {
        return user;
    }

    public static int getnumerodecuentas() {
        return numerodecuentas;
    }

    public void setcorriente (double dinero) {
        this.corriente = this.corriente + dinero;
    }

    public void setahorros (double dinero) {
        this.ahorros = this.ahorros + dinero;
    }

    public void retirarahorros (double dinero) {
        if ((this.ahorros - dinero) > 0 )
        
            this.ahorros= this.ahorros - dinero;
        
        else
            System.out.println("No hay fondos suficientes para concretar esta operacion");
    }

    public void retirarcorriente (double dinero) {
        if ((this.corriente - dinero) > 0 )
        
            this.corriente= this.corriente - dinero;
        
        else
            System.out.println("No hay fondos suficientes para concretar esta operacion");
    }

    public double getahorros() {
        return this.ahorros;
    }

    public double getcorriente() {
        return this.corriente;
    }



//    public CuentaBancaria(String user, double ahorros, double corriente){
//        cuenta_user= user;
//        cuenta_ahorros = ahorros;
//        cuenta_corriente = corriente;
//        numerodecuentas++;
//    }
//
//    public double getcuenta_ahorros() {
//        return cuenta_ahorros;
//    }
//    
//    public double getcuenta_corriente() {
//        return CuentaBancaria;
//    }    
//    
//
//    public double getcuentatotal() {
//        System.out.println(cuenta_ahorros);
//        System.out.println(cuenta_corriente);
//
//    public void setcorriente (double dinero) {
//        cuenta_corriente = cuenta_corriente + dinero;
//    }
//    public void setahorros (double dinero) {
//        cuenta_ahorros = cuenta_ahorros + dinero;
//    }
//
////    public void retirarcuenta_corriente (double dinero) {
//        if ((cuenta_corriente - dinero) > 0 )
//        
//            cuenta_corriente = cuenta_corriente - dinero;
//        
//        else
//            System.out.println("No hay fondos");
//    }
//
//    public void retirarcuenta_ahorros (double dinero) {
//        if ((cuenta_ahorros - dinero) > 0 )
//        
//            cuenta_ahorros = cuenta_ahorros - dinero;
//        
//        else
//            System.out.println("No hay fondos");
//    }


    
}