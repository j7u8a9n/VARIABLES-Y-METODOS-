public class Padre extends Abuelo{
    String ci;
    public Padre(String nombre, String apellido, String segundoApellido, String ci) {
        super(nombre, apellido, segundoApellido);
        this.ci = ci;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;

    }

    @Override
    public String toString() {
        return "Padre{" +
                "ci='" + ci + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                '}';
    }
}

