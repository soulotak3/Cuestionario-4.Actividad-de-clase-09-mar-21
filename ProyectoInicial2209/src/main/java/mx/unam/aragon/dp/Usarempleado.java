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
public class Usarempleado {
    public static void main (String[]args){
    Empleado emp1 = new Empleado(1,"sistemas",45000,15);
    emp1.setNombre("juan jose");
    emp1.setApPaterno("Garcia");
    emp1.setEdad(24);
    emp1.setCurp("ljhdalksdja0123");
    
    System.out.println("info:" + emp1); 
    }
    
}
