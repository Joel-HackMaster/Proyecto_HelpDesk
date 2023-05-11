package Service;

import Entities.UsuarioGeneral;
import Repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class   UsuarioServicioImp implements UsuarioServicio{
    @Autowired
    private UsuarioRepositorio repositorio;
    @Override
    public List<UsuarioGeneral> listarTodosLosUsuarios(){return repositorio.findAll();}
}
