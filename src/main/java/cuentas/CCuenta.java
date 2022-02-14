package cuentas;

public class CCuenta {

    /**
     * @return the nombre
     */
    private String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    private String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    private void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    private double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    private double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    private void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /*
    He comentado este atributo porque no es recomendable usar caracteres especiales
    como tildes en los nombres de las variables.
    
    private double tipoInterés;
    */    

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
