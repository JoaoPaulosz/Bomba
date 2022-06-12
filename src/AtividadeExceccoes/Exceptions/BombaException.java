package AtividadeExceccoes.Exceptions;

abstract class BombaException extends Exception{
    private int numeroDesarm;
    public BombaException(int numero)
    {
        this.numeroDesarm = numero;
    }
    public int getNumeroDesarm()
    {
        return numeroDesarm;
    }
}
