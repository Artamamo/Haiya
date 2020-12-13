public class tetrisUndo extends tetrisBtn{


    tetrisUndo(tetrisMenu p)
    {
        super(p);
        this.label = "Undo";
        this.setLabel(label);
    }

    public void doSomething(){

        this.parent.undo.setEnabled(true);


    }
}
