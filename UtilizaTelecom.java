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
public class UtilizaTelecom {
    protected String cor;
    protected String modelo;
    private static int codigo;
    protected boolean ativo;
    private String numero;
    private String plataforma;
    public String mensage; 
    public UtilizaTelecom(){
            
    }
    public void setCor(String cor){
        this.cor=cor;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }    
    public void setPlataforma(String plataforma){
        this.plataforma=plataforma;
    }  
    public void setativo(boolean ativo){
        this.ativo=ativo;
    }
    public String getCor() {
        return cor;
    }
    public String getModelo() {
        return modelo;
    }
    public int getCodigo() {
        return codigo;
      
    }
    public boolean ativo() {
        return ativo;
    }
    public String getNumero() {
        return numero;
    }
    public String getPlataforma() {
        return plataforma;
    } 
    public void Status(){
        if (ativo=true){
            JOptionPane.showMessageDialog(null,"está ligado");
        }        
    }
    public void mandarmensg(){
        String mensg = JOptionPane.showInputDialog("Informe a mensagem:");
        this.mensage=mensg;     
    }
    public void lerMSG(){
        JOptionPane.showMessageDialog(null,"O número:"+getNumero()+" acabou de mandar uma mensagem: "+mensage+"");
    }
    public void fazerLigacao(){
        String num=JOptionPane.showInputDialog("Digite o número que você deseja ligar:");
        this.numero=num;
        JOptionPane.showMessageDialog(null,"Você está ligando para esse numero:"+this.numero);
    }
    public void receberLigacao(){
        JOptionPane.showMessageDialog(null,"esse numero está te ligando:40028922 "); 
    }
    
}
