package AtividadeExceccoes.Exceptions;

public class FiosException extends Exception{
    private int fioSelecionado;
    public FiosException(int fios){
        this.fioSelecionado = fios;
    }

    public int getFioSelecionado(){
        return fioSelecionado;
    }
}
