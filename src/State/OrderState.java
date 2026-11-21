package State;

public interface OrderState {
    void shipped();
    void delivered();
    void created();
    void canceled();
    void returned();
    void paid();
}