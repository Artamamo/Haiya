import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

public class tetrisEdit extends Panel {
    Dimension size = new Dimension(400,300 );
    MainWin parent;

    tetrisEdit(MainWin p)
    {
        parent = p;

        this.setSize(size);
        this.setBackground(Color.red);
        this.setVisible(true);
    }
}
