public class ClienteVip {
    private String nombre;
    private double limiteCredito;
    private String email;
    private tipoVip Vip;
    public enum tipoVip {GOLD, SILVER, NORMAL,};

    @Override
    public String toString() {
        return "ClienteVip{" +
                "nombre='" + nombre + '\'' +
                ", limiteCredito=" + limiteCredito +
                ", email='" + email + '\'' +
                ", Vip=" + Vip +
                '}';
    }

    public ClienteVip() {
        this("Daivid",2345,"dabid@gmail.com",tipoVip.GOLD);
    }

    public ClienteVip(String nombre, double limiteCredito) {
        this(nombre, limiteCredito, "david@gmail.com",tipoVip.SILVER);


    }

    public ClienteVip(String nombre, double limiteCredito, String email, ClienteVip.tipoVip tipoVip) {
        this.nombre = nombre;
        this.limiteCredito = limiteCredito;
        this.email = email;
        this.Vip = tipoVip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public tipoVip getVip() {
        return Vip;
    }

    public void setVip(tipoVip vip) {
        Vip = vip;
    }
}
