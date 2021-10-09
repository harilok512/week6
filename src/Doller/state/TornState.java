package Doller.state;

public class TornState implements State {

    Dollar dollar;
    public TornState(Dollar dollar) {
        this.dollar = dollar;
    }

    @Override
    public void foldedDollar() {
        System.out.println("Dollars are a form of financial exchange");

    }

    @Override
    public void tornDollar() {
        System.out.println("Dollars are made of paper so are also easily crumbled");
        dollar.setState(dollar.getFoldedState());

    }

    @Override
    public void crumbledDollar() {
        System.out.println("crumbled Dollar");
        dollar.setState(dollar.getCrumbledState());
    }

    @Override
    public void destroyDollar() {
        System.out.println("Dollar can be destroyed by tearing it apart");
        dollar.setState(dollar.getDestroyState());
    }

}