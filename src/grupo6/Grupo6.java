
package grupo6;
import helpers.Deportista;
import helpers.Doctor;
/**
 *
 * @author ( grupo6)
 */
public class Grupo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deportista persona1= new Deportista();
       Doctor persona2=new Doctor();
       
        System.out.println("***********************************************");
        persona1.setnombre("Josue Gomez" );
        persona1.setedad(21);
        persona1.setprofesion("Deportista");
        
        
        System.out.println("mi nombre es "+persona1.getnombre());
        System.out.println("tengo "+persona1.getedad()+" años");
        System.out.println("mi profesion es ingeniero pero tambien soy "+persona1.getprofesion());
        
        System.out.println("**********************************************");
        persona2.setnombre("Haniel Perez" );
        persona2.setedad(33);
        persona2.setprofesion("doctor");
        System.out.println(persona2.getnombre());
        System.out.println("tengo "+persona2.getedad()+" años");
        System.out.println(persona2.getprofesion());
        System.out.println("**********************************************");
    }
    
}
