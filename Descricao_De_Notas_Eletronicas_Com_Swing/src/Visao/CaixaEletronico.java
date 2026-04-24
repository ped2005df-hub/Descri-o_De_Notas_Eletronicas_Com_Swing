package Visao;

import javax.swing.*;

import Metodo.CalcularNotas;

public class CaixaEletronico extends JFrame {

    public CaixaEletronico() {
        setTitle("Caixa Eletronico");
        setSize(400,340);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        
        JLabel label = new JLabel("Digite o Valor:");
        label.setBounds(20,20,200,25);
        add(label);
        
        JTextField campoValor = new JTextField();
        campoValor.setBounds(20,50,200,25);
        add(campoValor);
        
        JButton botao = new JButton();
        botao.setText("APLICAR");
        botao.setBounds(20,90,100,30);
        add(botao);
        
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setBounds(20,130,250,80);
        add(resultadoArea);
        
        CalcularNotas service = new CalcularNotas();
        
        botao.addActionListener(e -> {
            try {
                int valor = Integer.parseInt(campoValor.getText());
                String resultado = service.Desenvolvimento(valor);
                resultadoArea.setText(resultado);
            } catch (Exception ex) {
                resultadoArea.setText("Digite um numero Valido!");
            }
        });
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new CaixaEletronico();
    }
}
