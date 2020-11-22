public class LiderDeProyecto extends Empleado{
  public LiderDeProyecto(){
    set_especialidad( "LiderDeProyecto" );
    set_salario( nomina.Pagar( get_especialidad() ) );
  }

  public String toString(){
    String oldStr = super.toString();
    return oldStr + " Liderando proyecto...";
  }
}
