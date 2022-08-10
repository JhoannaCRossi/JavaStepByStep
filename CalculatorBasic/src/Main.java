import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame frame = new Calculator();
                frame.setSize(300,300);
                frame.setVisible(true);

            }
        });
    }
}
