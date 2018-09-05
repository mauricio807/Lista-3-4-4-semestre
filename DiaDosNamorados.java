/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartaoweb;
import javax.swing.JOptionPane;
/**
 *
 * @author mauri
 */
public class DiaDosNamorados extends CartaoWeb{
        private String destinatario;
        @Override
        public void retornarMensagem(String remetente){
        String frase = String.format("\"Feliz dia dos namorados! de: "+remetente+" para: "+getDestinatario());
        JOptionPane.showMessageDialog(null,frase);
    }
    
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    public DiaDosNamorados(String destinatario){
        setDestinatario(destinatario);
    }
    
    public DiaDosNamorados(){
}
    
}
