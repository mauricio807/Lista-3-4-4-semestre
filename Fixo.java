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
public class Fixo extends UtilizaTelecom{
    
    public void criarTelefoneFixo(){
        setModelo(JOptionPane.showInputDialog("Digite o modelo do celular:"));
        setCor(JOptionPane.showInputDialog("Digite a cor do celular:"));
        setNumero(JOptionPane.showInputDialog("Digite o numero do celular:"));   
        }
    public void liga(){
        setativo(true);
    }
    public void desliga(){
        setativo(false);  
    }
    public void funcoes(){
        String ligarTel=JOptionPane.showInputDialog("aperte 1 para proseguir");
                    if (ligarTel!=null){
                        liga();
                    if (isOn()==true){
                        do{
                        String messg= String.format("Informe o numero correspondente a operação que deseja realizar que deseja realizar:\n 1-Fazer ligacao\n 2-receber ligacao\n 3-Ver configuracoes do telefonen 4-sair");
                        String escolhaPC=JOptionPane.showInputDialog(messagePC);
                            switch(seleção){
                                case "1":
                                    String nl= JOptionPane.showInputDialog("Digite para qual número deseja ligar:");
                                    JOptionPane.showMessageDialog(null,"Ligando para o número:"+nl);
                                break;
                                case "2":
                                    JOptionPane.showMessageDialog(null,"O número:"+getNumero()+"Está ligando!");
                                break;
                                case "3":
                               caracteristicas();
                               break
    
}
