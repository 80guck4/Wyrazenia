package Wyjątki;

public class BrakWartości extends RuntimeException {
    public BrakWartości(String message) {
        super(message);
    }
}
