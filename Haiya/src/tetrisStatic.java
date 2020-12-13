import javax.swing.*;
import java.awt.*;

public class tetrisStatic extends JPanel {
    MainWin parent;
    Dimension size = new Dimension(400, 300);
    tetrisStatic(MainWin p)
    {
        parent = p;

        this.setSize(size);
        this.setBackground(Color.blue);
        this.setVisible(true);
    }
}
