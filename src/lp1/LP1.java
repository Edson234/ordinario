/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp1;

/**
 *
 * @author Edson Coj
 */
public class LP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        trabajosTI persona  = new trabajosTI();
        persona.setNombre("Desinger");
        persona.setDescripcion("Desarrollo de aplicaciones");
        persona.setHabilidades("Base de datos");
        persona.setExperiencia(2);
        persona.setNivel("Boss");
        
        System.out.println(persona);
        persona.sueldo();
        
        videoComunicacion plataforma = new videoComunicacion();
        plataforma.setNombre("Meet");
        plataforma.setCantidadUsuarios(100);
        plataforma.setTiempo(2000);
        plataforma.setNivel("Libre");
        plataforma.setEstrellas(5);
        
        System.out.println(plataforma);
        plataforma.Calidad();
        
    }
    
}
