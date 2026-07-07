import java.io.*;
import java.nio.file.Files;
import javax.swing.*;
public class Principal {
    public static void main(String[] args) throws IOException {

        JFileChooser selecArchivo = new JFileChooser();
        selecArchivo.setDialogTitle("Seleccione un archivo de código");

        int opcion = selecArchivo.showOpenDialog(null);

        if(opcion == JFileChooser.APPROVE_OPTION){
            File archivo = selecArchivo.getSelectedFile();
            String codigo = Files.readString(archivo.toPath());
            System.out.println("========================= CÓDIGO FUENTE (" + archivo.getName() + ") =========================");
            System.out.println(codigo);
            System.out.println("========================= FIN CÓDIGO FUENTE =========================");
            
            Parser parser = new Parser(codigo);

            //Aqui mejoramos que saliera el bytecode
            System.out.println("\n========================= BYTECODE =========================");
            System.out.println(parser.getBytecode());
            System.out.println("========================= FIN BYTECODE =========================");
        }else{
            JOptionPane.showMessageDialog(null,"No se seleccionó ningún archivo.");
        }
    }
}
