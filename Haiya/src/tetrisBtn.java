import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class tetrisBtn extends Button {

    tetrisMenu parent;
    String label;

    tetrisBtn(tetrisMenu p)
    {
        super();
        parent = p;
        this.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                doSomething();
            }
        });
    }
    public void doSomething(){}
}
