public class Muro {
    private double ancho;
    private double alto;

    @Override
    public String toString() {
        return "Muro{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }

    public Muro() {
    }

    public Muro(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        if (ancho < 0) {
            this.ancho = 0;
        }
        if (alto < 0) {
            this.alto = 0;
        }
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAncho(double ancho) {
        if (ancho < 0) {
            this.ancho = 0;
        }
    }

    public void setAlto(double alto) {
        if(alto < 0) {
            this.alto = 0;
        }
    }

    public double getArea() {
        return alto*ancho;
    }
}
