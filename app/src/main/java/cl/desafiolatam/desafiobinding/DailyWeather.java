package cl.desafiolatam.desafiobinding;

public class DailyWeather {
    protected String ciudad;
    protected String fecha;
    protected int imagen;
    protected String temperatura;
    protected String unidad;
    protected int imagenManana;
    protected String climaManana;

    public DailyWeather(String ciudad, String fecha, int imagen, String temperatura, String unidad, int imagenManana, String climaManana) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.imagen = imagen;
        this.temperatura = temperatura;
        this.unidad = unidad;
        this.imagenManana = imagenManana;
        this.climaManana = climaManana;
    }

    public int getImagenManana() {
        return imagenManana;
    }

    public void setImagenManana(int imagenManana) {
        this.imagenManana = imagenManana;
    }

    public String getClimaManana() {
        return climaManana;
    }

    public void setClimaManana(String climaManana) {
        this.climaManana = climaManana;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
