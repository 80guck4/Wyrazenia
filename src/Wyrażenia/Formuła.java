package Wyrażenia;

import Wartości.Wartość;
import Wyjątki.*;

public abstract class Formuła {
    public abstract Wartość wartość(Wartościowanie w) throws BrakWartości, ZłaNazwaWDaj;
    public abstract String toString();
}
