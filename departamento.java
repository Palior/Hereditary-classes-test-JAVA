public class Departamento extends Vivienda
{
    protected int numeroDepto ;
    protected int terrazas ;

    public Departamento (int antiguedad, String direccion, int cantidadPersonas, int numeroDepto, int terrazas ){
        Super (antiguedad, direccion, cantidadPersonas) ;
        this.numeroDepto = numeroDepto ;
        this.terrazas = terrazas ;
    }
    public void MuestraDepto (){
    super.imprime () ;
    System.out.println ("El departamento es el numero " + numeroDepto + "y tiene " + terrazas + "terrazas." ) ;
    }
}