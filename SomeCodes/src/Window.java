import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by Himasha De Silva on 12/30/2016.
 */

public class Window extends JFrame {

    private JSlider slider;
    private DrawOval myPanel;

    public Window(){
        super("Change the size");
        myPanel = new DrawOval();
        myPanel.setBackground(Color.cyan);

        slider = new JSlider(SwingConstants.HORIZONTAL,0,200,10);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);

        slider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        myPanel.setD(slider.getValue());
                    }
                }
        );

        add(slider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }


}
