public class tetris {

    private String name="Tetrismaker";
    private String version="0.1";
    public  MainWin mainWin;

    public void setTitle(String title)
    {
    }

    tetris()
    {
        mainWin=new MainWin(this);
        //mainWin.setVisible(true);
    }
}
