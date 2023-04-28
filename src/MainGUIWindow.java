import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener{
    private JPanel mainPanel;
    private JTextField enterYourNameTextField;
    private JButton enterButton;
    private JTextField textField1;
    private JTextArea textArea1;

    public MainGUIWindow(){
        createUIComponent();
    }

    private void createUIComponent(){
        setContentPane(mainPanel);
        setTitle("My GUI!");
        setSize(300, 400);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textArea1.setLineWrap(true);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textArea1
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
