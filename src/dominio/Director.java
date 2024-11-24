package dominio;

public class Director {
    protected String nombre;
    public Director(String nombre) {
        this.nombre = nombre;
    }
    public String toString() {
        return nombre + ", director\n";
    }
}
