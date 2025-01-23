package Wyrażenia;

import Wartości.*;
import Wyjątki.*;

public class Neg extends OperatorJednoArg {
    public Neg(Formuła arg){
        super(arg);
    }
    public Wartość wartość(Wartościowanie w)throws BrakWartości, ZłaNazwaWDaj {
        Wartość v = argument.wartość(w);
        return v.wartość() ? new Fałsz() : new Prawda();
    }

    @Override
    public String toString() {
        return "neg(" + argument + ")";
    }
}
