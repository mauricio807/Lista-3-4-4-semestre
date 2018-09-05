/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartaoweb;

/**
 *
 * @author mauri
 */
import javax.swing.JOptionPane;
public class Aniversario extends CartaoWeb{
    private String destinatario;
  
    public void retornarMensagem(String remetente) {
        JOptionPane.showMessageDialog(null,"Feliz aniversario! de: "+remetente+" para: "+getDestinatario()+"");
    }
    
    public Aniversario(String destinatario){
        setDestinatario(destinatario);
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    public Aniversario(){
    
    }            
}
