package TESTE;

abstract class TemperaturaException extends Exception {
    private int temperatura; // Celsius
    public TemperaturaException(int temperatura) {
        this.temperatura = temperatura;
    }
    public int getTemperatura() {
        return temperatura;
    }
    }
