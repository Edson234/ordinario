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
public class trabajosTI {
    private String Nombre;
    private String Descripcion;
    private String Habilidades;
    private int Experiencia;
    private String Nivel;

    public trabajosTI() {
    }

    public trabajosTI(String Nombre, String Descripcion, String Habilidades, int Experiencia, String Nivel) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Habilidades = Habilidades;
        this.Experiencia = Experiencia;
        this.Nivel = Nivel;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(String Habilidades) {
        this.Habilidades = Habilidades;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }
    
    public void sueldo() {
        int salario= 1000*(1+ (Experiencia/10)); 
        System.out.println("El salario de la persona es " + salario);
    }

    @Override
    public String toString() {
        return "trabajosTI{" + "Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", Habilidades=" + Habilidades + ", Experiencia=" + Experiencia + ", Nivel=" + Nivel + '}';
    }
    
    

    
    
    
    
}
