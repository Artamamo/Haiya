public class tetrisRedo extends tetrisBtn{

    tetrisRedo(tetrisMenu p)
    {
        super(p);
        this.label = "Redo";
        this.setLabel(label);
    }

    public void doSomething(){

        this.parent.redo.setEnabled(true);

    }
}
