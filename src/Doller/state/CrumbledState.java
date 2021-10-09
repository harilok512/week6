package Doller.state;

public class CrumbledState implements State {

    Dollar dollar;
    public CrumbledState(Dollar dollar) {
        this.dollar = dollar;
    }

    @Override
    public void foldedDollar() {
        System.out.println("Dollar note is very delicate");
        dollar.setState(dollar.getTornState());
    }

    @Override
    public void tornDollar() {
        System.out.println("A dollar note can easily can be crumbled");
        dollar.setState(dollar.getFoldedState());
    }

    @Override
    public void crumbledDollar() {
        System.out.println("Dollar is a currency");
    }

    @Override
    public void destroyDollar() {
        System.out.println("dollar can be crumbled");
        dollar.setState(dollar.getDestroyState());
    }


}