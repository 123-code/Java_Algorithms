//package Java_UIs;
import javax.swing.JOptionPane;
import java.util.*;  



class Main{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al juego, se te haran una serie de preguntas, para poder conocerte mas");
        int input = JOptionPane.showConfirmDialog(null, "Deseas Continuar?");
System.out.println(input);

        String name = JOptionPane.showInputDialog("Porfavor Digite su nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        JOptionPane.showMessageDialog(null,"Bienvenid@!" + " " + name + " " + apellido);
        
        JOptionPane.showInputDialog(null,name + " " + "Ingresa tu edad a la fecha:");
        
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null,"ok," + " " + name + "Ahora Ingresa el numero de semestres que has cursado:"));

      
int inputed = 0;
int cont = 1;
double[] notas = new double[ans];
System.out.println(ans);


do{
int nota = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa tu nota de semestre" + " " + cont + ":"));
notas[inputed] = nota;
inputed++;
cont++;
}while(inputed < ans);

    

JOptionPane.showInputDialog(null,"Describa en pocas palabras su rendimiento academico:");

//int arrayLength = 0;


double promedio = 0;
double sumatoria = 0;

sumatoria = Arrays.stream(notas).sum();

promedio = sumatoria/notas.length;

JOptionPane.showMessageDialog(null,"El promedio de sus notas es:" + promedio);

if(promedio >= 6.0){
    JOptionPane.showMessageDialog(null,"Felicidades, ha llegado a la nota minima requerida!");
    String curso = JOptionPane.showInputDialog(null,"Ingrese el nombre del curso al que desea acceder:");
    JOptionPane.showMessageDialog(null,"Gracias por aplicar ! al curso :" + " "  + curso + " " + ",su solicitud sera revisada.");
}
else if(promedio < 6.0){
    JOptionPane.showMessageDialog(null,"Lo sentimos, su promedio no es el minimo necesario para aplicar :(");
}



        }

    }
