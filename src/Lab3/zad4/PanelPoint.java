package Lab3.zad4;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.*;
import java.util.ArrayList;

public class PanelPoint extends JScrollPane implements Observer {
    private JTextArea textArea = new JTextArea();

    public PanelPoint() {
        this.setBackground(new Color(255, 255, 255, 255));
        this.setLocation(600, 355);
        this.setSize(300, 600);
        this.textArea.setSize(300, 600);
        this.textArea.setLocation(0, 0);
        this.add(this.textArea);
    }

    public void update(Object object) {
        this.textArea.setText(getCoordinateList(object));
    }

    public String getCoordinateList(Object object){
        ArrayList<PanelCoordinate> clicks = (ArrayList<PanelCoordinate>) object;
        String text = "Kordynaty: \n";
        for (PanelCoordinate c : clicks)
            text += (c.toString() + "\n");
        return text;
    }
}
