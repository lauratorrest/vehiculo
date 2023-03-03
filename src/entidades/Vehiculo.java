package entidades;

public abstract class Vehiculo{
    private final String marca;
    private final String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void Acelerar(){
        System.out.print("\nAcelerando");
    }
    public void Frenar(){
        System.out.print("\nFrenando");
    }
    public void inicarMarcha(){
        System.out.print("\nIniciando marcha");
    }
}
