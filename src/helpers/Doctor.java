/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;


public class Doctor  extends Persona{
  //atributos
    private String nombre;
    private int edad;
    private String profesion;
    // metodos
    
public void setnombre (String nombre){
this.nombre= nombre;
}
   public void setedad (int edad){
this.edad= edad;
}
  public void setprofesion (String profesion){
this.profesion= profesion;
}  
  
 
   
  @Override
    public String getnombre() {
       return "mi nombre es "+nombre; 
    }
    @Override
    public int getedad() {
       return edad ; 
    }

    @Override
    public String getprofesion() {
        return "soy "+ profesion+" y me gusta mi profecion";
    }

  
  
}
