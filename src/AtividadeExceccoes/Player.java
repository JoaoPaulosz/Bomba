package AtividadeExceccoes;

import AtividadeExceccoes.Exceptions.*;
public class Player {
    public void Desarme(Bomba b) throws ExplosionException{
        int numDesarm = b.getNumeroDesarm();
        if((numDesarm % 2) != 0){
            throw new ExplosionException(numDesarm);
        }
    }
}
