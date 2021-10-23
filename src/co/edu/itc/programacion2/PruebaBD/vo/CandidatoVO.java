package co.edu.itc.programacion2.PruebaBD.vo;

public class CandidatoVO {

    private Integer codigoCandidato;
    private String nombre;
    private String apellidos;
    private String nombreAcudiente;
    private String telefonoAcudiente;
    private String gradoAIngresar;

    public CandidatoVO() {
    }

    public CandidatoVO(Integer codigoCandidato, String nombre, String apellidos, String nombreAcudiente, String telefonoAcudiente, String gradoAIngresar) {
        this.codigoCandidato = codigoCandidato;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreAcudiente = nombreAcudiente;
        this.telefonoAcudiente = telefonoAcudiente;
        this.gradoAIngresar = gradoAIngresar;
    }

    public Integer getCodigoCandidato() {
        return codigoCandidato;
    }

    public void setCodigoCandidato(Integer codigoCandidato) {
        this.codigoCandidato = codigoCandidato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getTelefonoAcudiente() {
        return telefonoAcudiente;
    }

    public void setTelefonoAcudiente(String telefonoAcudiente) {
        this.telefonoAcudiente = telefonoAcudiente;
    }

    public String getGradoAIngresar() {
        return gradoAIngresar;
    }

    public void setGradoAIngresar(String gradoAIngresar) {
        this.gradoAIngresar = gradoAIngresar;
    }

    @Override
    public String toString() {
        return "CandidatoVO{" + "codigoCandidato=" + codigoCandidato + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nombreAcudiente=" + nombreAcudiente + ", telefonoAcudiente=" + telefonoAcudiente + ", gradoAIngresar=" + gradoAIngresar + '}';
    }

    

}
