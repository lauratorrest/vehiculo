package entidades;

public class Bicicleta extends Vehiculo{
    private String tipo_llanta;
    private String tamano;
    private String cambios;

    public Bicicleta(String marca, String modelo, String tipo_llanta, String tamano, String cambios) {
        super(marca, modelo);
        this.tipo_llanta = tipo_llanta;
        this.tamano = tamano;
        this.cambios = cambios;
    }

    public String getTipo_llanta() {
        return tipo_llanta;
    }

    public String getTamano() {
        return tamano;
    }

    public String getCambios() {
        return cambios;
    }

    public void Accionar(){
        System.out.print("\nAccionando bicicleta");
    }

    public void mostrarDatos(Bicicleta bici1){
        System.out.println(
                "\nMarca: "+bici1.getMarca()
                        +"\nModelo: "+bici1.getModelo()
                        +"\nTipo llantas: "+bici1.getTipo_llanta()
                        +"\nTamañao: "+bici1.getTamano()
                        +"\nCambios: "+bici1.getCambios()
        );
    }
}
