import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Currency;

public class currencyconvertor {
    public static void main(String[] args) {
        CurrencyConvertor();
    }
    public static void CurrencyConvertor(){

        JFrame frame = new JFrame("Currency Convertor");

        JLabel rupeelabel = new JLabel("Enter amount in INR");
        JLabel dollarlabel = new JLabel("Enter amount in USD");
        JLabel convertorlabel = new JLabel();

        JTextField rupeefield = new JTextField();
        JTextField dollarfield = new JTextField();

        JButton convertorbutton = new JButton("Convert Currency");

        rupeelabel.setBounds(50, 100, 120, 150);
        dollarlabel.setBounds(50, 100, 150, 200);
        rupeefield.setBounds(150, 200, 50, 100);
        dollarfield.setBounds(150, 200, 50, 100);
        convertorbutton.setBounds(200, 200, 60, 120);

        frame.add(rupeefield);
        frame.add(rupeelabel);
        frame.add(dollarfield);
        frame.add(dollarlabel);
        frame.add(convertorbutton);

        frame.setLayout(null);
        frame.setSize(250, 500);
        frame.setVisible(true);

        convertorbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }
}
