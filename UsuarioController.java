
package Controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import dao.conexionMySQL;
import model.UsuarioModel;

public class UsuarioController extends conexionMySQL{
        public static void main(String[] mama){
            try{
                UsuarioController _UsuarioController = new UsuarioController();

                System.out.println("****************LISTAR UN USUARIO ***********************");
                UsuarioModel _UsuarioModel = _UsuarioController.readUsuarioByCodigo("42455979");
                System.out.println(_UsuarioModel.toString());
                System.out.println("****************LISTAR TODOS LOS USUARIOS ****************");

                ArrayList<UsuarioModel> lst = _UsuarioController.readUsuario();
                for (int i = 0; i < lst.size(); i++) {
                    UsuarioModel oUsuarioModel = lst.get(i);
                    System.out.println(oUsuarioModel);
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
        
    //METODO LEER USUARIOS
    public UsuarioModel readUsuarioByCodigo(String c){
        UsuarioModel uBE = new UsuarioModel();//NULA
        String SQL="SELECT * FROM tbusuarios WHERE usu_codigo = ? ";
        PreparedStatement pst = null;
        ResultSet res = null;
        try{
            pst = getConexion().prepareStatement(SQL);
            pst.setString(1, c);
            res = pst.executeQuery();            
            while(res.next()){
                uBE.setUsu_codigo(res.getString("usu_codigo"));
                uBE.setUsu_nombre(res.getString("usu_nombre"));
                uBE.setUsu_descri(res.getString("usu_descri"));
                uBE.setUsu_passwd(res.getString("usu_passwd"));
                uBE.setUsu_email(res.getString("usu_email"));
                uBE.setUsu_imagen(res.getString("usu_imagen"));
                uBE.setUsu_estcod(res.getInt("usu_estcod"));                           
            }
        }catch(SQLException e){System.out.println(e.getMessage());}
        return uBE;        
    }    
    
    //METODO CREAR USUARIO
    public boolean createUsuario(UsuarioModel u){
        String SQL="INSERT tbusuarios VALUES (?,?,?,?,?,?,?) ";
        PreparedStatement pst = null;
        int res = 0 ;
        try{
            pst = getConexion().prepareStatement(SQL);
            pst.setString(1, u.getUsu_codigo());
            pst.setString(2, u.getUsu_nombre());
            pst.setString(3, u.getUsu_descri());
            pst.setString(4, u.getUsu_passwd());
            pst.setString(5, u.getUsu_email());
            pst.setString(6, u.getUsu_imagen());
            pst.setInt(7, u.getUsu_estcod());
            
            res = pst.executeUpdate();           
        }catch(SQLException e){System.out.println(e.getMessage());}
        return res != 0; 
    }
    //METODO LEER USUARIOS
    public ArrayList<UsuarioModel> readUsuario() throws Exception, IOException{
        ArrayList<UsuarioModel> lista = null;//NULA
        String SQL="SELECT * FROM tbusuarios";
        Statement stm = null;
        ResultSet res = null;
        try{
            stm = getConexion().createStatement();
            res = stm.executeQuery(SQL);
            lista= new ArrayList<UsuarioModel>();//VACIA
            while(res.next()){
                //System.out.println(res.getString("usu_nombre") );
                UsuarioModel oUsuario = new UsuarioModel();
                oUsuario.setUsu_codigo(res.getString("usu_codigo"));
                oUsuario.setUsu_nombre(res.getString("usu_nombre"));
                oUsuario.setUsu_descri(res.getString("usu_descri"));
                oUsuario.setUsu_passwd(res.getString("usu_passwd"));
                oUsuario.setUsu_email(res.getString("usu_email"));
                oUsuario.setUsu_imagen(res.getString("usu_imagen"));
                oUsuario.setUsu_estcod(res.getInt("usu_estcod"));
                lista.add(oUsuario); //AGREGAMOS EL ITEM                
            }
        }catch(SQLException e){System.out.println(e.getMessage());}
        return lista;        
    }
    //METODO ACTUALIZA USUARIO
    public boolean updateUsuario(UsuarioModel u){
        String SQL="UPDATE tbusuarios SET usu_nombre = ?, usu_descri =?, usu_passwd = ?, usu_email = ?, usu_estcod = ? WHERE usu_codigo=? ";
        PreparedStatement pst = null;
        int res = 0 ;
        try{
            pst = getConexion().prepareStatement(SQL);
            pst.setString(1, u.getUsu_nombre());
            pst.setString(2, u.getUsu_descri());
            pst.setString(3, u.getUsu_passwd());
            pst.setString(4, u.getUsu_email());
            pst.setInt(5, u.getUsu_estcod());
            pst.setString(6, u.getUsu_codigo());
            res = pst.executeUpdate();           
        }catch(SQLException e){System.out.println(e.getMessage());}
        return res != 0; 
    }
    //METODO ELIMINA USUARIO
    public boolean deleteUsuario(String c){
        String SQL="DELETE FROM tbusuarios WHERE usu_codigo=?";
        PreparedStatement pst = null;
        int res = 0 ;
        try{
            pst = getConexion().prepareStatement(SQL);
            pst.setString(1, c);
            res = pst.executeUpdate();           
        }catch(SQLException e){System.out.println(e.getMessage());}
        return res != 0;        
    }

}
