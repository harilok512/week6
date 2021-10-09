package Doller.state;


public class Dollar
{
    FoldedState foldedState;
    CrumbledState crumbledState;
    TornState tornState;
    DestroyState destroyState;
    State state;

    Dollar()
    {
        foldedState = new FoldedState(this);
        crumbledState= new CrumbledState(this);
        destroyState = new DestroyState(this);
        tornState=new TornState(this);
        state=tornState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public FoldedState getFoldedState() {
        return foldedState;
    }

    public CrumbledState getCrumbledState() {
        return crumbledState;
    }

    public TornState getTornState() {
        return tornState;
    }

    public DestroyState getDestroyState() {
        return destroyState;
    }

    public void foldedDollar()  {
        state.foldedDollar();
    }

    public void tornDollar()  {
        state.tornDollar();
    }

    public void crumbledDollar() {
        state.crumbledDollar();
    }
    public void destroyDollar() {
        state.destroyDollar();
    }


}
