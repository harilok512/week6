package Doller.state;

public class Main {

    public static void main(String[] args) {

        DollarBuilder doller=new DollarBuilder();
        Dollar dollers=doller.Paper().Print().Cutting().build();


        dollers.foldedDollar();

        dollers.destroyDollar();

        dollers.crumbledDollar();

        dollers.tornDollar();

        dollers.foldedDollar();



    }

}


