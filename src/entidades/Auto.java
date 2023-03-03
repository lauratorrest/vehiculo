package entidades;

public class Auto extends Vehiculo{
    private String puertas;
    private String motor;

    public Auto(String marca, String modelo, String puertas, String motor) {
        super(marca, modelo);
        this.puertas = puertas;
        this.motor = motor;
    }

    public String getPuertas() {
        return puertas;
    }

    public String getMotor() {
        return motor;
    }

    public void Accionar(){
        System.out.print("\nAccionando auto");
    }

    public void mostrarDatos(Auto auto1){
        System.out.println(
                "\nMarca: "+auto1.getMarca()
                        +"\nModelo: "+auto1.getModelo()
                        +"\nPuertas: "+auto1.getPuertas()
                        +"\nMotor: "+auto1.getMotor()
        );
    }
}
