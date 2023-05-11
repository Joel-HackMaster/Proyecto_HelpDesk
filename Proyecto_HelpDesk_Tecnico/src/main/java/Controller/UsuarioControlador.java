package Controller;

import Service.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio servicio;

    @GetMapping({ "/usuarios", "/" })
    public String listarUsuarios(Model modelo) {
        modelo.addAttribute("usuarios", servicio.listarTodosLosUsuarios());
        return "Usuarios"; // nos retorna al archivo usuarios
    }


}
