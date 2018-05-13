package estudiantes;

public class Estudiantes {
    private String nombre;
    private String apellido;
    private String Cedula;
    private String[] Materias;

    public String[] getMaterias() {
        return Materias;
    }

    public void setMaterias(String[] Materias) {
        this.Materias = Materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }


    public Estudiantes(String nombre, String apellido, String Cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Cedula = Cedula;

    }
}