import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Style {

    public Style(){

        Frame frame = new Frame("BECKY");


        Color c = new Color(13, 186, 177);
        Color a = new Color(220, 220, 220);
        Color d = new Color(0, 0, 153);
        frame.setBackground(Color.LIGHT_GRAY);

        Label label = new Label("BECKY", Label.CENTER);
        label.setBounds(10, 10, 1550, 70);
        label.setForeground(Color.black);
        label.setBackground(c);
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        String labelText = label.getText();

        TextField textField = new TextField("Enter a message.....");
        textField.setBackground(a);
        textField.setForeground(Color.DARK_GRAY);
        textField.setBounds(20, 800, 1350, 40);

        Button button = new Button("Send");

        button.setBackground(d);
        button.setForeground(Color.white);
        button.setBounds(1400, 800, 100, 40);

        frame.add(textField);
        frame.add(button);
        frame.add(label);

        frame.setSize(1600, 1500);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }

    public static void main(String[] args){

        new Style();
    }

}
