package TESTE;

class personagem {
    private static final int frio = 65;
    private static final int quente = 85;
    public void tomarCafe(Cafe c) throws frioException,
            muitoQuenteException {
        int temperatura = c.getTemperatura();
        if (temperatura <= frio) {
            throw new frioException(temperatura);
        }
        else if (temperatura >= quente) {
            throw new muitoQuenteException(temperatura);
        }
    }
}
