/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author DESARROLLADOR
 */
public class Carro {
    int id;
    String marca;
    String color;
    String placa;
    String modelo;
 
    
    public Carro(int id, String marca, String color, String placa, String modelo) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.modelo = modelo;
    }
    
   public Carro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    
  

    
    
    
}
