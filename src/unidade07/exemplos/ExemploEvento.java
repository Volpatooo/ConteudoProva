package unidade07.exemplos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploEvento {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Evento");
        JButton botao = new JButton("Clique aqui");

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Botão clicado!");
            }
        });

        frame.add(botao);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
