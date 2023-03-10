package ejercicios.ejercicio2;

public class Libro {
    public String titulo;
    public String autor;
    public int numeroDeEjemplares;
    public int numeroDeEjemplaresPrestados;

    public Libro () {
        // ? Constructor por Defecto
    }

    public Libro (String titulo, String autor, int numeroDeEjemplares, int numeroDeEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    public boolean prestar() {
        boolean state = true;

        if (numeroDeEjemplares > 0) {
            numeroDeEjemplares--; numeroDeEjemplaresPrestados++;
        } else {
            state = false;
        } return state;
    }

    public boolean devolver() {
        boolean state = true;

        if (numeroDeEjemplaresPrestados > 0) {
            numeroDeEjemplaresPrestados--; numeroDeEjemplares++;
        } else {
            state = false;
        } return state;
    }
}
