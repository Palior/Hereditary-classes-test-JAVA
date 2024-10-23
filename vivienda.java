public class Vivienda
{
    protected int aniosAntiguedad ;
    protected String direccion ;
    protected int cantidadPersonas ;
    public Vivienda ( int antiguedad, String direccion, int cantidadPersonas ){
        this.aniosAntiguedad = aniosAntiguedad ;
        this.direccion = direccion ;
        this.cantidadPersonas = cantidadPersonas ;
    }
    public void imprime () {
        System.out.println ( "La vivienda tiene " + aniosAntiguedad + "anios de antiguedad," +
        "está ubicada en " + direccion + "y viven " + cantidadPersonas + "personas." ) ;
    }
}