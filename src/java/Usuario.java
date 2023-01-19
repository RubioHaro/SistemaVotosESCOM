public class Usuario {
    private String Nombre;
    private String Email;
    private int Boleta;
    private String Sexo;

    public Usuario(String Nombre, String Email, int Boleta) {
        this.Nombre = Nombre;
        this.Email = Email;
        this.Boleta = Boleta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getBoleta() {
        return Boleta;
    }

    public void setBoleta(int Boleta) {
        this.Boleta = Boleta;
    }

    @Override
    public String toString() {
        return "User{" + "Nombre=" + Nombre + ", Email=" + Email + ", Boleta=" + Boleta + '}';
    }
}
