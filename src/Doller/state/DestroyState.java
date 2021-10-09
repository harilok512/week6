package Doller.state;

public class DestroyState implements State {

    Dollar dollar;
    public DestroyState(Dollar dollar) {
        this.dollar = dollar;
    }

    @Override
    public void foldedDollar() {
        System.out.println("Dollar can be exchanged");
        dollar.setState(dollar.getTornState());
    }

    @Override
    public void tornDollar() {
        System.out.println("Dollars are a used as the means to buy or sell");
    }

    @Override
    public void crumbledDollar() {
        System.out.println("Dollars are the measure of wealth");

    }

    @Override
    public void destroyDollar() {
        System.out.println("A torn note is worthless");

    }


}