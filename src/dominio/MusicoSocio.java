package dominio;

public class MusicoSocio extends Director{
    protected String ocupacion;
    private int numerosocio;
    public MusicoSocio(String nombre, String ocupacion, int numerosocio) {
        super(nombre);
        this.ocupacion = ocupacion;
        this.numerosocio = numerosocio;
    }
    public MusicoSocio(String nombre, String ocupacion) {
        super(nombre);
        this.ocupacion = ocupacion;
    }
    public String toString() {
        return nombre + ", " + ocupacion + ", " + ocupacion + ", numero de socio: " + numerosocio + "\n";
    }
}
