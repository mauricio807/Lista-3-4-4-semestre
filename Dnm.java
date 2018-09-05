/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartaoweb;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mauri
 */
public class Dnm {
    public static void main(String[] args){
        String destinatario = JOptionPane.showInputDialog("Informe o destino da mensagem:");
        String remetente = JOptionPane.showInputDialog("Informe o remetente:");
        
        DiaDosNamorados re = new DiaDosNamorados(destinatario);
        Natal na = new Natal();
        Aniversario an = new Aniversario();
        
        String select = String.format("Informe o numero correspondente a operação que deseja realizar: \n1-Dia dos namorados \n2-Natal \n3-Aniversario"); 
       String exit = JOptionPane.showInputDialog(select);
       
       ArrayList<String> CartaoWeb = new ArrayList<>();
        CartaoWeb.add(remetente+destinatario);
        
            switch(exit){
    
            case "1":
                re.retornarMensagem(remetente);
                re.setDestinatario(destinatario);
                break;
            case "2":
                re.retornarMensagem(remetente);
                re.setDestinatario(destinatario);
                break;
            case "3":
                re.retornarMensagem(remetente);
                re.setDestinatario(destinatario);
                break;
        }   
}

}
