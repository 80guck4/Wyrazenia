package Wyrażenia;

import Wartości.Wartość;
import Wyjątki.BrakWartości;
import Wyjątki.ZłaNazwaWUstaw;

import java.util.Optional;

public class Wartościowanie {
    private Wartość[] wartości = new Wartość[26];
    public Wartościowanie() {

    }

    public void ustaw(char zmienna, Wartość wartość)throws ZłaNazwaWUstaw {
        if (!Character.isLowerCase(zmienna)) {
            throw new ZłaNazwaWUstaw("Niepoprawna nazwa!");
        }

        // przypisanie wartosci pod index
        // np. [0] => a
        // [1] => b
        // tablica ascii
        wartości[zmienna - 'a'] = wartość;
    }

    public Wartość daj(char nazwa) throws ZłaNazwaWUstaw, BrakWartości {
        if (!Character.isLowerCase(nazwa)) {
            throw new ZłaNazwaWUstaw("Niepoprawna nazwa!");
        }
        Optional<Wartość> w = Optional.ofNullable(wartości[nazwa - 'a']);
        if (w.isEmpty()) {
            throw new BrakWartości("Brak wartosci");
        } else {
            return w.get();
        }
    }
}