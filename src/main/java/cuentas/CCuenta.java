package cuentas;


/**
 * Clase que se encarga de definir un objeto de tipo CCuenta y a la vez de indicar
 * el tipo de información que contendra, como nombre, cuenta, saldo y tipo interes.
 * 
 * @author Maria Fernanda Villarroel Toaque
 */
public class CCuenta {

    /**
     * Metodo que obtiene el nombre del cliente.
     * 
     * @return el nombre
     */
    private String getNombre() {
        return nombre;
    }

    /**
     * Metodo que establece el nombre del cliente.
     * 
     * @param nombre el nombre a establecer
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el codigo de la cuenta del cliente.
     * 
     * @return la cuenta
     */
    private String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo que establece el codigo de la cuenta del cliente.
     * 
     * @param cuenta la cuenta a establecer
     */
    private void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metodo que obtiene el saldo en la cuenta del cliente.
     * 
     * @return el saldo
     */
    private double getSaldo() {
        return saldo;
    }

    /**
     * Metodo que establece el saldo en la cuenta del cliente.
     * 
     * @param saldo el saldo a establecer
     */
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo que obtiene el tipo de interes que tiene la cuenta del cliente.
     * 
     * @return el tipoInteres
     */
    private double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Metodo que establece el tipo de interes que tiene la cuenta del cliente.
     * 
     * @param tipoInteres el tipoInteres a establecer
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

    /**
     * Metodo constructor de la clase CCuenta, se encarga de crear fisicamente el objeto en la memoria.
     * 
     * @param nom nombre del cliente de la cuenta
     * @param cue codigo de cuenta del cliente
     * @param sal saldo disponible en la cuenta
     * @param tipo tipo de interes en la cuenta del cliente
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Metodo que devuelve el saldo disponible en la cuenta del cliente.
     * 
     * @return devuelve el saldo disponible en la cuenta del cliente
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Metodo que sirve para ingresar saldo en la cuenta del cliente.
     * 
     * @param cantidad cantidad de saldo a ingresar en la cuenta
     * @throws Exception excepcion que se captura si la cantidad es menor que 0 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo que sirve para retirar saldo de la cuenta del cliente.
     * 
     * @param cantidad cantidad a retirar de la cuenta del cliente
     * @throws Exception excepcion que se captura si la cantidad a retirar es menor que 0 o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
