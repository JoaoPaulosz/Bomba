package AtividadeExceccoes;

import AtividadeExceccoes.Exceptions.*;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Jogo {
    private boolean vivo = true;
    private int acertos  =0;
    public Jogo() {
    }

    private void Desarmando(Player p, Bomba b) {
        while (vivo) {
        try {
            p.Desarme(b);
            int[] numeroDisarm = new int[7];
            for (int i = 1; i < numeroDisarm.length; i++) {
                numeroDisarm[i] = (int) (1 + (Math.random() * 10));
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Escolha um numero de 1 a 6");
            int num = sc.nextInt();
            b.setNumeroDesarm(numeroDisarm[num]);
            acertos++;
            if (acertos == 2){
                System.out.println("Parabéns voce concluio o desarme");
                break;
            }
        }catch (ExplosionException e) {
            int numRandom = e.getNumeroDesarm();
            System.out.println(numRandom + " BOOOOM!!!!!, a bomba explodiu 'YOU LOSE' ");
            vivo = false;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Numero selecionado incorreto");
        }
        }
    }
        public static void main(String[] args) {
        Bomba b = new Bomba();
        new Jogo().Desarmando(new Player(), b);
    }
}
