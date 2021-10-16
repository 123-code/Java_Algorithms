package Java_UIs;
import javax.swing.JOptionPane;

class Main{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al juego, se te haran una serie de preguntas, para poder conocerte mas");
        int input = JOptionPane.showConfirmDialog(null, "Deseas Continuar?");
System.out.println(input);

        String name = JOptionPane.showInputDialog("Porfavor Digite su nombre:");
        JOptionPane.showMessageDialog(null,"Bienvenid@!" + " " + name);
        
        JOptionPane.showInputDialog(null,name + " " + "Ingresa tu edad a la fecha:");
        
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null,"ok," + " " + name + "Ahora Ingresa el numero de semestres que has cursado:"));

      
int inputed = 0;
int cont = 1;
double[] notas = new double[10];

do{
int nota = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa tu nota de semestre" + " " + cont + ":"));
notas[inputed] = nota;
inputed++;
cont++;
}while(inputed < ans);

    

JOptionPane.showInputDialog(null,"Describa en pocas palabras su rendimiento academico:");

int arrayLength = notas.length;

double promedio = 0;
double sumatoria = 0;

for(int i=0;i<arrayLength;i++){
sumatoria += notas[i];
promedio = sumatoria/arrayLength;
}

JOptionPane.showMessageDialog(null,"El promedio de sus notas es:" + promedio);




        }

    }
