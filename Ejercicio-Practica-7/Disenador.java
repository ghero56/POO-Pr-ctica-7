public class Disenador extends Empleado{
  public Disenador(){
    set_especialidad( "Disenador" );
    set_salario( nomina.Pagar( get_especialidad() ) );
  }

  public String toString(){
    String oldStr = super.toString();
    return oldStr + " Diseñando el proyecto...";
  }
}
