package dominio;

import java.util.ArrayList;

public class BandaMusica {
    private ArrayList<Actuacion> bd;
    private String nombre;
    public BandaMusica(String nombre) {
        this.nombre = nombre;
        bd = new ArrayList<>();
    }
    public void annadirActuacion(Actuacion a) {
        bd.add(a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append("\n\n");
        for (Actuacion actuacion : bd) {
            sb.append(actuacion).append("\n");
        }
        return sb.toString();
    }
}
