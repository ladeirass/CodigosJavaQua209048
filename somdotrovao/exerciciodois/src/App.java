import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
     
        SomTrovao som = new SomTrovao();

        JOptionPane.showMessageDialog(null,
                       "A distância aproximadamente é: "+som.calcularDistancia());

        Pessoa p = new Pessoa();
        String nome =JOptionPane.showInputDialog(null,
           "Qual o seu nome?");

        p.setNome(nome);

        JOptionPane.showMessageDialog(null,
                 p.verificarNome(),
                 "Senai Tagua" ,
                 JOptionPane.INFORMATION_MESSAGE);



    }
}
