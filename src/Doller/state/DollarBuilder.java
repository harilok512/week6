package Doller.state;

public class DollarBuilder implements Builder{

    DollarBuilder(){

    }

    @Override
    public Builder Paper() {
        System.out.println("A dollar note is made of paper");
        return this;
    }

    @Override
    public Builder Print() {
        System.out.println("Stamping must be done");
        return this;
    }

    @Override
    public Builder Cutting() {
        System.out.println("After printing the paper it is considered as a dollar");
        return this;
    }

    @Override
    public Dollar build() {
        Dollar s=new Dollar();
        System.out.println("A dollar is printed!");
        return s;
    }
}