import java.io.*;
import java.nio.file.Files;
import javax.swing.*;
//Mejora 1: Abrir archivos
public class Principal {
    public static void main(String[] args) throws IOException {

        JFileChooser selecArchivo = new JFileChooser();
        selecArchivo.setDialogTitle("Seleccione un archivo de código");

        int opcion = selecArchivo.showOpenDialog(null);

        if(opcion == JFileChooser.APPROVE_OPTION){
            File archivo = selecArchivo.getSelectedFile();
            String codigo = Files.readString(archivo.toPath());
            System.out.println("==================== CÓDIGO FUENTE (" + archivo.getName() + ") ====================");
            System.out.println(codigo);
            System.out.println("==================== FIN CÓDIGO FUENTE ====================");
            new Parser(codigo);
        }else{
            JOptionPane.showMessageDialog(null,"No se seleccionó ningún archivo.");
        }
    }
}