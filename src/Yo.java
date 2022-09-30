public class Yo extends  Padre{
    int celular ;
    public Yo(String nombre, String apellido, String segundoApellido, String ci, int celular) {
        super(nombre, apellido, segundoApellido, ci);
        this.celular = celular;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Yo{" +
                "celular=" + celular +
                ", ci='" + ci + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                '}';
    }
}
