public class Carro {
    private String marca;
    private String modelo;
    private int anio;

    private boolean fueModificado;

    public Carro(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void acelerar() {

    }

    public void frenar() {

    }

    public boolean tieneGarantia(){
        boolean tiempoDeCompraMenorDe3anios = false;
        boolean noHaSidoVendido = false;
        if(tiempoDeCompraMenorDe3anios && noHaSidoVendido && !this.fueModificado){
            return true; // Si tiene garantía
        } else {
            return false; // No tiene garantía;
        }
    }

    public void revision(){
    }

    public String getMarca(){
        return this.marca;
    }
}
