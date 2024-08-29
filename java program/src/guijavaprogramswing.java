import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guijavaprogramswing {
    public static void main(String[] args) {
        // to create a frame using swing in java
        JFrame frame = new JFrame("BMI Calculator");

        JLabel heightlabel = new JLabel("Enter your height");
        JLabel weightlabel = new JLabel("Enter your weight");
        JLabel callabel = new JLabel();

        JTextField weightfield = new JTextField();
        JTextField heightfield = new JTextField();

        JButton bmibutton = new JButton("Calculate BMI");
        // to set size and position of UI components
        heightlabel.setBounds(80, 30, 120, 40);
        heightfield.setBounds(150, 100, 50,80);
        weightlabel.setBounds(60, 120, 60, 120);
        weightfield.setBounds(150, 100, 70, 40);
        // to attach label to frame
        frame.add(heightlabel);
        frame.add(heightfield);
        frame.add(weightlabel);
        frame.add(weightfield);
        frame.add(bmibutton);

        frame.setLayout(null);
        frame.setSize(300, 400);
        frame.setVisible(true);

        // to click on button
        bmibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to apply bmi formula
                float weight = Float.parseFloat(weightfield.getText().toString());
                float height = Float.parseFloat(heightfield.getText().toString());

                float output = weight/(height*height);

            }
        });

    }
}
