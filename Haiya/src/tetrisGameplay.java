import java.awt.*;

public class tetrisGameplay extends Panel {
    MainWin parent;
    Dimension size = new Dimension(400,300 );
    tetrisGameplay(MainWin p)
    {
        parent = p;

        this.setSize(size);
        this.setBackground(Color.green);
        this.setVisible(true);
    }
}
