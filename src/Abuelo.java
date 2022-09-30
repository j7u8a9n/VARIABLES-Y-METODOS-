public class Abuelo {
    String nombre;
    String Apellido;
    String segundoApellido;

    public Abuelo(String nombre, String apellido, String segundoApellido) {
        this.nombre = nombre;
        Apellido = apellido;
        this.segundoApellido = segundoApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String toString() {
        return "Abuelo{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                '}';
    }
}
