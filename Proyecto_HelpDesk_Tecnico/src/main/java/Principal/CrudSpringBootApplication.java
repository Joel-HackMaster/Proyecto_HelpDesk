package Principal;

import Entities.UsuarioGeneral;
import Repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner {
    public static void main(String[] args){
        SpringApplication.run(CrudSpringBootApplication.class, args);
    }

    private UsuarioRepositorio repositorio;
    @Override
    public void run(String... args) throws Exception {
        UsuarioGeneral usuario1 = new UsuarioGeneral("U0000002","77245835","Joel Wilton","joel_1998@gmail.com","77245835","958314325","EMP-0001","R001");
        repositorio.save(usuario1);
    }
}
