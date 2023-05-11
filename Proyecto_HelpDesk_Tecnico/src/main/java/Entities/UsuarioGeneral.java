package Entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "usuario")
public class UsuarioGeneral implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "use_cod")
    private String use_cod;
    @Column(name = "use_useDNI")
    private String use_useDNI;
    @Column(name = "use_nom_ap")
    private String use_nom_ap;
    @Column(name = "use_corr")
    private String use_corr;
    @Column(name = "use_passw")
    private String use_passw;
    @Column(name = "use_telf")
    private String use_telf;
    @Column(name = "use_Empresa")
    private String use_Empresa;
    @Column(name = "use_rolCod")
    private String use_rolCod;

    public UsuarioGeneral() {
    }

    public UsuarioGeneral(String use_cod, String use_useDNI, String use_nom_ap, String use_corr, String use_passw, String use_telf, String use_Empresa, String use_rolCod) {
        this.use_cod = use_cod;
        this.use_useDNI = use_useDNI;
        this.use_nom_ap = use_nom_ap;
        this.use_corr = use_corr;
        this.use_passw = use_passw;
        this.use_telf = use_telf;
        this.use_Empresa = use_Empresa;
        this.use_rolCod = use_rolCod;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUse_cod() {
        return use_cod;
    }

    public void setUse_cod(String use_cod) {
        this.use_cod = use_cod;
    }

    public String getUse_useDNI() {
        return use_useDNI;
    }

    public void setUse_useDNI(String use_useDNI) {
        this.use_useDNI = use_useDNI;
    }

    public String getUse_nom_ap() {
        return use_nom_ap;
    }

    public void setUse_nom_ap(String use_nom_ap) {
        this.use_nom_ap = use_nom_ap;
    }

    public String getUse_corr() {
        return use_corr;
    }

    public void setUse_corr(String use_corr) {
        this.use_corr = use_corr;
    }

    public String getUse_passw() {
        return use_passw;
    }

    public void setUse_passw(String use_passw) {
        this.use_passw = use_passw;
    }

    public String getUse_telf() {
        return use_telf;
    }

    public void setUse_telf(String use_telf) {
        this.use_telf = use_telf;
    }

    public String getUse_Empresa() {
        return use_Empresa;
    }

    public void setUse_Empresa(String use_Empresa) {
        this.use_Empresa = use_Empresa;
    }

    public String getUse_rolCod() {
        return use_rolCod;
    }

    public void setUse_rolCod(String use_rolCod) {
        this.use_rolCod = use_rolCod;
    }
}
