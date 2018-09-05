/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom;
import javax.swing.JOptionPane;
/**
 *
 * @author mauri
 */
public class Telecom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message= String.format("Informe qual meio de comunicação ira utilizar:\n 1-computador\n 2-Radio\n 3-Dispositivo movel\n 4-telefone fixo");
        String escolha =JOptionPane.showInputDialog(null, message);
        switch(escolha){
            case "1": 
                Computer c = new Computer();
                c.criarComputador();
                c.funcoes();
                break;
  
            case "3":
                DispositivoMovel cel = new DispositivoMovel();
                cel.aparelho();
                cel.funcoes();
                break;
            case "4":
                Fixo tf= new Fixo();
                tf.criarTelefoneFixo();
                tf.funcoes();
                break; 
        }    
    } 
}
    

