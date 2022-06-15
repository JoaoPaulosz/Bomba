package AtividadeExceccoes;

import AtividadeExceccoes.Exceptions.*;
import java.util.Scanner;

public class Jogo {
    private boolean vivo = true;

    public boolean isVivo() {
        return vivo;
    }

    private int acertos  =0;

    public Jogo() {
    }

    private void Desarmando(Player p, Bomba b) {
            try {
            p.Desarme(b);
            acertos++;
            if (acertos == 2){
                System.out.println("Parabéns voce concluio o desarme");
                vivo = false;
            }
        }catch (ExplosionException e) {
            int numRandom = e.getNumeroDesarm();
            System.out.println(numRandom + " BOOOOM!!!!!, a bomba explodiu 'YOU LOSE' ");
            vivo = false;
        }catch (ArrayIndexOutOfBoundsException e){
            vivo = false;
        }catch (FioErradoException e){
            System.out.println("Nao existe fio para o numero selecionado");
            vivo = false;
        }
        }
        public static void main(String[] args) {
        Jogo j = new Jogo();
        while(j.isVivo()) {
            int[] numeroDisarm = new int[7];
            for (int i = 1; i < numeroDisarm.length; i++) {
                numeroDisarm[i] = (int) (1 + (Math.random() * 10));
            }
            Bomba b = new Bomba();
            Scanner sc = new Scanner(System.in);
            System.out.println("Escolha um numero de 1 a 6");
            int num = sc.nextInt();
            b.setFio(num);
            try{
                b.setNumeroDesarm(numeroDisarm[b.getFio()]);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Nao existe fio para o numero selecionado");
                break;
            }
            j.Desarmando(new Player(), b);
        }
    }
}
