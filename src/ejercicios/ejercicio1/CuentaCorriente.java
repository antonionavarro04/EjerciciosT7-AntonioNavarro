package ejercicios.ejercicio1;

public class CuentaCorriente {
    public String DNI;
    public String nombre;
    public float saldo;

    public CuentaCorriente (String DNI, float saldo) {
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public CuentaCorriente (String DNI, String nombre, float saldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public boolean sacarDinero(float cantidad) {
        boolean state = true;

        if (saldo - cantidad < 0) {
            state = false;
        } else {
            saldo -= cantidad;
        }

        return state;
    }

    public void ingresarDinero(float cantidad) {
        saldo += cantidad;
    }

    public String mostrarInformacion() {
        String s = "DNI: " + DNI + "\nNombre: " + nombre + "\nSaldo: " + saldo;
        return s;
    }
}
