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
public class Natal extends CartaoWeb{
    private String destinatario;
   
    @Override
    public void retornarMensagem(String remetente) {
        JOptionPane.showMessageDialog(null,"Feliz Natal! : "+remetente+" para: "+getDestinatario()+"");
    }
    
    public String getDestinatario() {
        return destinatario;
    }
    
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    public Natal(String destinatario){
        setDestinatario(destinatario);
    }
    
    public Natal(){
    
    }
}
