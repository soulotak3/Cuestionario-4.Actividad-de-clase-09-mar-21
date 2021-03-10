/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.dp;

/**
 *
 * @author wesho
 */
public class Persona {
    String nombre;
    String apPaterno;
    String apMaterno;
    int edad;
    String curp;

    public Persona() {
    }

    public Persona(String nombre, String apPaterno, String apMaterno, int edad, String curp) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", edad=" + edad + ", curp=" + curp + '}';
    }
            
}
