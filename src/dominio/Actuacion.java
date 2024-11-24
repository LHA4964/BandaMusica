package dominio;

import java.util.ArrayList;
import java.time.LocalDate;

public class Actuacion {
    private ArrayList actua;
    private LocalDate fechaactua;
    public Actuacion(LocalDate fechaactua) {
        this.fechaactua = fechaactua;
        actua = new ArrayList();
    }

    public void annadirParticipante(Director director) {
        actua.add(director);
    }
    public void annadirParticipante(MusicoSocio musicoSocio) {
        actua.add(musicoSocio);
    }
    public void annadirParticipante(MusicoRefuerzo musicoRefuerzo) {
        actua.add(musicoRefuerzo);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de actuación: ").append(fechaactua).append("\n");
        for (Object participante : actua) {
            sb.append(participante.toString());
        }
        return sb.toString();
    }
}