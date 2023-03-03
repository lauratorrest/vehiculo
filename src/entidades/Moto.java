package entidades;

public class Moto extends Vehiculo{
    private String cilindraje;
    private String esElectrica;

    public Moto(String marca, String modelo, String cilindraje, String esElectrica) {
        super(marca, modelo);
        this.cilindraje = cilindraje;
        this.esElectrica = esElectrica;
    }

    public void Accionar(){
        System.out.print("\nAccionando moto");
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public String getEsElectrica() {
        return esElectrica;
    }

    public void mostrarDatos(Moto moto1){
        System.out.println(
                "\nMarca: "+moto1.getMarca()
                        +"\nModelo: "+moto1.getModelo()
                        +"\nCilindraje: "+moto1.getCilindraje()
                        +"\nElectrica: "+moto1.getEsElectrica()
        );
    }
}
