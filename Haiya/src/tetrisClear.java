public class tetrisClear extends tetrisBtn{

    tetrisClear(tetrisMenu p)
    {
        super(p);

        this.label = "Clear" ;
        this.setLabel(label);
    }

    public void doSomething()
    {
        System.exit(0);
    }
}
