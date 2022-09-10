
package project;

import java.util.Objects;
import javax.swing.JOptionPane;

public class Index {
    
    public static void main(String[] args) {
        
        Estudiante vector[] = new Estudiante[4];
        boolean op = true;
           
        while (op){
            int option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                """
                Seleccione una opci\u00f3n: 
                1.Ingresar un estudiante
                2.Promedio m\u00e1s bajo
                3.Promedio m\u00e1s alto
                4.Listado de estudiantes
                5.Salir"""));
            if(option == 1)
            {
                int c = 0;
                for(int i = 0; i < vector.length;i++){
                    if(!Objects.nonNull(vector[i]))
                    {
                        vector[i] = new Estudiante(
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id")),
                        JOptionPane.showInputDialog("Ingrese el nombre"),
                        JOptionPane.showInputDialog("Ingrese la materia"),
                        Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio")));  
                        break;
                    }else{
                        c++;
                    }
                    if(c == 4){
                        JOptionPane.showMessageDialog(null,"No hay más espacio");     
                    }
                }
            }
            if(option == 2 )
            {
               double min = 99999;
               int c = 0;
                for (Estudiante vector1 : vector) {
                    if (vector1 == null) {
                        c++;
                    } else {
                        if (vector1.getPromedio() < min) {
                            min = vector1.getPromedio();
                        }
                    }
                }
                if(c == 4){
                   JOptionPane.showMessageDialog(null,"No hay estudiantes agregados");     
                }else{
                   JOptionPane.showMessageDialog(null,"El menor promedio es: "+min);     
                }           
            }    
            if(option == 3)
            {
               double max = -99999;
               int c = 0;
                for (Estudiante vector1 : vector) {
                    if (vector1 == null) {
                        c++;
                    } else {
                        if (vector1.getPromedio() > max) {
                            max = vector1.getPromedio();
                        }
                    }
                }
                if(c == 4){
                   JOptionPane.showMessageDialog(null,"No hay estudiantes agregados");     
                }else{
                   JOptionPane.showMessageDialog(null,"El mayor promedio es: "+max);     
                }           
            }
            if(option == 4)
            {
                int c = 0;
                for (Estudiante vector1 : vector) {
                    if (vector1 == null) {
                        c++;
                    }
                }
                if(c == 4){
                   JOptionPane.showMessageDialog(null,"No hay estudiantes agregados");     
                }else{
                   JOptionPane.showMessageDialog(null,vector);     
                }         
            }
            if(option <= 0  || option >= 5)
            {
                JOptionPane.showMessageDialog(null,"¡Hasta la próxima!");
                op = false;      
            }
        }
    }    
}

