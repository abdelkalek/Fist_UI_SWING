import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class UI_Text_Sempler_Demo extends JFrame {
    private JTextField Txt_1;
    private JPasswordField Txt_password;
    private JFormattedTextField Txt_Formmat;
    private JTextArea Txt_Area1;
    private JPanel MainPanel;
    private JTextPane textPane1;
    private JEditorPane editorPane1;
    private JLabel Lbl_Text;


    public UI_Text_Sempler_Demo()
    {
        setContentPane(MainPanel);
        setTitle("First java swing ui");
        setResizable(false);
        setVisible(true);
        pack();
        Txt_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
             Lbl_Text.setText("You Typed "+Txt_1.getText());
            }
        });
    }
    public static void main(String[] args) {
        UI_Text_Sempler_Demo ui = new UI_Text_Sempler_Demo(); }
}
