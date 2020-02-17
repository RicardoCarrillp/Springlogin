/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Config.Conexion;
import Entidad.Carro;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Controlador {
    Conexion con=new Conexion();
    JdbcTemplate jdbcTemplate=new JdbcTemplate(con.Conectar());
    ModelAndView mav=new ModelAndView();
    int id;
     List datos;
    @RequestMapping("index.htm")
    public ModelAndView Listar(){
        String sql="select * from vehiculoss";
         datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("index");
        return mav;
    
        }
    @RequestMapping(value="Agregar.htm" , method=RequestMethod.GET)
    public ModelAndView Agregar(){
         mav.addObject(new Carro()); 
         mav.setViewName("Agregar");
  
         return mav;
    
    
    }
    
    @RequestMapping(value="Agregar.htm" , method=RequestMethod.POST)
    public ModelAndView Agregar(Carro c){
        
    String sql="INSERT INTO vehiculoss(marca,modelo,color,placa)value(?,?,?,?)";
    this.jdbcTemplate.update(sql,c.getMarca(),c.getModelo(),c.getColor(),c.getPlaca());

        
    return new ModelAndView("redirect:/index.htm");
    }
       
    @RequestMapping(value="editar.htm" , method=RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        
        String sql="select * from vehiculoss where id="+id;
        datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("editar");
        return mav;
        
        
        
        
}
       
    @RequestMapping(value="editar.htm" , method=RequestMethod.POST)
    public ModelAndView Editar(Carro c){
    
        String sql="update vehiculoss set Marca=?,Modelo=?,Color=?,Placa=? where id="+id;
        this.jdbcTemplate.update(sql,c.getMarca(),c.getModelo(),c.getColor(),c.getPlaca());
    return new ModelAndView("redirect:/index.htm");
    }
@RequestMapping(value="delete.htm")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));
        String sql="delete from vehiculoss where id="+id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/index.htm");
    
    
    }
    
}