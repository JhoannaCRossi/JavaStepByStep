import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private double total = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    private JTextField txtDisplay;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton clearButton1;
    private JButton equal;
    private JButton button1;
    private JPanel panel;

    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total = total + Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
    }
    public Calculator(){
        super("Calculator");
        setContentPane(panel);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnOneText = txtDisplay.getText() + a1Button.getText();
                txtDisplay.setText(btnOneText);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnTwoText = txtDisplay.getText() + a2Button.getText();
                txtDisplay.setText(btnTwoText);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnThreeText = txtDisplay.getText() + a3Button.getText();
                txtDisplay.setText(btnThreeText);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFourText = txtDisplay.getText() + a4Button.getText();
                txtDisplay.setText(btnFourText);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFiveText = txtDisplay.getText() + a5Button.getText();
                txtDisplay.setText(btnFiveText);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSixText = txtDisplay.getText() + a6Button.getText();
                txtDisplay.setText(btnSixText);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSevenText = txtDisplay.getText() + a7Button.getText();
                txtDisplay.setText(btnSevenText);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnEightText = txtDisplay.getText() + a8Button.getText();
                txtDisplay.setText(btnEightText);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNineText = txtDisplay.getText() + a9Button.getText();
                txtDisplay.setText(btnNineText);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnZeroText = txtDisplay.getText() + a0Button.getText();
                txtDisplay.setText(btnZeroText);
            }
        });
        clearButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2 = 0;
                txtDisplay.setText("");
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               String button_text = button13.getText();
               getOperator(button_text);
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnDotText = txtDisplay.getText() + button12.getText();
                txtDisplay.setText(btnDotText);
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = button14.getText();
                getOperator(button_text);
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = button11.getText();
                getOperator(button_text);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = button1.getText();
                getOperator(button_text);
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
              switch (math_operator){
                  case '+':
                      total2 = total + Double.parseDouble(txtDisplay.getText());
                      break;
                  case '-':
                      total2 = total - Double.parseDouble(txtDisplay.getText());
                      break;
                  case '/':
                      total2 = total / Double.parseDouble(txtDisplay.getText());
                      break;
                  case '*':
                      total2 = total * Double.parseDouble(txtDisplay.getText());
                      break;
              }
              txtDisplay.setText(Double.toString(total2));
              total=0;
            }
        });
    }
}
