package  TESTE;
public class Cafeteria {
    public Cafeteria(){ }
    private void serveCliente(personagem p,Cafe c) {
        try{
            p.tomarCafe(c); //o cliente toma o cafe
            System.out.println("O café esta ótimo!");
        }catch (frioException e) { //se estiver mto frio
            int temperatura = e.getTemperatura();
            System.out.println("O café esta muito frio! "+
                    temperatura + " graus Celsius.");
            e.printStackTrace();
        }catch (muitoQuenteException e) { //se estiver mto quente
            int temperatura = e.getTemperatura();
            System.out.println("O café esta muito quente! "+
                    temperatura + " graus Celsius.");
            e.printStackTrace();
        }finally{ //independente da reação do cliente
            System.out.println("Sirva outra xícara como cortesia.");
        }
    }
    public static void main(String []args){
        Cafe cafe = new Cafe();
        cafe.setTemperatura(70);
        new Cafeteria().serveCliente(new personagem(),cafe);
    }//main
}//classe

