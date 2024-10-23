public class Casa extends Vivienda
{
    protected int pisos ;
    protected int patios ;

    public Casa ( int antiguedad, String direccion, int cantidadPersonas, int pisos, int patios ){
        super(antiguedad, direccion, cantidadPersonas) ;
        this.pisos = pisos ;
        this.patios = patios ;
    }
    public void MuestraCasa (){
        super.imprime () ;
        System.out.println ( "La casa tiene " + pisos + "pisos y " + patios + "patios." ) ;
    }  
}