/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class Conexion {
 
    public DriverManagerDataSource Conectar(){
    DriverManagerDataSource datasource=new DriverManagerDataSource();
    datasource.setDriverClassName("com.mysql.jdbc.Driver");
    datasource.setUrl("jdbc:mysql://localhost:3306/carross");
    datasource.setUsername("root");
    datasource.setPassword("");
 
    return datasource;
    
    }
}
