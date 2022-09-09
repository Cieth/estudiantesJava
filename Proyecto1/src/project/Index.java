
package project;

import java.util.Objects;
import javax.swing.JOptionPane;

public class Index {
    
    public static void main(String[] args) {
        
        Persona vector[] = new Estudiante[4];
        boolean op = true;
           
        while (op){
            int option = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opción: \n"
                    + "1.Ingresar un estudiante\n"
                    + "2.Promedio más bajo\n"
                    + "3.Promedio más alto\n"
                    + "4.Listado de estudiantes\n"
                    + "5.Salir"));
            if(option == 1){
                for(int i = 0; i < vector.length;i++){
                    if(!Objects.nonNull(vector[i]) ){
                        vector[i] = new Estudiante(
                        Integer.parseInt(JOptionPane.showInputDialog("")),
                        JOptionPane.showInputDialog(""),
                        JOptionPane.showInputDialog(""),
                        Double.parseDouble(JOptionPane.showInputDialog(""))
                        );
                        System.out.println(vector[i]);
                        break;
                    }
                   }
            }else{
                System.out.println("HOla");
            }

            
        }    
        }
            
        

    }

