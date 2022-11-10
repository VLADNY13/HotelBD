/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Bayron Vargas
 */
import Modelo.Alquilar;
import Modelo.UsuarioServicios;
import Servicios.Conexion;
public class Servicios {
    
    public void Alquiler(Alquilar alquiler){
    
        try{
        
            UsuarioServicios us = new UsuarioServicios();
            us.guardar(Conexion.obtener(), alquiler.getUsuario());
        }
        catch(Exception e){
        
        }
    }
    
}
