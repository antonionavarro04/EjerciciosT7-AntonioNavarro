package ejercicios.ejercicio4;

public class Articulo {
    public String nombre;
    public float precio;
    public float iva;
    public int cuantosQuedan;

    public Articulo (String nombre, float precio, float iva, int cuantosQuedan) {
        if (nombre.isBlank()) {
            System.err.println("El nombre no puede estar en blanco");
        } else {
            this.nombre = nombre;
        }

        if (precio <= 0.0f) {
            System.err.println("El precio no puede ser menor a 0");
        } else {
            this.precio = precio;
        }

        if (iva != 21.0f) {
            System.err.println("El IVA aplicable debe ser del 21%");
        } else {
            this.iva = iva;
        }

        if (cuantosQuedan < 0) {
            System.err.println("No puedes tener menos de 0 existencias");
        } else {
            this.cuantosQuedan = cuantosQuedan;
        }
    }

    public String toString() {
        return "Nombre: " + nombre + "\nPrecio: " + precio + "\nIVA: " + iva + "\nUnidades Disponibles: " + cuantosQuedan;
    }

    public float getPVP() {
        return precio * (iva / 100.0f + 1);
    }

    public float getPVPDescuento(float descuento) {
        return precio * (iva / 100.0f + 1) * (descuento / 100.0f + 1);
    }

    public boolean vender(int cantidad) {
        boolean state = true;

        if (cuantosQuedan - cantidad >= 0) {
            cuantosQuedan -= cantidad;
        } else {
            state = false;
        } return state;
    }

    public void almacenar(int cantidad) {
        cuantosQuedan += cantidad;
    }
}
