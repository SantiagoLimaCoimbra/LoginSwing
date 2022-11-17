import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.LabelView;

public class Gui{

    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        //Usuário
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        //Senha
        JLabel userPasswordLabel = new JLabel("Senha:");
        userPasswordLabel.setBounds(10, 50, 80, 25);
        panel.add(userPasswordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        //Botão de entrar
        JButton button = new JButton("Entrar");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);


        frame.setVisible(true);
        
    }
}