public class Administrador extends Empleado{
  public Administrador(){
    set_especialidad( "Administrador" );
    set_salario( nomina.Pagar( get_especialidad() ) );
  }

  public String toString(){
    String oldStr = super.toString();
    return oldStr + " Administrando recursos...";
  }
}
