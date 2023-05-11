package dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class UsuariosDTO implements Serializable {
    private String use_cod;
    private String use_nom_ap;
    private String use_corr;
    private String use_Empresa;

}
