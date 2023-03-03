import entidades.Auto;
import entidades.Bicicleta;
import entidades.Moto;
import entidades.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Mitsubishi","2014","4","No");
        Bicicleta bici1 = new Bicicleta("****","2015","****","1 metro","3");
        Auto auto1 = new Auto("Renault","2009","4","****");

        moto1.mostrarDatos(moto1);
        bici1.mostrarDatos(bici1);
        auto1.mostrarDatos(auto1);


        moto1.Accionar();
        bici1.Accionar();
        auto1.Accionar();


        moto1.inicarMarcha();
        moto1.Acelerar();
        moto1.Frenar();
    }
}