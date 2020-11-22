public class Tester extends Empleado{
  public Tester(){
    set_especialidad("Tester");
    set_salario( nomina.Pagar( get_especialidad() ) );
  }

  public String toString(){
    String oldStr = super.toString();
    return oldStr + " Probando El Programa : )";
  }
}

class Test{
  public static void main( String[] args ){
    LiderDeProyecto ldp = new LiderDeProyecto();
    Administrador adm = new Administrador();
    Disenador des = new Disenador();
    Desarrollador dev = new Desarrollador();
    Tester test = new Tester();

    System.out.println(ldp);
    System.out.println(adm);
    System.out.println(des);
    System.out.println(dev);
    System.out.println(test);
  }
}
