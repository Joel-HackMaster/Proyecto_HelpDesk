package Entities;

import jakarta.persistence.*;

public class TicketCabecera {
    private String codigo;
    private String usuarioCod;
    private String tecnicoCod;
    private String fecha;
    private String telefono;
    private String estado;

    public TicketCabecera() {
    }
    public TicketCabecera(String codigo, String usuarioCod, String tecnicoCod, String fecha, String telefono, String estado) {
        this.codigo = codigo;
        this.usuarioCod = usuarioCod;
        this.tecnicoCod = tecnicoCod;
        this.fecha = fecha;
        this.telefono = telefono;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUsuarioCod() {
        return usuarioCod;
    }

    public void setUsuarioCod(String usuarioCod) {
        this.usuarioCod = usuarioCod;
    }

    public String getTecnicoCod() {
        return tecnicoCod;
    }

    public void setTecnicoCod(String tecnicoCod) {
        this.tecnicoCod = tecnicoCod;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
