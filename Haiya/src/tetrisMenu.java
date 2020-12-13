import java.awt.*;
import java.awt.event.*;

public class tetrisMenu extends Panel{
    MainWin parent;

    tetrisClear clear;
    tetrisUndo  undo;
    tetrisRedo  redo;
    tetrisPlay  play;

    tetrisMenu(MainWin p)
    {
        parent = p;

        this.setBackground((Color.yellow));

        clear   = new tetrisClear(this);
        undo    = new tetrisUndo(this);
        redo    = new tetrisRedo(this);
        play    = new tetrisPlay(this);

        this.setLayout(new FlowLayout());
        this.add(clear);
        this.add(undo);
        this.add(redo);
        this.add(play);
    }
}
