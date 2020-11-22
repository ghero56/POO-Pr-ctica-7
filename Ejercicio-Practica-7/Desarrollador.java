public class Desarrollador extends Empleado{
  public Desarrollador(){
    set_especialidad( "Desarrollador" );
    set_salario( nomina.Pagar( get_especialidad() ) );
  }

  public String toString(){
    String oldStr = super.toString();
    return oldStr + " Desarrollando codigo...";
  }
}
