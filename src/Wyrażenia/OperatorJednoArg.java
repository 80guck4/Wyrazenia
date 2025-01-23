package Wyrażenia;

public abstract class OperatorJednoArg extends Formuła{
    protected Formuła argument;

    OperatorJednoArg(Formuła arg){
        argument = arg;
    }
}
