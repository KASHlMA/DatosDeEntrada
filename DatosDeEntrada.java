import javax.swing.JOptionPane;

public class DatosDeEntrada{
    public static void main(String[] args){
        
        String nomnbre = JOptionPane.showInputDialog("Ingresa tu nombre");
        String apellidoP = JOptionPane.showInputDialog("Ingresa tu apellido paterno");
        String apellidoM = JOptionPane.showInputDialog("Ingresa tu apellido materno");
//printl del nombre y los apellidos o no curi
        System.out.println("Tu nombre es: "+nomnbre+" y tus apellidos "+apellidoP+" "+apellidoM);


    }
}