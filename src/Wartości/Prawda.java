package Wartości;

public class Prawda implements Wartość {
    @Override
    public boolean wartość() {
        return true;
    }

    @Override
    public String toString() {
        return "Prawda";
    }
}
