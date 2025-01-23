package Wartości;

public class Fałsz implements Wartość{
    @Override
    public boolean wartość() {
        return false;
    }

    @Override
    public String toString() {
        return "Falsz";
    }
}
