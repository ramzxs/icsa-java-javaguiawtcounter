import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyApp {
    static int currentValue = 0;

    public static void main(String[] args) {
        Frame frameMain = new Frame();
        frameMain.setTitle("My Java GUI AWT Counter");
        frameMain.setSize(600, 400);
        frameMain.setResizable(false);

        BoxLayout boxLayout = new BoxLayout(frameMain, BoxLayout.Y_AXIS);
        frameMain.setLayout(boxLayout);


        Label lblAppTitle = new Label("My GUI AWT Counter");
        lblAppTitle.setAlignment(Label.CENTER);
        Font font1 = new Font("Arial", Font.BOLD, 32);
        lblAppTitle.setFont(font1);
        frameMain.add(lblAppTitle);


        TextField txtCounter = new TextField("0", 32);
        txtCounter.setEditable(false);
        txtCounter.setBackground(Color.YELLOW);
        Font font2 = new Font("Arial", Font.BOLD, 75);
        txtCounter.setFont(font2);
        frameMain.add(txtCounter);

        Button btnCount = new Button("Count");
        Font font3 = new Font("Arial", Font.PLAIN, 24);
        btnCount.setFont(font3);
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentValue++;

                txtCounter.setText(
                        String.valueOf(currentValue)
                );
            }
        });
        frameMain.add(btnCount);

        Button btnReset = new Button("Reset");
        btnReset.setFont(font3);
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentValue = 0;

                txtCounter.setText("0");
            }
        });
        frameMain.add(btnReset);

        frameMain.setVisible(true);
        frameMain.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        super.windowClosed(e);

                        System.exit(0);
                    }
                }
        );
    }
}


/*
String currentText = txtCounter.getText();        // Get current value (currentText = "1")
int currentValue = Integer.parseInt(currentText); // Convert it to integer (currentValue = 1)
currentValue = currentValue + 1;                  // Add 1 to it (0 + 1 = 1)
*/