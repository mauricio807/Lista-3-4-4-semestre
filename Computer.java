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
public class Computer extends UtilizaTelecom Implements Interface {
    public void ligar(){
        setativo(true);
    }
    public void desligar(){
        setativo(false);
    }
    public void funcoes(){
    String inic=JOptionPane.showInputDialog("aperte 1 para proseguir");
                  if (liga!=null){
                        ligar();
                        System.out.println(isOn());
                    if (ativo()==true){
                        do{
                        String messagePC= String.format("Informe o numero correspondente a operação que deseja realizar que deseja realizar:\n 1-mandar mensagem\n 2-Ver configurações do computador\n 3-Sair");
                        String escolhaPC=JOptionPane.showInputDialog(messagePC);
                        switch(escolhaPC){
                            case "1":
                                String nome= JOptionPane.showInputDialog("Informe para qual pessoa deseja mandar mensagem:");
                                mandarmensage();
                                JOptionPane.showMessageDialog(null,"A mensagem: "+mensage+" enviada para a pessoa: "+nome+" foi enviada com sucesso!");
                                break;

                            case "2":
                                configuracoes();
                                break;
                            case "3":
                                JOptionPane.showMessageDialog(null,"Saindo!");
                                desliga();
                                break;
                        }
                          
                    }
}
    } 
    public void utzcomputer{
        super.setModelo(JOptionPane.showInputDialog("digite o modelo do computador:"));
        super.setCor(JOptionPane.showInputDialog("digite a cor do computador:"));
    }
    public void caracteristicas(){
        String config = String.format("Modelo: "+super.getModelo()+" Cor: "+super.getCor());
        JOptionPane.showMessageDialog(null,caract);
    
}
