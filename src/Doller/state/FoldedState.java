package Doller.state;

public class FoldedState implements State{

    Dollar dollar;
    public FoldedState(Dollar dollar) {
        this.dollar = dollar;
    }

    @Override
    public void foldedDollar() {
        System.out.println("Dollars are usually are kept folded");
        dollar.setState(dollar.getTornState());

    }

    @Override
    public void tornDollar() {
        System.out.println("A single fold is the most used form of maintaining in pockets");
    }

    @Override
    public void crumbledDollar() {
        System.out.println("A torn dollar is worthless");
        dollar.setState(dollar.getCrumbledState());
    }

    @Override
    public void destroyDollar() {
        System.out.println("Dollar Destroyed");
        dollar.setState(dollar.getDestroyState());
    }


}
