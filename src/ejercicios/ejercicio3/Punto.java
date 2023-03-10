package ejercicios.ejercicio3;

public class Punto {
    public int x, y;

    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String imprime() {
        String s = ("[" + x + " : " + y + "]");
        return s;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desplaza(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double distancia(Punto p) {
        double distancia = Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
        return distancia;
    }
}
