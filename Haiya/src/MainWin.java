import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class MainWin extends JFrame
{
    tetris parent;
    Dimension size=new Dimension(800,600);
    public tetrisMenu tetrismenu;
    public tetrisEdit tetrisedit;
    public tetrisGameplay tetrisgameplay;
    public tetrisStatic tetrisstatic;

    GridBagConstraints c;
    MainWin(tetris p)
    {
        parent = p;

        this.setSize(size);
        tetrismenu = new tetrisMenu(this);
        tetrisedit = new tetrisEdit(this);
        tetrisgameplay = new tetrisGameplay(this);
        tetrisstatic = new tetrisStatic(this);

        this.setLayout(new GridBagLayout());
        //-------------------------------------
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        this.add(tetrismenu,c);
        //-------------------------------------
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 1;
        c.gridy = 1;
        c.gridheight =4;
        c.gridwidth = 3;
        this.add(tetrisedit,c);
        //-------------------------------------
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 2;
        c.gridy = 2;
        c.gridheight =4;
        c.gridwidth = 3;
        this.add(tetrisgameplay,c);
        //-------------------------------------
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 3;
        c.gridy = 3;
        c.gridheight =4;
        c.gridwidth = 3;
        this.add(tetrisstatic,c);
        //-------------------------------------

        this.addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}
