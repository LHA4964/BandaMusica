package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo extends MusicoSocio{
    private BigDecimal sueldo;
    public MusicoRefuerzo(String nombre, String ocupacion, BigDecimal sueldo) {
        super(nombre, ocupacion);
        this.sueldo = sueldo;
    }
    public String toString() {
        return nombre + ", " + ocupacion + ", " + sueldo + " €\n";
    }
}