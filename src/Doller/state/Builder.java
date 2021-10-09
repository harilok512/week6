package Doller.state;

public interface Builder {
    Builder Paper();
    Builder Print();
    Builder Cutting();
    Dollar build();
}