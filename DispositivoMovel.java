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
public class DispositivoMovel extends UtilizaTelecom {
  
    private int imei;
    public void setImei(int imei){
        this.imei=imei;
    }
    public int getImei(){
        return this.imei;
    }  
    public void liga(){
        setativo(true);
    }
    public void desligar(){
        setativo(false);
    }
    public void funcoes(){
        String aparelhoon=JOptionPane.showInputDialog("aperte 1 para proseguir");
                    if (aparelhoon!=null){
                        liga();
                    if (ativo()==true){
                        do{ 
                        String messg= String.format("Informe o numero correspondente a operação que deseja realizar \n 1-mandar mensagem\n 2-Olhar mensagens\n 3-Fazer uma ligacao \n 4-Receber uma ligacao\n 5-Ver caracteristicas do celular\n 6-Sair");
                        String seleção=JOptionPane.showInputDialog(messg);
                        switch(seleção)
                        {
                            case "1":
                                String num= JOptionPane.showInputDialog("Informe o destinatario para qual deseja mandar a mensage");
                                JOptionPane.showMessageDialog(null,"mensagem: "+mensage+" enviada para o aparelho cuja o número é : "+num+" operação realizada com sucesso");
                                break;
                                
                                case "2":
                                String numl= JOptionPane.showInputDialog("Informe para qual número deseja realzar a ligação");
                                JOptionPane.showMessageDialog(null,"chamando:"+numl);
                                break;
                                
                            case "3":
                                JOptionPane.showMessageDialog(null,"recebendo chamada :"+getNumero());
                                break;
                        }  
        
        public void aparelho(){
        setModelo(JOptionPane.showInputDialog("Informe o modelo do celular:"));
        setCor(JOptionPane.showInputDialog("Informe a cor do celular:"));
        setNumero(JOptionPane.showInputDialog("Informe o numero do celular:"));
    } 
    public void caracteristicas(){
        String caract= String.format("Modelo: "+super.getModelo()+" Cor: "+super.getCor()+"número:"+super.getNumero()+"imei:"+imei);
        JOptionPane.showMessageDialog(null,caract);
    }
}
    

