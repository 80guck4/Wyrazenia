import Wartości.Wartość;
import Wyjątki.BrakWartości;
import Wyjątki.ZłaNazwaWDaj;
import Wyjątki.ZłaNazwaWUstaw;
import Wyrażenia.Wartościowanie;

public class Zmienna {
    private char nazwa;

    public Zmienna(char c) {
        if (!Character.isLowerCase(c)) {
            throw new IllegalArgumentException("zmienna musi byc mala litera");
        }
        nazwa = c;
    }

    public Wartość wartość(Wartościowanie w ) throws BrakWartości, ZłaNazwaWDaj, ZłaNazwaWUstaw {
        return w.daj(nazwa);
    }

    public String toString() {
        return String.valueOf(nazwa);
    }
}
