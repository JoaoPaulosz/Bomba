package AtividadeExceccoes;

import AtividadeExceccoes.Exceptions.*;
public class Player {
    public void Desarme(Bomba b) throws ExplosionException, FioErradoException{
        int numDesarm = b.getNumeroDesarm();
        if((numDesarm % 2) != 0 || numDesarm == 9){
            throw new ExplosionException(numDesarm);
        }
        int fioSelecionado = b.getFio();
        if(fioSelecionado == 0){
            throw new FioErradoException(fioSelecionado);
        }
    }
}
