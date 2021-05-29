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
public class videoComunicacion {
    private String Nombre;
    private int CantidadUsuarios;
    private int Tiempo;
    private String Nivel;
    private int Estrellas;

    public videoComunicacion() {
    }

    public videoComunicacion(String Nombre, int CantidadUsuarios, int Tiempo, String Nivel, int Estrellas) {
        this.Nombre = Nombre;
        this.CantidadUsuarios = CantidadUsuarios;
        this.Tiempo = Tiempo;
        this.Nivel = Nivel;
        this.Estrellas = Estrellas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidadUsuarios() {
        return CantidadUsuarios;
    }

    public void setCantidadUsuarios(int CantidadUsuarios) {
        this.CantidadUsuarios = CantidadUsuarios;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public int getEstrellas() {
        return Estrellas;
    }

    public void setEstrellas(int Estrellas) {
        this.Estrellas = Estrellas;
    }
    
    public void Calidad() {
        int calidad = CantidadUsuarios*Tiempo*Estrellas;
        System.out.println("La calidad es de " + calidad);
    }

    @Override
    public String toString() {
        return "videoComunicacion{" + "Nombre=" + Nombre + ", CantidadUsuarios=" + CantidadUsuarios + ", Tiempo=" + Tiempo + ", Nivel=" + Nivel + ", Estrellas=" + Estrellas + '}';
    }
    
    
    
}
